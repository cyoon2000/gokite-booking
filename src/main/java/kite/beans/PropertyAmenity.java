package kite.beans;


import javax.persistence.*;

@Entity
@Table(name="propertyAmenity")
public class PropertyAmenity extends BaseBean {
    @ManyToOne(cascade={CascadeType.ALL})
    @JoinColumn(name="property")
    Property property;

    @Column(nullable = false)
    @Enumerated(EnumType.STRING)
    AmenityEnum amenityEnum;

    public Property getProperty() {
        return property;
    }

    public void setProperty(Property property) {
        this.property = property;
    }

    public AmenityEnum getAmenityEnum() {
        return amenityEnum;
    }

    public void setAmenityEnum(AmenityEnum amenityEnum) {
        this.amenityEnum = amenityEnum;
    }
}
