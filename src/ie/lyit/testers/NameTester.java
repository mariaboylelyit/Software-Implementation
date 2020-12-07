/**
 * Class: B.Sc. in Computing
 * Instructor: Maria Boyle
 * Description: Tester for the Name class
 * Date: 28/09/2020
 * @author Maria Boyle
 * @version 1.0
 * Uploading to a GitHub Repository
**/
package ie.lyit.testers;

import ie.lyit.hotel.Name;
import java.util.ArrayList;

public class NameTester{
	public static void main(String[] args) {
		// Create a Name object called personA
		Name personA = new Name();

		// display personA's details on screen
		System.out.println(personA);			
			
		// set personA's name
		personA.setTitle("Mr");
		personA.setFirstName("Homer");
		personA.setSurname("Simpson");		
			
		// display personA's details on screen
		System.out.println(personA);
		
		// Create a Name object called personB
		Name personB = new Name("Mrs", "Marge", "Simpson");
		
		// display personB's details on screen
		System.out.println(personB);
			
		if(personA.equals(personB))
			System.out.println(personA + " is the same as " + personB);
		else
			System.out.println(personA + " is not the same as " + personB);
			
		if(personA.isFemale())	// or if(personA.isFemale()==true)
			System.out.println(personA + " is female.");			
		else
			System.out.println(personA + " is not female.");					

		if(personB.isFemale())
			System.out.println(personB + " is female.");			
		else
			System.out.println(personB + " is not female.");
			
	   ArrayList<Name> names = new ArrayList<Name>();
	   names.add(new Name("Mr", "Bart", "Simpson"));
	   names.add(personA);
	   names.add(personB);
	   names.trimToSize( );

	   for(Name tempName:names )
	     System.out.println(tempName);
      
	   if(nameSearch(personA, names))
	     System.out.println("FOUND!");
	   else
	     System.out.println("NOT FOUND!");
   }
	
	public static boolean nameSearch(Name nameSearch, ArrayList<Name> listOfNames){
	   return listOfNames.contains(nameSearch);
	}
}