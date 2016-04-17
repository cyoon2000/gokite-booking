package kite.controllers;

import kite.beans.PropertyType;
import kite.enums.AmenityType;
import kite.models.*;

import java.util.ArrayList;
import java.util.List;

public class PropertyUtil {

	public static String URL_BASE = "https://dl.dropboxusercontent.com/u/122147773/showcase/";

	public static String SEARCH_RESULT = URL_BASE + "search-result/";
	public static String SEARCH_RESULT_URL_1 = SEARCH_RESULT + "header-sleep-full-01.png";
	public static String SEARCH_RESULT_URL_1_2x = SEARCH_RESULT + "header-sleep-full-01@2x.png";
	public static String SEARCH_RESULT_URL_2 = SEARCH_RESULT + "header-sleep-full-02.png";
	public static String SEARCH_RESULT_URL_2_2x = SEARCH_RESULT + "header-sleep-full-02@2x.png";
	public static String SEARCH_RESULT_URL_3 = SEARCH_RESULT + "header-sleep-full-03.png";
	public static String SEARCH_RESULT_URL_3_2x = SEARCH_RESULT + "header-sleep-full-03@2x.png";
	public static String SEARCH_RESULT_URL_4 = SEARCH_RESULT + "header-sleep-full-04.png";
	public static String SEARCH_RESULT_URL_4_2x = SEARCH_RESULT + "header-sleep-full-04@2x.png";
	public static String SEARCH_RESULT_URL_5 = SEARCH_RESULT + "header-sleep-full-05.png";
	public static String SEARCH_RESULT_URL_5_2x = SEARCH_RESULT + "header-sleep-full-05@2x.png";
	public static String SEARCH_RESULT_URL_6 = SEARCH_RESULT + "header-sleep-full-06.png";
	public static String SEARCH_RESULT_URL_6_2x = SEARCH_RESULT + "header-sleep-full-06@2x.png";

	public static String SEARCH_RESULT_THUMB_URL_1 = SEARCH_RESULT + "thumbnail-sleep-full-01.png";
	public static String SEARCH_RESULT_THUMB_URL_1_2x = SEARCH_RESULT + "thumbnail-sleep-full-01@2x.png";
	public static String SEARCH_RESULT_THUMB_URL_2 = SEARCH_RESULT + "thumbnail-sleep-full-02.png";
	public static String SEARCH_RESULT_THUMB_URL_2_2x = SEARCH_RESULT + "thumbnail-sleep-full-02@2x.png";
	public static String SEARCH_RESULT_THUMB_URL_3 = SEARCH_RESULT + "thumbnail-sleep-full-03.png";
	public static String SEARCH_RESULT_THUMB_URL_3_2x = SEARCH_RESULT + "thumbnail-sleep-full-03@2x.png";
	public static String SEARCH_RESULT_THUMB_URL_4 = SEARCH_RESULT + "thumbnail-sleep-full-04.png";
	public static String SEARCH_RESULT_THUMB_URL_4_2x = SEARCH_RESULT + "thumbnail-sleep-full-04@2x.png";
	public static String SEARCH_RESULT_THUMB_URL_5 = SEARCH_RESULT + "thumbnail-sleep-full-05.png";
	public static String SEARCH_RESULT_THUMB_URL_5_2x = SEARCH_RESULT + "thumbnail-sleep-full-05@2x.png";
	public static String SEARCH_RESULT_THUMB_URL_6 = SEARCH_RESULT + "thumbnail-sleep-full-06.png";
	public static String SEARCH_RESULT_THUMB_URL_6_2x = SEARCH_RESULT + "thumbnail-sleep-full-06@2x.png";

	// ----------------------------------- ICON -----------------------------------
	public static String ICON = URL_BASE + "icon/";
	public static String URL_ICON_BEACHFRONT = ICON + "detailpage-icon-beachfront.png";
	public static String URL_ICON_BEACHFRONT_2X = ICON + "detailpage-icon-beachfront@2x.png";
	public static String URL_ICON_BEACHFRONT_3X = ICON + "detailpage-icon-beachfront@3x.svg";

	public static String URL_ICON_BEDROOM = ICON + "detailpage-icon-bedroom.png";
	public static String URL_ICON_BEDROOM_2X = ICON + "detailpage-icon-bedroom@2x.png";
	public static String URL_ICON_BEDROOM_3X = ICON + "detailpage-icon-bedroom@3x.svg";

	public static String URL_ICON_BEDS = ICON + "detailpage-icon-beds.png";
	public static String URL_ICON_BEDS_2X = ICON + "detailpage-icon-beds@2x.png";
	public static String URL_ICON_BEDS_3X = ICON + "detailpage-icon-beds@3x.svg";

	public static String URL_ICON_GUESTS = ICON + "detailpage-icon-guests.png";
	public static String URL_ICON_GUESTS_2X = ICON + "detailpage-icon-guests@2x.png";
	public static String URL_ICON_GUESTS_3X = ICON + "detailpage-icon-guests@3x.svg";

	public static String URL_ICON_HOUSE = ICON + "detailpage-icon-house.png";
	public static String URL_ICON_HOUSE_2X = ICON + "detailpage-icon-house@2x.png";
	public static String URL_ICON_HOUSE_3X = ICON + "detailpage-icon-house@3x.svg";

	public static String URL_ICON_ARROW = ICON + "homepage-icon-arrow.png";
	public static String URL_ICON_ARROW_2X = ICON + "homepage-icon-arrow@2x.png";
	public static String URL_ICON_ARROW_3X = ICON + "homepage-icon-arrow@3x.svg";

	public static String URL_BADGE_BEACHFRONT = ICON + "thumbnail-sleep-badge-beachfront.png";
	public static String URL_BADGE_BEACHFRONT_2X = ICON + "thumbnail-sleep-badge-beachfront@2x.png";
	public static String URL_BADGE_BEACHFRONT_3X = ICON + "thumbnail-sleep-badge-beachfront@3x.svg";

	// ----------------------------------- BACKGROUND HEADER -----------------------------------
	public static String BACKGROUND_HEADER = URL_BASE + "background-header/";

	public static String HEADER_HOME = BACKGROUND_HEADER + "background-home.png";
	public static String HEADER_HOME_2X = BACKGROUND_HEADER + "background-home@2x.png";

	public static String HEADER_EAT_NOT_CROPPED = BACKGROUND_HEADER + "background-eat-not-cropped.png";
	public static String HEADER_EAT_NOT_CROPPED_2X = BACKGROUND_HEADER + "background-eat-not-cropped@2x.png";
	public static String HEADER_EAT = BACKGROUND_HEADER + "background-eat.png";
	public static String HEADER_EAT_2X = BACKGROUND_HEADER + "background-eat@2x.png";

	public static String HEADER_KITE_NOT_CROPPED = BACKGROUND_HEADER + "background-kite-not-cropped.png";
	public static String HEADER_KITE_NOT_CROPPED_2X = BACKGROUND_HEADER + "background-kite-not-cropped@2x.png";
	public static String HEADER_KITE = BACKGROUND_HEADER + "background-kite.png";
	public static String HEADER_KITE_2X = BACKGROUND_HEADER + "background-kite@2x.png";

	public static String HEADER_PLAN_NOT_CROPPED = BACKGROUND_HEADER + "background-plan-not-cropped.png";
	public static String HEADER_PLAN_NOT_CROPPED_2X = BACKGROUND_HEADER + "background-plan-not-cropped@2x.png";
	public static String HEADER_PLAN = BACKGROUND_HEADER + "background-plan.png";
	public static String HEADER_PLAN_2X = BACKGROUND_HEADER + "background-plan@2x.png";

	public static String HEADER_SLEEP_NOT_CROPPED = BACKGROUND_HEADER + "background-sleep-not-cropped.png";
	public static String HEADER_SLEEP_NOT_CROPPED_2X = BACKGROUND_HEADER + "background-sleep-not-cropped@2x.png";
	public static String HEADER_SLEEP = BACKGROUND_HEADER + "background-sleep.png";
	public static String HEADER_SLEEP_2X = BACKGROUND_HEADER + "background-sleep@2x.png";

	// ----------------------------------- LOGO -----------------------------------
	public static String LOGO = URL_BASE + "logo/";

	public static String LOGO_BLACK = LOGO + "gokitebaja-logo-black.png";
	public static String LOGO_HEADER = LOGO + "gokitebaja-logo-header.png";
	public static String LOGO_HEADER_SVG = LOGO + "gokitebaja-logo-header.svg";
	public static String LOGO_HEADER_WHITE = LOGO + "gokitebaja-logo-white.png";
	public static String LOGO_HEADER_2X = LOGO + "gokitebaja-logo@2x-header.png";


	public static List<PropertyBaseModel> getSamplePropertySummaryModels () {
		// photos
		PhotoModel photo1 = new PhotoModel();
		photo1.setThumbUrl(SEARCH_RESULT_THUMB_URL_1);
		photo1.setThumbUrl2x(SEARCH_RESULT_THUMB_URL_1_2x);

		PhotoModel photo2 = new PhotoModel();
		photo2.setThumbUrl(SEARCH_RESULT_THUMB_URL_2);
		photo2.setThumbUrl2x(SEARCH_RESULT_THUMB_URL_2_2x);

		PhotoModel photo3 = new PhotoModel();
		photo3.setThumbUrl(SEARCH_RESULT_THUMB_URL_3);
		photo3.setThumbUrl2x(SEARCH_RESULT_THUMB_URL_3_2x);

		PhotoModel photo4 = new PhotoModel();
		photo4.setThumbUrl(SEARCH_RESULT_THUMB_URL_4);
		photo4.setThumbUrl2x(SEARCH_RESULT_THUMB_URL_4_2x);

		PhotoModel photo5 = new PhotoModel();
		photo5.setThumbUrl(SEARCH_RESULT_THUMB_URL_5);
		photo5.setThumbUrl2x(SEARCH_RESULT_THUMB_URL_5_2x);

		PhotoModel photo6 = new PhotoModel();
		photo6.setThumbUrl(SEARCH_RESULT_THUMB_URL_6);
		photo6.setThumbUrl2x(SEARCH_RESULT_THUMB_URL_6_2x);

		// propertyModels
		List<PropertyBaseModel> models = new ArrayList<>();

		PropertyBaseModel model1 = new PropertyBaseModel();
		model1.setId(10);
		model1.setProfilePhoto(photo1);
		model1.setTitle("Casa Paradiso");
		model1.setPropertyType(PropertyType.HOUSE);
		model1.setNumBedroom(3);
		model1.setCapacity(8);
		model1.setPrice(188);
		models.add(model1);

		PropertyBaseModel model2 = new PropertyBaseModel();
		model2.setId(20);
		model2.setProfilePhoto(photo2);
		model2.setTitle("Hotel Paradiso");
		model2.setPropertyType(PropertyType.ROOM);
		model2.setCapacity(2);
		model2.setPrice(120);
		model2.setBeachFront(true);
		models.add(model2);

		PropertyBaseModel model3 = new PropertyBaseModel();
		model3.setId(30);
		model3.setProfilePhoto(photo3);
		model3.setTitle("Casa Rosa");
		model3.setPropertyType(PropertyType.HOUSE);
		model3.setCapacity(2);
		model3.setPrice(95);
		model3.setBeachFront(true);
		models.add(model3);

		PropertyBaseModel model4 = new PropertyBaseModel();
		model4.setId(40);
		model4.setProfilePhoto(photo4);
		model4.setTitle("Hotel Amilia");
		model4.setPropertyType(PropertyType.ROOM);
		model4.setCapacity(2);
		model4.setPrice(75);
		models.add(model4);

		PropertyBaseModel model5 = new PropertyBaseModel();
		model5.setId(50);
		model5.setProfilePhoto(photo5);
		model5.setTitle("Casa Paradiso");
		model5.setPropertyType(PropertyType.HOUSE);
		model5.setNumBedroom(2);
		model5.setCapacity(4);
		model5.setPrice(155);
		model5.setBeachFront(true);
		models.add(model5);

		PropertyBaseModel model6 = new PropertyBaseModel();
		model6.setId(60);
		model6.setProfilePhoto(photo6);
		model6.setTitle("Casa Ciel");
		model6.setPropertyType(PropertyType.HOUSE);
		model6.setNumBedroom(1);
		model6.setCapacity(2);
		model6.setPrice(120);
		models.add(model6);

		return models;
	}


	public static PropertyDetailModel getSamplePropertyDetailModel () {

		// photos
		PhotoModel photo1 = new PhotoModel();
		photo1.setThumbUrl(SEARCH_RESULT_URL_1);
		photo1.setThumbUrl2x(SEARCH_RESULT_URL_1_2x);
		photo1.setPhotoUrl(SEARCH_RESULT_URL_1);
		photo1.setPhotoUrl2x(SEARCH_RESULT_URL_1_2x);

		PhotoModel photo2 = new PhotoModel();
		photo2.setThumbUrl(SEARCH_RESULT_URL_2);
		photo2.setThumbUrl2x(SEARCH_RESULT_URL_2_2x);

		PhotoModel photo3 = new PhotoModel();
		photo3.setThumbUrl(SEARCH_RESULT_URL_3);
		photo3.setThumbUrl2x(SEARCH_RESULT_URL_3_2x);

		PhotoModel photo4 = new PhotoModel();
		photo4.setThumbUrl(SEARCH_RESULT_URL_4);
		photo4.setThumbUrl2x(SEARCH_RESULT_URL_4_2x);

		PhotoModel photo5 = new PhotoModel();
		photo5.setThumbUrl(SEARCH_RESULT_URL_5);
		photo5.setThumbUrl2x(SEARCH_RESULT_URL_5_2x);

		PhotoModel photo6 = new PhotoModel();
		photo6.setThumbUrl(SEARCH_RESULT_URL_6);
		photo6.setThumbUrl2x(SEARCH_RESULT_URL_6_2x);

		// show 4 photos
		List<PhotoModel> photos = new ArrayList<>();
		photos.add(photo2);
		photos.add(photo3);
		photos.add(photo4);
		photos.add(photo5);

		PropertyDetailModel model = new PropertyDetailModel();
		model.setPhotos(photos);

		// Property attributes
		model.setId(10);
		model.setTitle("Casa Paradiso");
		model.setProfilePhoto(photo1);
		model.setPropertyType(PropertyType.HOUSE);
		model.setNumBedroom(3);
		model.setCapacity(8);
		model.setPrice(515);

		model.setDescription("Spectacular & Luxurious Brand New Upgraded 3-Story Home with Pool & Spa. 2 Master Suites in this 3 Bedroom, 3 Bath home with fully equipped kitchen.");
		model.setWeeklyRate(3600);
		model.setMinimumStay(7);
		model.setExtraPersonCharge(20);

		List<AmenityType> amenities = new ArrayList();
		amenities.add(AmenityType.BEACH_FRONT);
		amenities.add(AmenityType.FREE_BREAKFAST);
		amenities.add(AmenityType.WIFI);
		amenities.add(AmenityType.KITCHEN);
		amenities.add(AmenityType.AC);
		model.setPropertyAmenityList(amenities);

		// Booking
		BookingModel bookingModel = new BookingModel();

		bookingModel.setNumGuest(8);
		bookingModel.setCheckIn("3/20/2016");
		bookingModel.setCheckOut("3/26/2016");
		bookingModel.setNumNight(7);
		bookingModel.setPricePerNight(515);
		bookingModel.setTotalPrice(3600);
		model.setBookingModel(bookingModel);

		return model;
	}

	public static List<IconModel> getIcons() {
		IconModel icon1 = new IconModel();
		icon1.setText("BEACHFRONT");
		icon1.setPhotoUrl(URL_ICON_BEACHFRONT);
		icon1.setPhotoUrl2x(URL_ICON_BEACHFRONT_2X);
		icon1.setPhotoUrl3x(URL_ICON_BEACHFRONT_3X);

		IconModel icon2 = new IconModel();
		icon2.setText("ENTIRE HOUSE");
		icon2.setPhotoUrl(URL_ICON_HOUSE);
		icon2.setPhotoUrl2x(URL_ICON_HOUSE_2X);
		icon2.setPhotoUrl3x(URL_ICON_HOUSE_3X);

		IconModel icon3 = new IconModel();
		icon3.setText("6 GUESTS");
		icon3.setPhotoUrl(URL_ICON_GUESTS);
		icon3.setPhotoUrl2x(URL_ICON_GUESTS_2X);
		icon3.setPhotoUrl3x(URL_ICON_GUESTS_3X);

		IconModel icon4 = new IconModel();
		icon4.setText("3 BEDROOMS");
		icon4.setPhotoUrl(URL_ICON_BEDROOM);
		icon4.setPhotoUrl2x(URL_ICON_BEDROOM_2X);
		icon4.setPhotoUrl3x(URL_ICON_BEDROOM_3X);

		List<IconModel> icons = new ArrayList<>();
		icons.add(icon1);
		icons.add(icon2);
		icons.add(icon3);
		icons.add(icon4);

		return icons;
	}

	public static List<IconModel> getBackgroundHeaders() {
		IconModel icon1 = new IconModel();

		icon1.setText("HOME");
		icon1.setPhotoUrl(HEADER_HOME);
		icon1.setPhotoUrl2x(HEADER_HOME_2X);

		IconModel icon2 = new IconModel();
		icon2.setText("PLAN");
		icon2.setPhotoUrl(HEADER_PLAN);
		icon2.setPhotoUrl2x(HEADER_PLAN_2X);

		IconModel icon3 = new IconModel();
		icon3.setText("KITE");
		icon3.setPhotoUrl(HEADER_KITE);
		icon3.setPhotoUrl2x(HEADER_KITE_2X);

		IconModel icon4 = new IconModel();
		icon4.setText("SLEEP");
		icon4.setPhotoUrl(HEADER_SLEEP);
		icon4.setPhotoUrl2x(HEADER_SLEEP_2X);

		IconModel icon5 = new IconModel();
		icon5.setText("EAT");
		icon5.setPhotoUrl(HEADER_EAT);
		icon5.setPhotoUrl2x(HEADER_EAT_2X);

		List<IconModel> icons = new ArrayList<>();
		icons.add(icon1);
		icons.add(icon2);
		icons.add(icon3);
		icons.add(icon4);
		icons.add(icon5);

		return icons;
	}


	public static List<IconModel> getLogos() {
		IconModel icon1 = new IconModel();

		icon1.setText("LOGO_BLACK");
		icon1.setPhotoUrl(LOGO_BLACK);

		IconModel icon2 = new IconModel();
		icon2.setText("LOGO_HEADER");
		icon2.setPhotoUrl(LOGO_HEADER);
		icon2.setPhotoUrl2x(LOGO_HEADER_2X);

		IconModel icon3 = new IconModel();
		icon3.setText("LOGO_HEADER_SVG");
		icon3.setPhotoUrl(LOGO_HEADER_SVG);

		IconModel icon4 = new IconModel();
		icon4.setText("LOGO_HEADER_WHITE");
		icon4.setPhotoUrl(LOGO_HEADER_WHITE);

		List<IconModel> icons = new ArrayList<>();
		icons.add(icon1);
		icons.add(icon2);
		icons.add(icon3);
		icons.add(icon4);

		return icons;
	}

}
