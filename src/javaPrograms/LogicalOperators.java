package javaPrograms;

public class LogicalOperators {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//lOGICAL OPERATORS ARE PERFORMED ON 2 RELATIONAL EXPRESIONS
		
				//AND Operator  -- &&
				
				int x=300;
				int y=500;
				int z=500;
				
				//((x<y)      &&          (x<z))
				
				// (true      &&             true)   // the output is going to be true
				
				// x=600;
				// y=500;
				// z=500;
				 
				//((x<y)      &&          (x<z))
				 
				//( false  &&  False)   // the final ut put is going to be False
				
				// x=600;
				// y=500;
				// z=700;
				 
					//((x<y)      &&          (x<z))
				 
					//( false  &&  true)   // the final output is going to be False	 
				 
				 
						 
				 
				// When && (AND) operator is used : the out is going to be TRUE only when both the relation expression is true
				
				 
				 
				boolean results= ((x<y)&&(x<z));  // true
				System.out.println(results);
				
				boolean results1= ((x<y)&&(x>z)); //false
				System.out.println(results1);
				
				
				
		
				//OR operator  ||
				
				// In case of OR operator, if anyone of the relational expression is true, the final output is going to be true
				
				
				// x=400;
				// y=500;
				// z=400;
				 
					//((x<y)      ||        (x<z))
				
				// false || true   ----> TRUE
				
				// false  ||  false----> false
				
				// True || False  --->true
				
				
				
				boolean results2= ((x>y)||(x>z));  // False
				System.out.println(results2);
				
				
				// Not operator  !  - if the original value of the expression is true, and if we use ! operator on it, 
				//the output will be changed to False
				
				// x=100, y=50
				// x>y --> 100>50 --->true
				//!(x>y)  ---!(100>50)  ---> False
				// 100 is not greater than 50   ---> false
				
				
				
				
				// x=100 , y=50
				
				// x<y --->   100<50   --->  false
				
				//!(x<y)  ---> !(x<y)  ---> true
				
				// 100 is not less than 50  --> true
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				boolean results4= !(x<y) ; // False
				System.out.println(results4);
				
				

	}

}
