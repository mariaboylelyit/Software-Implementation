/**
 * Class: B.Sc. in Computing
 * Instructor: Maria Boyle
 * Description: Tester for the Guest class
 * Date: 05/10/2020
 * @author Maria Boyle
 * @version 1.0
 * Uploading to a GitHub Repository
**/
package ie.lyit.testers;

import ie.lyit.hotel.Guest;
import ie.lyit.hotel.Name;

public class GuestTester {

	public static void main(String[] args) {
		// Create a Guest object called g1
		Guest g1 = new Guest();
		
		// display g1's details on screen
		System.out.println(g1);
		
		// set g1's details
		g1.setName(new Name("Mr","Homer","Simpson"));
		g1.setPhoneNumber("087 1234567");
		g1.setEmailAddress("homer.simpson@lyit.ie");
		
		// display g1's details on screen
		System.out.println(g1);
		
		// Create a Guest object called g2 with initial values
		Name name=new Name("Mrs", "Marge", "Simpson");
		Guest g2 = new Guest(name, "086 1234567", "marge.simpson@lyit.ie");	
		
		// display g2's details on screen
		System.out.println(g2);
		
		// check if g1 is the same as g2
		if(g1.equals(g2))
			System.out.println(g1.getName() + " is the same guest as " + g2.getName());
		else
			System.out.println(g1.getName() + " is NOT the same guest as " + g2.getName()+".");

		// check if g1 is the same as the Guest passed in
		if(g1.equals(new Guest(new Name("Mrs","Marge","Simpson"),"087 1234567", "marge.simpson@lyit.ie")))
			System.out.println(g1.getName() + " is on the list.");
		else
			System.out.println(g1.getName() + " is not on the list.");
		
		// check if g1 is MALE or FEMALE
		if(g1.getName().isFemale())
			System.out.println(g1.getName() + " is FEMALE.");
		else
			System.out.println(g1.getName() + " is MALE.");
		
		// check if g2 is MALE or FEMALE
		if(g2.getName().isFemale())
			System.out.println(g2.getName() + " is FEMALE.");
		else
			System.out.println(g2.getName() + " is MALE.");
	}
}

