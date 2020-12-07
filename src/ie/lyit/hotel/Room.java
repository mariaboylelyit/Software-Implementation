package ie.lyit.hotel;

public class Room {
	private int maxAdults;
	private int maxKids;
	private double pricePerNight;
    private boolean allocated;
	private int number;

	private final double LOWEST_PRICE=60.00;

	public Room(int maxAdults, int maxKids, double pricePerNight, int number) throws IllegalArgumentException {
		if(maxAdults < 1 || maxAdults > 2 || maxKids < 0 || maxKids > 3)
			throw new IllegalArgumentException("Invalid Number of Adults or Kids.");
		
		this.maxAdults=maxAdults;
		this.maxKids=maxKids;
		this.pricePerNight=pricePerNight;
		this.number=number;
		this.allocated=false;
	}

	@Override
	public String toString() {
		return "ROOM " + number + " [" + maxAdults + " adult(s),"+ maxKids + " kid(s) @ €" + pricePerNight + " p/n," + (allocated ? "allocated" : "NOT allocated") + "]";
	}
	
	@Override
	public boolean equals(Object obj){
	   Room rObject;
	   if (obj instanceof Room)
		   rObject = (Room)obj;
	   else
	       return false;
	 
	   return this.number == (rObject.number);
	}

	public void setMaxAdults(int maxAdults) throws IllegalArgumentException{
		if(maxAdults < 1 || maxAdults > 2)
			throw new IllegalArgumentException("Invalid Number of Adults.");
			
		this.maxAdults=maxAdults;
	}
	public void setMaxKids(int maxKids) throws IllegalArgumentException{
		if(maxKids < 0 || maxKids > 3)
			throw new IllegalArgumentException("Invalid Number of Kids.");
			
		this.maxKids=maxKids;
	}
	public void setPricePerNight(double pricePerNight) throws IllegalArgumentException{
		if(pricePerNight < LOWEST_PRICE)
			throw new IllegalArgumentException("Room Price lower than allowed.");
			
		this.pricePerNight=pricePerNight;
	}
	public void setAllocated(boolean allocated) {
		this.allocated=allocated;
	}
	public int getMaxAdults() {
		return maxAdults;
	}
	public int getMaxKids() {
		return maxKids;
	}
	public boolean getAllocated() {
		return allocated;
	}
}
