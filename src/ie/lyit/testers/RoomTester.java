package ie.lyit.testers;

import java.util.ArrayList;
import ie.lyit.hotel.Room;

public class RoomTester {
	public static void main(String[] args) {
		ArrayList<Room> rooms=new ArrayList<Room>();

		// Add 5 Single Rooms, numbered from 1 to 5
		for(int i=1;i<=5;i++)
			  rooms.add(new Room(1,0,60.00,i));
		// Add 5 Double Rooms, numbered from 6 to 10
		for(int i=6;i<=10;i++)
			rooms.add(new Room(2,0,85.00,i));		
		// Add 5 Family Rooms, numbered from 11 to 15
		for(int i=11;i<=15;i++)
			rooms.add(new Room(2,3,120.00,i));				

		// Display Room’s
		System.out.println("ROOMS IN HOTEL");
		for(Room room:rooms)
			System.out.println(room);
	}
}
