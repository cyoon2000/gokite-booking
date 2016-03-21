package kite.dao;

import kite.beans.Booking;
import org.springframework.stereotype.Repository;

@Repository
public class BookingDAO extends BaseDAO<Booking> {

    public BookingDAO() {
        super(Booking.class);
    }

}
