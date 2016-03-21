package kite.controllers;

import kite.beans.Property;
import kite.dao.PropertyDAO;
import kite.google_calendar.GoogleCalendarService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.io.IOException;

@Controller
@RequestMapping(value = "/occupancy", produces = "application/json", consumes = "application/json")
@SuppressWarnings("unused")
public class OccupancyController {

    @Autowired
    private PropertyDAO propertyDAO;
    @Autowired
    private GoogleCalendarService googleCalendarService;

    @RequestMapping(value = "/refresh/{id}", method = RequestMethod.POST)
    public @ResponseBody
    void refreshForProperty(@PathVariable Long id) {
        Property property = propertyDAO.getById(id);
        if (property == null) {
            throw new RuntimeException("Property not found " + id);
        }
        try {
            googleCalendarService.refreshOccupancyFromCalendar(property);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

}
