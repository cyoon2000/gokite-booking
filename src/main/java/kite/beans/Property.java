package kite.beans;

import javax.persistence.*;
import java.util.Date;
import java.util.List;

@Entity
@Table(name="property")
public class Property extends BaseBean {
    @Column(length = 255, nullable = false)
    String title;

    @Column(nullable = false)
    @Enumerated(EnumType.STRING)
    PropertyType propertyType;

    @ManyToOne(cascade = {CascadeType.ALL})
    @JoinColumn(name = "parentProperty")
    Property parentProperty;

    @Embedded
    Location location;

    @OneToOne
    @JoinColumn(name = "profilePhoto")
    Photo profilePhoto;

    @OneToMany(mappedBy = "property", fetch=FetchType.EAGER)
    List<Photo> photos;

    @Column
    private Integer numBedroom;

    @Column
    private Integer capacity;

    @Column
    private Integer minimumStay;

    @Column
    private Integer extraPersonCharge;

//    @OneToMany(mappedBy = "property", cascade = CascadeType.ALL)
//    private List<PropertyAmenity> propertyAmenityList;

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public PropertyType getPropertyType() {
        return propertyType;
    }

    public void setPropertyType(PropertyType propertyType) {
        this.propertyType = propertyType;
    }

    public Property getParentProperty() {
        return parentProperty;
    }

    public void setParentProperty(Property parentProperty) {
        this.parentProperty = parentProperty;
    }

    public Location getLocation() {
        return location;
    }

    public void setLocation(Location location) {
        this.location = location;
    }

    public Photo getProfilePhoto() {
        return profilePhoto;
    }

    public void setProfilePhoto(Photo profilePhoto) {
        this.profilePhoto = profilePhoto;
    }

    public List<Photo> getPhotos() {
        return photos;
    }

    public void setPhotos(List<Photo> photos) {
        this.photos = photos;
    }

    public Integer getNumBedroom() {
        return numBedroom;
    }

    public void setNumBedroom(Integer numBedroom) {
        this.numBedroom = numBedroom;
    }

    public Integer getCapacity() {
        return capacity;
    }

    public void setCapacity(Integer capacity) {
        this.capacity = capacity;
    }

    public Integer getMinimumStay() {
        return minimumStay;
    }

    public void setMinimumStay(Integer minimumStay) {
        this.minimumStay = minimumStay;
    }

    public Integer getExtraPersonCharge() {
        return extraPersonCharge;
    }

    public void setExtraPersonCharge(Integer extraPersonCharge) {
        this.extraPersonCharge = extraPersonCharge;
    }

//    public List<PropertyAmenity> getPropertyAmenityList() {
//        return propertyAmenityList;
//    }
//
//    public void setPropertyAmenityList(List<PropertyAmenity> propertyAmenityList) {
//        this.propertyAmenityList = propertyAmenityList;
//    }
}
