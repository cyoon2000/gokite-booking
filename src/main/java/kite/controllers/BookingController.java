package kite.controllers;

import kite.beans.Booking;
import kite.dtos.BookingDTO;
import kite.services.BookingDAO;
import kite.services.PropertyDAO;
import kite.services.UserDAO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.Date;

@Controller
@RequestMapping(value = "/booking", produces = "application/json", consumes = "application/json")
@SuppressWarnings("unused")
public class BookingController {

    @Autowired
    private BookingDAO bookingDAO;
    @Autowired
    private PropertyDAO propertyDAO;
    @Autowired
    private UserDAO userDAO;

    @RequestMapping(value = "", method = RequestMethod.POST)
    public @ResponseBody
    long createBooking(@RequestBody BookingDTO dto) {
        Booking booking = new Booking();
        booking.setCreationDate(new Date());
        booking.setModifiedDate(new Date());
        booking.setProperty(propertyDAO.getById(dto.getPropertyId()));
        booking.setUser(userDAO.getById(dto.getUserId()));
        booking.setStartDateTimeInclusive(dto.getStartDateTimeInclusive());
        booking.setEndDateTimeInclusive(dto.getEndDateTimeInclusive());
        return bookingDAO.create(booking);
    }

}
