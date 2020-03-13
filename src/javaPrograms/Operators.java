package javaPrograms;

public class Operators {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		// Operators
		
		// 1. Addition + , 2. Increment 3. Decrement
		
		// Assignment:
		
		// 	String s4="10";
		// String s5="20";  apply + operator on s4 and s5 and print the output.
		
		// 2. Declare 2 integer variables and use operators -, *, / on them and print the output
		
		int a=10;   // integer variable
		
		int b=20;  // integer variable
		
		// Using + operator performing addition operation on variables a and b
		
		int sum = a+b;   // here sum is a integer variable and output is going to be 10+20 =30
		
		// in order to check if our operation has been performed correctly or not we will print the variable sum
		
		// we are concatinating the message with variable
		
		System.out.println("The out of addition of a and b is :" + sum);
		
		System.out.println(a+b);
		
		
		
		String s1= "selenium";
		
		String s2="training";
		
	
		
		String s3= s1+s2;   // seleniumtraining
		
		System.out.println("the output is: " + s3);
		
		
		
	// Increment : ++
		// An increment operator when applied on a variable will just increment the value of the variable by 1 and saves that value in the variable
		
		
	int x=100;
		
		int result= x+=4;   // 102
		
		System.out.println("the output of increment on x is : " + result);
		
		System.out.println(x);   // the value stored in x is 101
		
		System.out.println(++x);  // 102
	
	
		
		
	// Decrement : --
		
		// An decrement operator when applied on a variable will just reduce the value of the variable by 1
		
		
		int y=100;
		
		int r1= --y;  // 99
		
		System.out.println("the output of decrement on y is : " + r1);
		
		//OR 
		
		System.out.println(--y);
		

		
		
		double x1=5;
		
		double y1=10;
		
		System.out.println(x1/y1);
		
		

		
		
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
