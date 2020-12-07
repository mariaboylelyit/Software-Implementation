package ie.lyit.testers;

import java.util.ArrayList;
import java.util.Scanner;
import ie.lyit.hotel.*;

public class BookingTester {
	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);
		ArrayList<Booking> bookings=new ArrayList<Booking>();
		
		// Create a Booking with details below
		Date checkInDate = new Date(5,10,2020);
		int numberNights=2;
		Guest guestDetails=new Guest(new Name("Mr","Joe","Cole"),"087 1234567","joe@lyit.ie");
		int noAdults=0,noKids=0;
		boolean goodInput=false;
		do {
			try {
				System.out.print("How many Adults?");
				noAdults=keyboard.nextInt();
				System.out.print("How many Kids?");
				noKids=keyboard.nextInt();

		        Booking bookingA=new Booking(checkInDate,numberNights,noAdults,noKids,guestDetails,new Room(1,0,60.00,0));
		        // Add bookingA to bookings
		        bookings.add(bookingA);
				goodInput=true;
			}
			catch(IllegalArgumentException iAE) {
				System.out.println("Incorrect number of Adults and Kids, re-enter:");
			}
		}while(!goodInput);

		// Display Booking’s
		System.out.println("\nHOTEL BOOKINGS");
		for(Booking booking:bookings)
			System.out.println(booking);			
	}
}