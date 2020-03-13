package javaPrograms;

public class ConditionalStatements {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		//3 types of if condition
		
		// Single if condition
		
		//Syntax:  if(condition)
		//         {
		//           block of code
		//           }
		
		// if the condition mentioned is True, the block of code will be executed
		// if the condition is false, the block of code will not be executed
		
		int a,b,x;
		a=100; b=50; x=200;
		
		// if condition
		if(a<200)    // false
		{
			int c;
			c=a+b;
			
			
			System.out.println("the output of sum is :" + c);
		}
		
	
		
		System.out.println("if block not executed");
		
		
		//compound condition   
		
		
		if((a>b)&&(a==x))    // if the final output is true, execute the if block
			// if final output is false, if block will not be executed
		{
			System.out.println(" executing if compound condition");
		
		
		}
		
		//Nested if condition
		
		if(a>60)
		{
			if(b<20)
			{
				if(a==100)
				{
					if(b==50)
					{
						System.out.println("executing nested if condition");   // this statement will be executed only when all the if conditions are TRUE
					}
				}
			}
		}
		
		
	// if else condition	
		
		// in if-else condition, 
		//  When   if condition is true, we will executed if block of code and else block will not be executed.
		
	if(!(x==200)	)
	{
		System.out.println("executing if block for if-else condition");
	}
	
	// When if condition is false, we will executed else block and if block will not be executed
	else
	{
		System.out.println("executing else block");
	}
		
		
	System.out.println("Hello class");
	System.out.println("welcome to the training");
		
		
		
		

		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
