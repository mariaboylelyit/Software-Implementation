package ie.lyit.hotel;

// CODE Marked REM is commented out for the last part of the Assignment
public class Booking {
	private Date checkInDate;
	private int noNights;
	private int noAdults;
	private int noKids;
	private Guest guestDetails;
	private Room roomAllocated;
	private double totalPrice;
	private int bookingNo;
    
	private static int nextBookingNumber=120000;

	public Booking(Date checkInDate,int noNights,int noAdults,int noKids,
			       Guest guestDetails,Room roomAllocated) throws IllegalArgumentException {
		if(noAdults < 1 || noAdults > 2 || noKids < 0 || noKids > 3)
			throw new IllegalArgumentException("Invalid Number of Adults and Kids.");
	
		this.checkInDate=checkInDate;
		this.noNights=noNights;
		this.noAdults=noAdults;
		this.noKids=noKids;
		this.guestDetails=guestDetails;
		this.roomAllocated=roomAllocated;
		bookingNo=nextBookingNumber++;
	}


	@Override
	public String toString() {
		//REM return "BOOKING " + bookingNo + " ==> " + guestDetails.getName() + " from " + checkInDate + " for " + noNights + " nights.";
		return "BOOKING " + bookingNo + " ==> " + guestDetails.getName() + " for " + noAdults + " adults, and " + noKids + " kids.";
	}

	@Override
	public boolean equals(Object obj){
	   Booking bObject;
	   if (obj instanceof Booking)
		   bObject = (Booking)obj;
	   else
	       return false;
	 
	   return this.bookingNo == (bObject.bookingNo);
	}
}
