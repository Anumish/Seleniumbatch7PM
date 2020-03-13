package OOPS;


// if a child class has to  call methods of an Interface class ---- implements keyword

public  class FlightChild implements AbcFlight {

	public void login()
	{
		System.out.println("loginto the application");
	}

	
	public void bookFlight() {
		// TODO Auto-generated method stub
		
		System.out.println("book flight");
	}

	
	public void searchFlight() {
		// TODO Auto-generated method stub
		System.out.println("search flight");
	}

	
	public void reSchedule() {
		// TODO Auto-generated method stub
		System.out.println("resch flight");
	}

	public void payment() {
		// TODO Auto-generated method stub
		
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		// an object which can access methods of interface class only
		
		// create a reference variable for interface class
		
		//AbcFlight rv1;
		
		// where are the methods of this interface class implemented  ---FlightChild
		
		FlightChild obj= new FlightChild();
		
		//rv1=obj;
		
		//Another way of writing it is
		
		AbcFlight rv1 = new  FlightChild();
		
		
		
		
		obj.bookFlight();
		obj.login();
		obj.payment();
		obj.reSchedule();
		obj.searchFlight();
		
		
		System.out.println(x);
		
		
		
		
		
		
		
		
		
	}	

}
