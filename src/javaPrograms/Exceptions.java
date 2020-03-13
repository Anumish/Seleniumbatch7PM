package javaPrograms;

public class Exceptions {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		
		// ArithmeticException

		int a=100;
		
		// exception Handling : try and catch block
		
		try   // in this block we will put all the lines which are failing with exception
		{
		int b=a/0;
		}
		catch(ArithmeticException e)   // correct code if required and put it in catch block
		{
			
			int b=a/10;
	        System.out.println(b);
		}
		
		System.out.println(a);
		
		int x=100;
		
		int y=100+200;
		

		System.out.println(y);
		
		
/*	// NullPointerException
		
		String n= null;
		
		System.out.println(n.length());*/
		
		
	// A webPage is builtup pf multiple elements
		// If the tool is unable to locate an element on a webpage, than it will give an exception No element found
		
		
		//ArrayoutofboundException
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
