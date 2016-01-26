package kite.beans;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name="booking")
public class Booking extends BaseBean {
    @ManyToOne(cascade={CascadeType.ALL})
    @JoinColumn(name="user")
    User user;

    @ManyToOne(cascade={CascadeType.ALL})
    @JoinColumn(name="property")
    Property property;

    @Temporal(TemporalType.TIMESTAMP)
    private Date startDateTimeInclusive;

    @Temporal(TemporalType.TIMESTAMP)
    private Date endDateTimeInclusive;


    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

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

    public Date getEndDateTimeInclusive() {
        return endDateTimeInclusive;
    }

    public void setEndDateTimeInclusive(Date endDateTimeInclusive) {
        this.endDateTimeInclusive = endDateTimeInclusive;
    }
}
