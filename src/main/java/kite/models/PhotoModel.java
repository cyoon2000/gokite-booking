package kite.models;

/**
 * <code>PhotoModel<code> class/interface is ${DESC}.
 * <p>
 * <pre>
 * <strong>History</strong>    Name              Date            Description
 * <strong>History</strong>    --------------------------------------------------------------------
 * <strong>History</strong>    cyoun            2/6/16          Created.
 * </pre>
 *
 * @author cyoun
 * @since 2/6/16
 */
public class PhotoModel {

	private String thumbUrl;
	private String thumbUrl2x;
	private String thumbUrl3x;

	private String photoUrl;
	private String photoUrl2x;
	private String photoUrl3x;

	public String getThumbUrl() {
		return thumbUrl;
	}

	public void setThumbUrl(String thumbUrl) {
		this.thumbUrl = thumbUrl;
	}

	public String getThumbUrl2x() {
		return thumbUrl2x;
	}

	public void setThumbUrl2x(String thumbUrl2x) {
		this.thumbUrl2x = thumbUrl2x;
	}

	public String getThumbUrl3x() {
		return thumbUrl3x;
	}

	public void setThumbUrl3x(String thumbUrl3x) {
		this.thumbUrl3x = thumbUrl3x;
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

	public String getPhotoUrl3x() {
		return photoUrl3x;
	}

	public void setPhotoUrl3x(String photoUrl3x) {
		this.photoUrl3x = photoUrl3x;
	}
}
