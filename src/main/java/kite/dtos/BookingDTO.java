package kite.dtos;

import java.util.Date;

public class BookingDTO {
    private long userId;
    private long propertyId;
    private Date startDateTimeInclusive;
    private Date endDateTimeExclusive;

    public long getUserId() {
        return userId;
    }

    public void setUserId(long userId) {
        this.userId = userId;
    }

    public long getPropertyId() {
        return propertyId;
    }

    public void setPropertyId(long propertyId) {
        this.propertyId = propertyId;
    }

    public Date getStartDateTimeInclusive() {
        return startDateTimeInclusive;
    }

    public void setStartDateTimeInclusive(Date startDateTimeInclusive) {
        this.startDateTimeInclusive = startDateTimeInclusive;
    }

    public Date getEndDateTimeExclusive() {
        return endDateTimeExclusive;
    }

    public void setEndDateTimeExclusive(Date endDateTimeExclusive) {
        this.endDateTimeExclusive = endDateTimeExclusive;
    }
}
