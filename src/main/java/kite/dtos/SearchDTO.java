package kite.dtos;

import java.util.Date;

public class SearchDTO {
    private Date startDateTimeInclusive;
    private Date endDateTimeInclusive;
    private int minCapacity;

    public Date getStartDateTimeInclusive() {
        return startDateTimeInclusive;
    }

    public void setStartDateTimeInclusive(Date startDateTimeInclusive) {
        this.startDateTimeInclusive = startDateTimeInclusive;
    }

    public Date getEndDateTimeInclusive() {
        return endDateTimeInclusive;
    }

    public void setEndDateTimeInclusive(Date endDateTimeInclusive) {
        this.endDateTimeInclusive = endDateTimeInclusive;
    }

    public int getMinCapacity() {
        return minCapacity;
    }

    public void setMinCapacity(int minCapacity) {
        this.minCapacity = minCapacity;
    }
}
