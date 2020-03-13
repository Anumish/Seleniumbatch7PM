package javaPrograms;

//parent class

public class ConstructorDemo1  {
	
	
	
	public ConstructorDemo1()
	{
		System.out.println("defautl constructor of Parent class");
	}
	
	public ConstructorDemo1(int i)
	{
		System.out.println("parameter constructor of Parent class" + i);
	}
	
	public ConstructorDemo1(int i , int j)
	{
		System.out.println("1st parameter constructor of Parent class" + i);
		System.out.println("2nd parameter constructor of Parent class" + j);
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// we can create an object, and above written constructor will be called as we execute the program.
		
	}

}
