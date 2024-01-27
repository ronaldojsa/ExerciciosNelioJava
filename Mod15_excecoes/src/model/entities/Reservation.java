package model.entities;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.concurrent.TimeUnit;

import model.exceptions.DomainException;

public class Reservation {

	private Integer roomNumber;
	private Date checkIn;
	private Date checkOut;
	
	private static SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
	
	public Reservation() {
		
	}
	
	public Reservation(Integer roomNumber, Date checkIn, Date checkOut) throws DomainException {
		
		if (!checkOut.after(checkIn)) {
			throw new DomainException("Check-out date must be after check-in date");
		}
		
		this.roomNumber = roomNumber;
		this.checkIn = checkIn;
		this.checkOut = checkOut;
	}

	public Integer getRoomNumber() {
		return roomNumber;
	}

	public void setRoomNumber(Integer roomNumber) {
		this.roomNumber = roomNumber;
	}

	public Date getCheckin() {
		return checkIn;
	}

	//public void setCheckin(Date checkin) {
		//this.checkin = checkin;
	//}

	public Date getCheckout() {
		return checkOut;
	}

	//public void setCheckout(Date checkout) {
	//	this.checkout = checkout;
	//}
	
	
	public long duration() {                                  //long devido a um macete para fazer a conta
		long diff = checkOut.getTime() - checkIn.getTime();   // diferença das datas em milisegungos
		return TimeUnit.DAYS.convert(diff, TimeUnit.MILLISECONDS); // converte milisegundo em dias
	}
		
	
	public void updatesDates(Date checkIn, Date checkOut) throws DomainException {
		
		Date now = new Date();
		if (checkIn.before(now) || checkOut.before(now)) {
//			throw new IllegalArgumentException ("Reservation dates for updates must be future dates");
			throw new DomainException ("Reservation dates for updates mus be future dates");
		}
		if (!checkOut.after(checkIn)) {
//			throw new IllegalArgumentException("Check-out date must be after check-in date");
			throw new DomainException("Check-out date must be after check-in date");
		}	
		this.checkIn = checkIn;
		this.checkOut = checkOut;
	}
	
	@Override
	public String toString() {
		return "Room "
			+  roomNumber
			+ ", check-in: "
			+ sdf.format(checkIn)
			+ ", check-out: "
			+ sdf.format(checkOut)
			+ ", "
			+ duration()
			+ "nights";
		
	}
	
	
}
