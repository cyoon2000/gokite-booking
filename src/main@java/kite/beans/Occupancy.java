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

    @Temporal(TemporalType.TIMESTAMP)
    private Date startDateTimeInclusive;

    @Temporal(TemporalType.TIMESTAMP)
    private Date endDateTimeExclusive;


    @Column(nullable = false)
    @Enumerated(EnumType.STRING)
    private OccupancyTimePeriod timePeriod;

    public Property getProperty() {
        return property;
    }

    public void setProperty(Property property) {
        this.property = property;
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

    public OccupancyTimePeriod getTimePeriod() {
        return timePeriod;
    }

    public void setTimePeriod(OccupancyTimePeriod timePeriod) {
        this.timePeriod = timePeriod;
    }
}
