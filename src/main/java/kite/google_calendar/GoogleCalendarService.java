package kite.google_calendar;

import com.google.api.client.auth.oauth2.Credential;
import com.google.api.client.googleapis.auth.oauth2.GoogleCredential;
import com.google.api.client.googleapis.javanet.GoogleNetHttpTransport;
import com.google.api.client.http.javanet.NetHttpTransport;
import com.google.api.client.json.JsonFactory;
import com.google.api.client.json.jackson2.JacksonFactory;
import com.google.api.client.util.DateTime;
import com.google.api.services.calendar.Calendar;
import com.google.api.services.calendar.CalendarScopes;
import com.google.api.services.calendar.model.CalendarListEntry;
import com.google.api.services.calendar.model.Event;
import com.google.api.services.calendar.model.EventDateTime;
import com.google.api.services.calendar.model.Events;
import kite.beans.Occupancy;
import kite.beans.Property;
import kite.dao.OccupancyDAO;
import kite.enums.OccupancyTimePeriod;
import kite.utils.DateUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.io.IOException;
import java.io.InputStream;
import java.security.GeneralSecurityException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Date;
import java.util.List;

@Service
public class GoogleCalendarService {

    private final static String APPLICATION_NAME = "GoKiteBaja";
    private final static String SECRETS_FILE = "GoKiteBaja-de5e96da93f8.json";
    private static final JsonFactory JSON_FACTORY = JacksonFactory.getDefaultInstance();

    @Autowired
    private OccupancyDAO occupancyDAO;

    public static void main(String[] args) throws IOException {
        GoogleCalendarService me = new GoogleCalendarService();

//        me.addEventTomorrow();
        List<String> calendarIds = me.getAllCalendarIds();
        for (String calendarId : calendarIds) {
            List<Event> allEvents = me.getAllEventsInCalendar(calendarId, null);
            int i = 0;
            for (Event event : allEvents) {
                DateTime[] startEndTimes = getStartAndEndTimeFromEvent(event);
                System.out.printf("\t%d) %s (%s - %s)\n", ++i, event.getSummary(),
                        DateUtils.toDateNumber(startEndTimes[0].getValue()),
                        DateUtils.toDateNumber(startEndTimes[1].getValue()));
            }
        }
    }

    private static DateTime[] getStartAndEndTimeFromEvent(Event event) {
        DateTime start = event.getStart().getDateTime();
        if (start == null) {
            start = event.getStart().getDate();
        }
        DateTime end = event.getEnd().getDateTime();
        if (end == null) {
            end = event.getEnd().getDate();
        }
        return new DateTime[]{start, end};
    }

    public void refreshOccupancyFromCalendar(Property property) throws IOException {
        if (property.getGoogleCalendarId() == null) {
            return;
        }
        List<Event> events = getAllEventsInCalendar(property.getGoogleCalendarId(), null);
        occupancyDAO.deleteForProperty(property);
        for (Event event : events) {
            DateTime[] startEndTimes = getStartAndEndTimeFromEvent(event);
            Occupancy occupancy = new Occupancy();
            occupancy.setCreationDate(new Date());
            occupancy.setModifiedDate(new Date());
            occupancy.setProperty(property);
            occupancy.setStartDateTimeInclusive(DateUtils.toDateNumber(startEndTimes[0].getValue()));
            occupancy.setEndDateTimeExclusive(DateUtils.toDateNumber(startEndTimes[1].getValue()));
            occupancy.setTimePeriod(OccupancyTimePeriod.DAY);
            occupancyDAO.create(occupancy);
        }
    }

    @SuppressWarnings("unused")
    private  void addEventTomorrow() throws IOException{
        Calendar service = getService();
        Event event = new Event();
        event.setSummary("whatev");
        event.setStart(new EventDateTime()
                .setDateTime(new DateTime("2016-04-11T09:00:00-07:00"))
                .setTimeZone("America/Los_Angeles"));
        event.setEnd(new EventDateTime()
                .setDateTime(new DateTime("2016-04-11T09:00:00-07:00"))
                .setTimeZone("America/Los_Angeles"));

        Event retEvent = service.events()
                .insert("gokitebaja.com_f91mukgd6ihnb69hu5rrr6ph6k@group.calendar.google.com", event)
                .execute();
        System.out.printf("Added Event: %s\n", retEvent.getHtmlLink());
    }

    public List<String> getAllCalendarIds() throws IOException {
        Calendar service = getService();

        List<String> ret = new ArrayList<>();
        List<CalendarListEntry> calendarLists = service.calendarList().list().execute().getItems();
        System.out.println("numCalendars = " + calendarLists.size());
        for (CalendarListEntry entry : calendarLists) {
            System.out.printf("CALENDAR: %s access(%s)\n", entry.getId(), entry.getAccessRole());
            ret.add(entry.getId());
        }
        return ret;
    }



    public List<Event> getAllEventsInCalendar(String calendarId, DateTime starting) throws IOException {
        Calendar service = getService();

        List<Event> ret = new ArrayList<>();

        if (starting == null) {
            starting = new DateTime(new Date(0L));
        }
        Calendar.Events.List listRequest = service.events().list(calendarId)
                .setMaxResults(1000) // Limit each response to 1000 events
                .setPageToken(null)  // Start with the first page of results
                        // Return an individual event for each instance occurrence of a
                        // recurring event
                .setTimeMin(starting)
                .setSingleEvents(true);
        do {
            // Retrieve one page of events
            Events events = listRequest.execute();
            ret.addAll(events.getItems());

            listRequest.setPageToken(events.getNextPageToken());

            // Stop when all results have been retrieved
        } while (listRequest.getPageToken() != null);

        return ret;
    }



    private Calendar getService()  {
        InputStream stream = GoogleCalendarService.class.getClassLoader().getResourceAsStream(SECRETS_FILE);
        Credential credential;
        try {
            credential = GoogleCredential.fromStream(stream)
                    .createScoped(Collections.singleton(CalendarScopes.CALENDAR));
            NetHttpTransport httpTransport = GoogleNetHttpTransport.newTrustedTransport();
            return new Calendar.Builder(httpTransport, JSON_FACTORY, credential)
                    .setApplicationName(APPLICATION_NAME)
                    .build();
        } catch (IOException|GeneralSecurityException e) {
            throw new RuntimeException(e);
        }

    }

}
