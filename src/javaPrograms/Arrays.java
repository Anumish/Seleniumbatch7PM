package javaPrograms;

public class Arrays {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		String s= "Java";
		String s1="Ruby";
		String s3="Python";
		
		// In a varibale we can store only 1 value
		
		// We are fetching multiple values and we want to store them in 1 single variable
		
		// Array --> which will store multiple values --> so an array will be called as an Object
		
		// An array object can store multiple values of same datatype
		
		// We should know the length of an array to store the values 
		// when we declaring an array we should also provide the length of array
	// Length of array is fixed
		
		// int Array1={1,2,3,4,5};
		
		
		
		// 1. method of Creating an array
		
		//Step 1 -- declaring array name   -- dataType arrayname[]
		
		String arr1[];
		
		// Step 2 -- providing length of an array   -- arrayname= new datatype[length]
		
		arr1= new String[3];
		
		// Step 3- assigning the values to the array
		
		arr1[0]="java";
		arr1[1]="PHP";
		arr1[2]="Python";
		
		System.out.println(arr1[1]); //PHP
		
		
		//2 method of creating an array
		
		//datatype [] arrayname= new datatyep[length]
		
		String [] arr2= new String[3];
		
		// Step 2- assigning values
		
		arr2[0]="C#";
		arr2[1]="Ruby";
		arr2[2]=".net";
		// arr2[3]="C++";   // get an error as arrayoutofbound exception
		System.out.println(arr2[1]);   // ruby
		
		// 3 Method
		
		String [] arr3= {"java","selenium","C++","Python","PHP"};
		
		System.out.println(arr3);
		System.out.println(arr3[1]);   //Selenium
		
		// Print all the values of an Array use for loop
		// go to the index value of array, fetch the value at that idex and print it
		
		// condition    we can give i<5 which is length
		// or we can give i<=4 which is index
		
		for(int i=0;i<=4;i++)
		{
			System.out.println(arr3[i]);   // arr3[0]  - Java
			// increment value of i =1 --> arr3[1]   --selenium
			// increment value of i =2 --> arr3[2]   --C++
			//increment value of i =3 --> arr3[3]   --Python
			//increment value of i =4 --> arr3[4]   --PHP
			// increment value of i =5 ---> condition becomes false-->come out of the loop

		}
		
		// MultiDimensional Array
		
		
		String [] [] arrM= {{"java","selenium","C++","Python","PHP"},{"selenium","loadrunner","UFT","RPT"},{"1","2","3","4"}};
		
		
		// There is a mother array -- which is having 3 child arrays at index 0,1,2
		// At index 0 -- we have an array which is storing multiple values. this arrays has its own index values
		// At index 1 of mother arry we have another array 2 - which is storing name os the tools and it also has its own index values
		// At index 2 of mother array we have another array 3
		
		
		// Assignmet is : to Print a multidimensional array
		
		// 2 for loops, 1st loop will be going to the index values of mother array
		// 2nd loop will be going to the index value of each child array and print it
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
				
		
	}

}
