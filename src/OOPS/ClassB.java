package OOPS;

public class ClassB extends ClassA{

	// if we want to write a method to add 2 numbers here or if we wnatt o multiply 2 numbers
	
	// 1st : you can write your own methods
	
	//2nd: use existing methods from Class A with help of extends keyword
	
	// use those 2 variable i and a from Class A in Class B
	
	// create a method and try to call these 2 variables
	// call these variables in main method()
	
	// methods with same name and same parameters and same datatypes are not allowed in Java
	
	// method Overloading 
	
	// you can have same method names but it should not have same datatype and same parameters
	
	
	// method OverRidding
	// When the parent class and child class have methods with the same name, than upon calling the method the 
	//home class method will only be called
	
	public int sub(int x, int y)   // method with an datatyoe emntioned will always have a return statement aslo
	{
		
		int c=x-y;
		return c;
	}
	

	
	public void sub(String name, String passwrd)
	{
		System.out.println("Loginto application");
	}
	
	
	public String sub()
	{
		
	String	str1="Sonal";
		
		String str2= "Mittal";
		
		String result= str1.concat(str2);
		
		
		return result;	
		
		
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println(i);
		
		// System.out.println(a);

		ClassB obj= new ClassB();
		
		ClassA obj2= new ClassA();
		
	  // obj.sum();   // child class method will be called
	   
	  // obj2.sum();
	   //obj.multiply();
	   login();
	obj.sub(10, 5);
	
	String output=obj.sub();

		System.out.println(output.concat("selenium"));
		
		
	}

}
