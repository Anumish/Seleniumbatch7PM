package javaPrograms;

public class ConstructorDemo2 extends ConstructorDemo1{
	
	// super keyword should be called inside a construct
	
	
	
	
	
	
	
	public ConstructorDemo2()
	{
		System.out.println("default constructor of child class");
	}
// i also want to call the constructor of parent class  - super keyword
	public ConstructorDemo2(int i, int x)
	{
		super(100);
		System.out.println("parameter constructor of child class" + i);
	}
	
	public ConstructorDemo2(int i, int x, int y)
	{
		super(10,20);
		System.out.println("parameter constructor of child class" + i);
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		// whenever we are using extends keyword and if an object is created with child class ,
		//parent class constructor will be called first and than child class constructor will called
		
		// with same object we are calling 2 default constructor,parent class and child class
		
		// when an object is created in child class as default, constructors which are dafault in parent class and child class 
		//will be clalled respectively
		
		ConstructorDemo2 obj = new ConstructorDemo2();  // default constrcutor
		
		ConstructorDemo2 obj2 = new ConstructorDemo2(10,30); 
		ConstructorDemo2 obj3 = new ConstructorDemo2(10,20,30); 
		
	}

}
