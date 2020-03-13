package javaPrograms;

public class ConstructorsDemo {

	String name;
	int empid;
	
	// how to write a Constructor, how to write a constructor to assign values to class variables
	//Overloading of Constructors
	
	//Constructor name will always be same as classname
	// Constructors will not have return statement
	//default constructor - no parameters inside it
	
	public ConstructorsDemo()
	{
		System.out.println("defautl constructor");
	}
	
	
	public ConstructorsDemo(int i)
	{
		System.out.println("1 parameter constructor");
	}
	
	// assign values to class variables
	// 'this' keyword is used to assign values to class variables
	public ConstructorsDemo(String name, int empid)
	{
		// thiskeyword.classvariable=local parameter
		this.name=name;   // class variable name= TOM
		this.empid=empid;  // class variable empid =123
		
		
	
	}
	
	
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
// call a constructor  - create an object
		
		// calling defalut constructor
		ConstructorsDemo obj= new ConstructorsDemo();
		
		
		// call the conctructor with parameter
		
		ConstructorsDemo obj1= new ConstructorsDemo(100);
		
		
		ConstructorsDemo obj2= new ConstructorsDemo("TOM",123);  // these values will get assigned to class variables
		
		System.out.println(obj2.name+" "+ obj2.empid);
		
		
		
	}

}
