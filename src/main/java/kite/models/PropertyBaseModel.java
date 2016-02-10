package kite.models;

import kite.beans.PropertyType;

public class PropertyBaseModel {
	private Integer id;
	private String title;
	private PhotoModel profilePhoto;
	private PropertyType propertyType;
	private Integer numBedroom;
	private Integer capacity;
	private Integer price;
	private Boolean beachFront;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public PhotoModel getProfilePhoto() {
		return profilePhoto;
	}

	public void setProfilePhoto(PhotoModel profilePhoto) {
		this.profilePhoto = profilePhoto;
	}

	public PropertyType getPropertyType() {
		return propertyType;
	}

	public void setPropertyType(PropertyType propertyType) {
		this.propertyType = propertyType;
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

	public Integer getPrice() {
		return price;
	}

	public void setPrice(Integer price) {
		this.price = price;
	}

	public Boolean getBeachFront() {
		return beachFront;
	}

	public void setBeachFront(Boolean beachFront) {
		this.beachFront = beachFront;
	}
}
