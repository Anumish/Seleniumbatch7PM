package javaPrograms;

public class RelationalOperators {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
		// Output of relational expression is boolean
		/*"1. Equal to     ==
		2. !=  Not equal to
		3. > greater than
		4. >=  greater than
		5 < Less than       
		6. <=  Less than*/

		int a=100, b=200;    
		
		// Equal to     ==
		// a==b ---> relation expression   //100 ==100
		// output : true
		
		Boolean result= a==b;  //  100==200 ----> the output is 'False'
		//100==100 ---> true
		System.out.println(result);
		
		Boolean result1=a!=b;  //100!=200 ----> the output is 'True'
		// 100!=100  ---> false
		System.out.println(result1);
		
		System.out.println("Is 'A' greater than 'B'" + (a>b));  // False
		
		a=400;
		b=300;
		
		// >=   greater than or equal to , in of these cases the put will be true
		// otherwise the output will be false
		//  > ---yes
		// even if they are not equal but a greater than B.. the output is going to be true
		a=300;
		b=300;
		
		//  in this case    a is not greater than b, it is equal to b still the output will be true
		
		
		a=200;
		b=300;
		
		//here a is not greater than b, a is not equal to b, in such case the output will be false
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		System.out.println("Is 'A' greater than or equal to'B'" + (a>=b)); //  true
		
		//Assignment: Declare 2 variables and perform < , <= relation operators
		//on these variables and Print the result.

	}

}
