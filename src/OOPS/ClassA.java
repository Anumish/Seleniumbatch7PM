package OOPS;

public class ClassA {


	static int i=100;
	
	public  void testcase2()
	{
		int a=10, b=20;
		int c=a+b;
		System.out.println("Adding numbers" + c);
	}
	
	public void Testcase1()
	{
		int x=10, y=20;
		int z=x*y;
		System.out.println("multiplication:"+z);
	}
	
	// put a try catch block at method level when required
	public void divide()
	{
		int x=10, y=0;
		try
		{
		int z=x/y;
		}
		catch(ArithmeticException e)
		{
			
		System.out.println("handling exception");
		}
		
		//System.out.println("divide:"+z);
	}
	
	public static void login()
	{
		System.out.println("loginto the application");
	}
	public static void main(String[] args) {
		
		// TODO Auto-generated method stub
		int a=300;
		
		ClassA obj= new ClassA();
		
		//obj.sum();
		//obj.multiply();
		login();
		obj.divide();
		
		
		
		
		System.out.println(Math.random());
		

	}

}
