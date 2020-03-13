package javaPrograms;

public class Loops {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		//To Print 1 to 10 numbers:
	

		// We can use loops whenever there is repetative task in the program
		// for loop
		
		// Syntax of for loop
		
		// for(variable initialization; condition; increement/decrement value)
		//{
		//	block of code
		//}
		//To Print 1 to 10 numbers:
		// The loop is going to be repeated again and again until the condition is true
		// once the condition becomes false, compiler will comeout of the loop and execute next line in the program
		for(int i=1; i<=10; i+=2)        //now value of  i  is stored as 11  ---> check for the condition  ---> (11<=10) --Condition is false
		{
			
			System.out.println(i);   // print 1  , 2, 3, 4,,5,6,7,8,9,10
		}
			
		System.out.println("executing next lines of code")	;
		
			// Print number 10 to 1
			
			for(int j=10;  j>=1    ;j--) // decrement the value of j  ---> now value of j is 0---> condition -->(0>=1)----> false
				
			{
				System.out.println(j);  // print 10, 9, 8,7,6,5,4,3,2,1
			}
				
			System.out.println("we are now ouside loop2")	;	
				
				
				
				// While loop
			
			
			
			// to print numbers 1 to 10
			
			int i=1;
			
			while(i>=10)
			{
				System.out.println(i);
				i++;
			}
			
			
			
			// do-while loop
			
			// to print numbers 1 to 10
			
			int x=1;
			do
			{
				System.out.println(x);  // 1 will be printed
				x++;
			}
			while(x>=10);
			
			// if the condition is false at least 1st value will be printed in case of do-while loop
			
			
			
			
			
			
			
			
			
			
			
			
			
			
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
	}

}
