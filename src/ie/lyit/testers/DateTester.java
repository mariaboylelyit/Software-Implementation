/**
 * Class: B.Sc. in Computing
 * Instructor: Maria Boyle
 * Description: Tester for the Date class
 * Date: 28/09/2020
 * @author Maria Boyle
 * @version 1.0
 * Uploading to a GitHub Repository
**/
package ie.lyit.testers;

import ie.lyit.hotel.Date;

public class DateTester{
	public static void main(String[] args) {
		Date d1 = new Date();
        System.out.println(d1);      

	    d1.setDay(4);
		d1.setMonth(6);
		d1.setYear(1941);
		
		System.out.println(d1);
      
		Date d2 = new Date(28, 12, 1982);
        System.out.println(d2);
      
		if(d1.equals(d2))
			System.out.println("Date's are equal.");
		else
			System.out.println("Date's are not equal.");
   }
}

