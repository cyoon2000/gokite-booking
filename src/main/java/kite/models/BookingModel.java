package kite.models;

/**
 * <code>BookingModel<code> class/interface is ${DESC}.
 * <p>
 * <pre>
 * <strong>History</strong>    Name              Date            Description
 * <strong>History</strong>    --------------------------------------------------------------------
 * <strong>History</strong>    cyoun            2/5/16          Created.
 * </pre>
 *
 * @author cyoun
 * @since 2/5/16
 */
public class BookingModel {
	private Integer numGuest;
	//	private Date checkIn;
	//	private Date checkout;
	private String checkIn;
	private String checkOut;
	private Integer numNight;
	private Integer pricePerNight;
	private Integer totalPrice;

	public Integer getNumGuest() {
		return numGuest;
	}

	public void setNumGuest(Integer numGuest) {
		this.numGuest = numGuest;
	}

	public String getCheckIn() {
		return checkIn;
	}

	public void setCheckIn(String checkIn) {
		this.checkIn = checkIn;
	}

	public String getCheckOut() {
		return checkOut;
	}

	public void setCheckOut(String checkOut) {
		this.checkOut = checkOut;
	}

	public Integer getNumNight() {
		return numNight;
	}

	public void setNumNight(Integer numNight) {
		this.numNight = numNight;
	}

	public Integer getPricePerNight() {
		return pricePerNight;
	}

	public void setPricePerNight(Integer pricePerNight) {
		this.pricePerNight = pricePerNight;
	}

	public Integer getTotalPrice() {
		return totalPrice;
	}

	public void setTotalPrice(Integer totalPrice) {
		this.totalPrice = totalPrice;
	}
}
