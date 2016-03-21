package kite.beans;


import com.fasterxml.jackson.annotation.JsonIgnore;
import kite.enums.AmenityType;

import javax.persistence.*;

@Entity
@Table(name="propertyAmenity")
public class PropertyAmenity extends BaseBean {
    @ManyToOne(cascade={CascadeType.ALL})
    @JoinColumn(name="property")
    @JsonIgnore
    Property property;

    @Column(nullable = false)
    @Enumerated(EnumType.STRING)
    AmenityType amenity;

    public Property getProperty() {
        return property;
    }

    public void setProperty(Property property) {
        this.property = property;
    }

    public AmenityType getAmenity() {
        return amenity;
    }

    public void setAmenity(AmenityType amenity) {
        this.amenity = amenity;
    }
}
