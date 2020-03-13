package javaPrograms;

public class InbuiltmethodsStrings {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		
		
		// String Methods -- it applicable to Strings
		
		//ASCII values
		// A to Z --- 65 to 90
		// a to z---- 97 to 122
		//0 to 9 -- 48 to 57
		
	
		//1. compareTo() method  : This method will compare 2 strings and will written an output which is:
		
		//    a +ve value , if String 1 is greater than String 2
		// a -ve value , if String 1 is less than String 2
		// a 0 if both String 1 and String 2 are equal
		// This compareTo() method uses 3 way comparision
		// output of this method is going to be integer value
		
		String  str1= "SELENIUM";// actual output from a  webpage
		
		String str2="SELENIUM";  // expected output
		
		
		// We call a method using an Object
		
		// whenver we write a varibale name along with a inbulit Java class than that variable will called as an Object
		// objectname 
		
		int result= str1.compareTo(str2);
		
		System.out.println(result);
		
		
		//2. equals() --- > this methods checks if 2 strings are equal or not
		// output is going to be true or false
		
		
	boolean r1=	str1.equals("training");
		
	
	System.out.println(r1);
		
	
boolean r2=	str1.equals(str2);
		
	
	System.out.println(r2);
	
	
	//concat() : it will just join 2 strings. output is going to be a String
	
	String s="Mercurylogin";
	
	System.out.println(s.concat(" Testcase passed"));
	
	
	//charAT() : it will return the character at that particular index value mentioned by the user
	// it will return a character
	
	String s1="Se1lenium";
	
	char c= s1.charAt(2);  //l
	
	System.out.println(c);
	
	
	//equalsIgnoreCase()
// it will first ignore the cases of the strings an just compare 2 strings and check if they are qual or not. 
	// the output is going to be true or false
	
	
	
	//toUppercase() : converts a lower case string into an uppercase String
	
	//Se1lenium
	
	System.out.println(s1.toUpperCase());
	
	// webpage 1 -- textfield-- firstname -- fetch the first name and convert it into uppercase and enter it as Username in webpage 2
	//
	
	
	// toLowercase() : converts a upper case string into an lower case String
	
	
	
	
	System.out.println(s1.toUpperCase());
	
	
	
	// method trim() : this method will trim spaces from both sides of the string
	
	
	String x=" registration form  ";
	System.out.println(x);
	
	String x1=x.trim();
	
	System.out.println(x1);
	
	//replaceAll method
	
	String rp=x.replaceAll("\\s", "");
	
	System.out.println(rp);
	
	System.out.println(x.replace('r', 'R'));
	

	
	// method : substring(startIndex value, end Index value), end index value should be given as n+1
	String x2= "Mercury page registration";
	
	System.out.println(x2);
	
	String x3= x2.substring(12, 24);
	
	
	System.out.println(x3);
	
	// startsWith(), returns true if the prefix is same else returns false if prefix of methoned string are different
	
	boolean x4=x2.startsWith("Mercury");
	
	System.out.println(x4);  // false
	
	
	// Assignment: endsWith()
	
	// method length()

	
	
	String x5="Sele nium";
	
	int l= x5.length();
	
	System.out.println(l);
	
	
	// Assignment contains(), replace()
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		

		

	}

}
