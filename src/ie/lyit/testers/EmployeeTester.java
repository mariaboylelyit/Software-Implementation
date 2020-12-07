/**
 * Class: B.Sc. in Computing
 * Instructor: Maria Boyle
 * Description: Tester for the Employee class
 * Date: 12/10/2020
 * @author Maria Boyle
 * @version 1.0
 * Uploading to a GitHub Repository
**/
package ie.lyit.testers;

import java.util.ArrayList;

import ie.lyit.hotel.*;

public class EmployeeTester {
	public static void main(String[] args) {
		// Create an Employee object called e1
		Employee e1 = new Employee();

		// display e1's details on screen
		System.out.println(e1);
		
		// set e1's details
		e1.setName(new Name("Ms","Lisa","Simpson"));
		e1.setPhoneNumber("0861234567");
		e1.setDOB(new Date(25,12,2002));
		e1.setStartDate(new Date(12,10,2020));
		e1.setSalary(36000.00);

		// display e1's details on screen
		System.out.println(e1);
		
	    Name name = new Name("Mr","Bart","Simpson");
	    Employee e2 = new Employee(name, "087 1234567", new Date(12,7,2000), 
	    						   new Date(12,10,2020), 24000.00);
	    
		// display e2's details on screen
		System.out.println(e2);

		// check if e1 is the same as e2
		if(e1.equals(e2))
			System.out.println(e1.getName() + " is the same employee as " + e2.getName());
		else
			System.out.println(e1.getName() + " is NOT the same employee as " + e2.getName()+".");
		
		if(e1.equals(e1))
			System.out.println(e1.getName() + " is the same employee as " + e1.getName());
		else
			System.out.println(e1.getName() + " is NOT the same employee as " + e1.getName()+".");
		
		// check if e1 is MALE or FEMALE
		if(e1.getName().isFemale())
			System.out.println(e1.getName() + " is FEMALE.");
		else
			System.out.println(e1.getName() + " is MALE.");
		
		// check if e2 is MALE or FEMALE
		if(e2.getName().isFemale())
			System.out.println(e2.getName() + " is FEMALE.");
		else
			System.out.println(e2.getName() + " is MALE.");
		
		System.out.println(e1.getName() + "s take home pay is " + e1.calculatePay(10));
		System.out.println(e2.getName() + "s take home pay is " + e2.calculatePay(10));
		
		// increment e1 and e2's salary by 5000
		e1.incrementSalary(5000);
		e2.incrementSalary(5000.00);
		
		// display e1's details on screen
		System.out.println(e1);
		// display e2's details on screen
		System.out.println(e2);
		
		// Polymorphic ArrayList
		ArrayList<Person> personsInHotel = new ArrayList<Person>();
		personsInHotel.add(e1);
		personsInHotel.add(e2);
		Guest g1=new Guest(new Name("Mrs","Marge","Simpson"), "086 7654321", "marge.simpson@lyit.ie");
		personsInHotel.add(new Guest(new Name("Mr","Homer","Simpson"), "087 7654321", "homer.simpson@lyit.ie"));
		personsInHotel.add(g1);
		
//		e1.setDOB(new Date(34,13,-200));
//		System.out.println(e1.getDOB());	
		
		for(Person tmpP : personsInHotel)
			System.out.println(tmpP);
		
		if(personSearch(e2, personsInHotel))
			System.out.println("FOUND!");
		else
			System.out.println("NOT FOUND!");
	}
	public static boolean personSearch(Person personSearch, ArrayList<Person> listOfPersons){
		return listOfPersons.contains(personSearch);
	}
}