package OOPS;

// Class is different from Interface class
// An interface will have only method names, no method body will be there
// No main method in this class

public interface AbcFlight {
	
	
	// normal methods are not allowed in Interface class

	// It will have only methods with names, no body
	
	// we donot need to use abstract keyword
	
	// variables declared in Interface are by defalt static and final
	
String flightname="abc";

int x= 100;

// by defalut the methods are abstract

	public void bookFlight();
	
	public  void searchFlight();
	
	public void reSchedule();
	
	public void payment();

}
