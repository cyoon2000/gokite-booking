package kite.models;

import kite.enums.AmenityType;

import java.util.List;

public class PropertyDetailModel extends PropertyBaseModel {

	// Property Details
	private String description;
	private List<PhotoModel> photos;
	private Integer weeklyRate;
	private Integer minimumStay;
	private Integer extraPersonCharge;
	private List<AmenityType> propertyAmenityList;

	// Booking
	private BookingModel bookingModel;

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public List<PhotoModel> getPhotos() {
		return photos;
	}

	public void setPhotos(List<PhotoModel> photos) {
		this.photos = photos;
	}

	public Integer getWeeklyRate() {
		return weeklyRate;
	}

	public void setWeeklyRate(Integer weeklyRate) {
		this.weeklyRate = weeklyRate;
	}

	public List<AmenityType> getPropertyAmenityList() {
		return propertyAmenityList;
	}

	public void setPropertyAmenityList(List<AmenityType> propertyAmenityList) {
		this.propertyAmenityList = propertyAmenityList;
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

	public BookingModel getBookingModel() {
		return bookingModel;
	}

	public void setBookingModel(BookingModel bookingModel) {
		this.bookingModel = bookingModel;
	}
}
