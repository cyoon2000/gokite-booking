package kite.beans;


import kite.enums.OccupancyTimePeriod;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name="occupancy")
public class Occupancy extends BaseBean {
    @ManyToOne(cascade={CascadeType.ALL})
    @JoinColumn(name="property")
    Property property;

    @Column(nullable = false)
    private int startDateTimeInclusive;

    @Column(nullable = false)
    private int endDateTimeExclusive;


    @Column(nullable = false)
    @Enumerated(EnumType.STRING)
    private OccupancyTimePeriod timePeriod;

    public Property getProperty() {
        return property;
    }

    public void setProperty(Property property) {
        this.property = property;
    }

    public int getStartDateTimeInclusive() {
        return startDateTimeInclusive;
    }

    public void setStartDateTimeInclusive(int startDateTimeInclusive) {
        this.startDateTimeInclusive = startDateTimeInclusive;
    }

    public int getEndDateTimeExclusive() {
        return endDateTimeExclusive;
    }

    public void setEndDateTimeExclusive(int endDateTimeExclusive) {
        this.endDateTimeExclusive = endDateTimeExclusive;
    }

    public OccupancyTimePeriod getTimePeriod() {
        return timePeriod;
    }

    public void setTimePeriod(OccupancyTimePeriod timePeriod) {
        this.timePeriod = timePeriod;
    }
}
