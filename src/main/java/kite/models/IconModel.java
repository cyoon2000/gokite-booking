package kite.models;

public class IconModel {
	private String text;
	private String photoUrl;
	private String photoUrl2x;
	private String photoUrl3x;

	public String getPhotoUrl3x() {
		return photoUrl3x;
	}

	public void setPhotoUrl3x(String photoUrl3x) {
		this.photoUrl3x = photoUrl3x;
	}

	public String getText() {
		return text;
	}

	public void setText(String text) {
		this.text = text;
	}

	public String getPhotoUrl() {
		return photoUrl;
	}

	public void setPhotoUrl(String photoUrl) {
		this.photoUrl = photoUrl;
	}

	public String getPhotoUrl2x() {
		return photoUrl2x;
	}

	public void setPhotoUrl2x(String photoUrl2x) {
		this.photoUrl2x = photoUrl2x;
	}
}
