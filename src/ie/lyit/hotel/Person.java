/**
 * Class: B.Sc. in Computing
 * Instructor: Maria Boyle
 * Description: Models a Person
 * Date: 05/10/2020
 * @author Maria Boyle
 * @version 1.0
 * Uploading to a GitHub Repository
**/
package ie.lyit.hotel;

public abstract class Person {
	protected Name name;	// COMPOSITION - Person HAS-A name
	protected String phoneNumber;
	
	// Default Constructor
	// Called when object is created like this 
	//   ==> Person pObj = new Person();
	//   NOTE-This won't work because Person is abstract
	public Person(){
		name=new Name();
		phoneNumber="";
	}
	
	// Overloaded Initialization Constructor
	// Called when object would have been created like this (not possible cos abstract!)
	//    ==> Name name = new Name("Mr","Joe","Bloggs");
	//        Person pObj = new Person(name, "087 1234567");
	public Person(Name name, String phoneNumber) {
		this.name=name;
		this.phoneNumber=phoneNumber;
	}
	
	// toString() method
	// ==> Calls Name's toString() to display name and
	//		then displays address and phoneNumber
	@Override  // Overrides Object toString()
	public String toString() {
		return name + " " + phoneNumber;		
	}
	
	// equals() method
	// ==> Called when comparing an object with another object, 
	//     e.g. - if(p1.equals(p2))				
	// ==> Calls Name's equals() to compare name to personIn's name, and
	//		compares phoneNumber to personIn's phoneNumber
	@Override  // Overrides Object equals()
	public boolean equals(Object obj) {
		Person pObj;
		if(obj instanceof Person)
			pObj=(Person)obj;
		else
			return false;
		
		return name.equals(pObj.name)&&
			   phoneNumber.equals(pObj.phoneNumber);		
	}
	
	// get() methods
	public Name getName() {
		return this.name;
	}
	public String getPhoneNumber() {
		return phoneNumber;
	}
	
	// set() methods
	public void setName(Name name) {
		this.name=name;
	}
	public void setPhoneNumber(String phoneNumberIn) {
		phoneNumber=phoneNumberIn;
	}
}