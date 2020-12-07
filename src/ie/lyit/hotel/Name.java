/**
 * Class: B.Sc. in Computing
 * Instructor: Maria Boyle
 * Description: Models a Name
 * Date: 28/09/2020
 * @author Maria Boyle
 * @version 1.0
 * Uploading to a GitHub Repository
**/
package ie.lyit.hotel;

public class Name {
	// Instance Variables
	private String title;
	private String firstName;	
	private String surname;		
	
	// Constructors to initialise the Instance Variables
	// Default Constructor 
	//	==> Called when a Name object is created as follows - 
	//        Name n1 = new Name();
	public Name(){
	   title=firstName=surname="";
	}

	// Initialization Constructor
	// ==> Called when a Name object is created as follows - 
	//       Name n2 = new Name("Mr","Joe","Cole");
	public Name(String t, String fN, String sn){
		title=t;
		firstName=fN;
		surname=sn;
	}

	// toString() method
	// ==> Called when a String of the class is used, e.g. - 
	//       System.out.print(n1);
	//		 or System.out.print(n1.toString());
	@Override
	public String toString(){
	   return title + " " + firstName + " " + surname;
	}
	
	// equals() method
	// ==> Called when comparing an object with another object, e.g. -
	//       if(n1.equals(n2))
	@Override
	public boolean equals(Object obj){
	   Name nObject;
	   if (obj instanceof Name)
	      nObject = (Name)obj;
	   else
	       return false;
	 
	   return this.title.equals(nObject.title)
	          && this.firstName.equals(nObject.firstName)
	          && this.surname.equals(nObject.surname);
	}

	// get methods
	// ==> Called when retrieving part of an object, e.g. - 
	//       if(n1.getSurname().equals(n2.getSurname())
	public String getTitle(){
	   return title;
	}
	public String getFirstName(){
	   return firstName;
	}
	public String getSurname(){
	   return surname;
	}

	// set methods
	// ==> Called when setting part of an object, e.g. - 
	//       n1.setTitle("Mrs");
	//	     n1.setFirstName("Marge");
	//		 n1.setSurname("Simpson");
	public void setTitle(String setTitleTo){
	   title=setTitleTo;
	}
	public void setFirstName(String setFirstNameTo){
	   firstName=setFirstNameTo;
	}
	public void setSurname(String setSurnameTo){
	   surname=setSurnameTo;
	}

	public boolean isFemale(){
	   if(title.equalsIgnoreCase("Miss") || 
	      title.equalsIgnoreCase("Ms") || 
		  title.equalsIgnoreCase("Mrs")) 
		     return true;
	   else
		     return false;
	}	
}
