package kite.beans;

import com.fasterxml.jackson.annotation.JsonIgnore;

import javax.persistence.*;


@Entity
@Table(name="photo")
public class Photo extends BaseBean {
    @ManyToOne(cascade={CascadeType.ALL})
    @JoinColumn(name="property")
    @JsonIgnore
    Property property;

    @Column
    private String thumbUrl;

    @Column
    private String photoUrl;


    public Property getProperty() {
        return property;
    }

    public void setProperty(Property property) {
        this.property = property;
    }

    public String getThumbUrl() {
        return thumbUrl;
    }

    public void setThumbUrl(String thumbUrl) {
        this.thumbUrl = thumbUrl;
    }

    public String getPhotoUrl() {
        return photoUrl;
    }

    public void setPhotoUrl(String photoUrl) {
        this.photoUrl = photoUrl;
    }
}
