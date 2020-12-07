/**
 * Class: B.Sc. in Computing
 * Instructor: Maria Boyle
 * Description: Models an Employee
 * Date: 12/10/2020
 * @author Maria Boyle
 * @version 1.0
 * Uploading to a GitHub Repository
**/
package ie.lyit.hotel;

// INHERITANCE - Employee IS-A Person, and CAN-DO Payable methods
public class Employee extends Person implements Payable {
    private Date dob;		// Employee has name,address&phoneNumber from Person
    private Date startDate;	// AND dob,startdate,salary, & number	
    private double salary;
    private int number;

	private static int nextNumber=1;	// static for unique number - starts off at 1
	
	private final double MAX_SALARY = 150000;	

    // Default Constructor
	// Called when object is created like this ==> Employee eObj = new Employee();	
    public Employee(){
    	super();		// NOTE:Not needed
    	dob=new Date();
    	startDate=new Date();
 		salary=0.0;
		// Set number to static nextNumber before incrementing nextNumber
 		number=nextNumber++;
    }
	
    // Initialization Constructor
	// Called when object is created like this ==>
	//    Employee empObj = new Employee("Mr","Joe","Doe","12 Lowlands,Ardara",
    //                                   "087 1234567",25,12,1970,new Date(10,11,2009),55000);
    //    NOTE:For dob and startDate you can either pass in a d,m,y OR a date object
    //         To show this, I have done dob as d,m,y, and startDate as a date object
    public Employee(Name name, String phoneNo, 
    		        Date dob,Date startDate, double salary){
       // Call super class constructor - Passing parameters required by Person ONLY!
	   super(name, phoneNo);
	   // And then initialise Employees own instance variables
	   this.dob=dob;
	   this.startDate=startDate;	// Set instance variable to parameter
	   this.salary=salary;
	   
		// Set number to static nextNumber before incrementing nextNumber
	   number = nextNumber++;						
	}
    
	// OVERRIDING the Person toString() method!
	// Calling Persons toString() method, and adding additional bits
	@Override
    public String toString(){
		return number + " " + super.toString() + " €" + salary;
	}

	// equals() method
	// ==> Called when comparing an object with another object, 
	//     e.g. - if(e1.equals(e2))				
	// ==> Probably sufficient to compare customer numbers as they're unique
	@Override
	public boolean equals(Object obj){
		Employee eObject;
		if (obj instanceof Employee)
		   eObject = (Employee)obj;
		else
		   return false;
		   
	    return(this.number==eObject.number);
	}

	// set() and get() methods
	public void setDOB(Date dob){
		this.dob=dob;
	}
	public Date getDOB(){
		return dob;
	}
	public void setStartDate(Date startDate){
		this.startDate=startDate;
	}
	public Date getStartDate(){
		return startDate;
	}	
	public void setSalary(double salary){
		this.salary=salary;
	}
	public double getSalary(){
		return salary;
	}
	// You shouldn't be able to setNumber() as it is unique, 
	// so don't provide a setNumber() method
	public int getNumber(){
		return number;
	}	
	
	@Override
	public double calculatePay(double taxPercentage) {
		// return the monthly pay as salary/12 less taxPercentage
		double pay=salary/12;
		pay -= (pay * (taxPercentage/100));
		return pay;
	}

	@Override
	public double incrementSalary(double incrementAmount) {
		// add incrementAmount to, and return the new salary
		// salary should not go over a maximum salary of €150,000
		salary += incrementAmount;
		
		if(salary > MAX_SALARY)
			salary = MAX_SALARY;
		
		return salary;
	}
}
