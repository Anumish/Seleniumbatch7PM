package OOPS;

public class ClassC extends ClassB{
	
	// I want to use methods of class B and Class A
	
	// Class C can access methods of Class B which is sub() method
	// and also methods of Class A -- sum(), multiply();
	
// ClassA--->ClassB--->ClassC
	
	
	// Declare a static variable and try to use it another class
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ClassC obj2= new ClassC();
		
		obj2.sub();
		//obj2.sum();
		//obj2.multiply();
		ClassA.login();   // irrespective of inheritance, we can use static methods in another class, --Classname.methodname

		System.out.println(obj2);
	}

}
