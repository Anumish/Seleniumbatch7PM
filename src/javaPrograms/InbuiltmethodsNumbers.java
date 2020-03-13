package javaPrograms;

public class InbuiltmethodsNumbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// method 1: compareTo() . The output of this method is going to be 
		
		// 0 : if 2 numbers are equal,
		//1 if number 1 is greater than number 2
		// -1 if  number 1 is less than number 2
		// This method will compare 2 integer values
		// These methods are part of Integer class of Java
		
		
	
		
		// in order to call a method we need an object
		// the object should point to Intger class
		
		Integer x=10;
		int b=200;
		
		int output= x.compareTo(b);
		
		int output1= x.compareTo(9);
		
		int output2= x.compareTo(10);
		
		System.out.println(output);  // -1
		
		System.out.println(output1); // 1
		System.out.println(output2); // 0
		
		
	// equals() : will return true or false	
		
		
		System.out.println(	x.equals(b));  // false
		
		System.out.println(	x.equals(10)); // true
		
		
		
		//abs() method  // this method will make -ve to +ve value
		
		// abs() method is part of Math class
		
		double d= - 1.234;
		
		
		// classname.methodname()
		
		
		System.out.println(Math.abs(d));
		
		
		
		// round() --> math class
		// it rounds of the decimal value  to the nearest integer value
		
		
	System.out.println(	Math.round(1.65));
		
		
	// min() and max()	
		
	// this method will comapre the 2 integers and whichever is minimum value ,, it will return that
		
		
	int m=Math.min(10, 100);
	
	System.out.println(m);
		
	
	
	// CHaracter Methods
	
	//isLetter(): This method will check if the character that user has provided is letter or not.
	
	System.out.println(Character.isLetter('A'));   // True
		
	
	System.out.println(Character.isLetter('1'));	// False
		
	System.out.println(Character.isLetter('$'));	
		
	
	
	
	
	//isDigit()
	
	
	
	System.out.println(Character.isDigit('1')); // true
	
	
	System.out.println(Character.isDigit('a')); 
		
		
	// isUppercase(), isLowercase()

	
	// Array methods
	
	// Length()
		
	String [] arr3= {"java","selenium","C++","Python","PHP"};
	
	int l=arr3.length;
		
	System.out.println(l);	
		
	
	String [] [] arrM= {{"java","selenium","C++","Python","PHP"},{"selenium","loadrunner","UFT","RPT"},{"1","2","3","4"}};
		
		
		
	int l1=arrM[1].length;	
	System.out.println(l1);		
		
		
		
		
		
		
		
	}

}
