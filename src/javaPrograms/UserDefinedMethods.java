package javaPrograms;

import OOPS.ClassA;

public class UserDefinedMethods {
	
	static int x=10;  // static variable or global variable
	
	//A method is always written outside the main method
	
	//Syntax to write a method is
	
	// modifier: Access modifiers : Private, protected, default and public
	// Non access modfiers : final , static
	// variables declared inside the methods or block of code are called as local variables
	
	// modifier datatype methodname(parameters)
	//   {
		  // set of statements or code
	//   }
	
	
// Write a Methods with return value
	
	// the data type used while declaring the method name will be same as of the data type of the output
	//being returned by the method
	// everymethod which has datatype mentioned in the name, will have a return statement
	
	
	// Parameterization :  providing input data to the method when we call it
	
	public int multiply()
	{
		// write code to multiply 2 number
		
		int a=10;    // local variables
		int b=20;
		
		int mul= a*b;    // what is the output 200, dataype is going to be int
		
		return mul;
	}
	
	
	
	// methods with no return value
	// Those methods are called void methods
	
	public static void login()
	
	{
		System.out.println("loginto the application");
	}
	
	
	public void sum()
	{
		int a=100;
		
		int b=200;
		
		int sum=a+b;   // output is 300
			
	}
	
	// Methods with parameters
	
	// declared a,b,c as parameters. values to a,b,c will be provided upon calling them
	
	public double mul(int a, double b, int c)
	{
		double result;
		
		result=a*b*c;
		
		return result;
	}

	
	
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		
		
		int a =10;
		
	int sum=a+x;
		
		
		// Declare an Object to call the method mul()
	
	UserDefinedMethods obj= new UserDefinedMethods();
	
	System.out.println(obj.mul(20, 40, 50));
	
	

	
	

	
	
	
	
	
	
	
		
		
		
		
		
		
		
		
		

	}

}
