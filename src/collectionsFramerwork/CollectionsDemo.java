package collectionsFramerwork;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;

public class CollectionsDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
// COLLECTIONS FRAMEWORK
		// multiple Interfaces and classes as part of collections framework
		// Collections is a group of Objects
		// it is dynamic in nature, we can store any number of data in it
		//to store data, to manipulate data, to sort data, to delete data
	//Array
		
/*String [] arr2= new String[3];
		
		// Step 2- assigning values
		
		arr2[0]="C#";
		arr2[1]="Ruby";
		arr2[2]=".net";
		// arr2[3]="C++";   // get an error as arrayoutofbound exception
		System.out.println(arr2[0]);
		System.out.println(arr2[1]);
		System.out.println(arr2[2]);*/
		
	// ArrayList	: store multiple data and the list can grow with more data, size is not fixed
		
	// we have to add an argument to arraylist, to determine what type of arraylist we are creating
		// Syntax of how to create an arrayList
	// ArrayList<tyepofObject>  name= new ArrayList<typeofObject>();
		
		
	ArrayList<Integer>	aList= new ArrayList<Integer>();
	
	//List<Integer> li= new ArrayList<Integer>();
	

	// To add data in the array list we will use a method add()
	
	
	aList.add(100);   //0 index
	aList.add(200);   //1 index
	aList.add(300);   // 2 index
	aList.add(400);    // 3 index
	aList.add(500);    //4 index

	

	
	// fectch the values from an arrayList, we will use a method get()
	
/*	System.out.println(aList.get(0));
	System.out.println(aList.get(1));
	System.out.println(aList.get(2));*/
	
	
	// for loop to fetch the values from an arrayList
	//size() method provides the number of values in the arraylist
	
/*	for(int i=0; i<aList.size();i++)
	{
		System.out.println(aList.get(i));
	}

	for(Integer i1:aList)
	{
		System.out.println(i1);
	}*/
	
	//iterator()
	
Iterator<Integer> itr1	= aList.iterator();

while(itr1.hasNext())
{
	System.out.println(itr1.next());
}
	
	
	//HashSet 
	// Its is part of java.util package
	// add() method to add values to the hashset
	
	HashSet<String> hSet= new HashSet<String>();
	
	hSet.add("Selenium");
	hSet.add("Ruby");
	hSet.add("PHP");
	hSet.add("Python");
	
 // for-each loop 
	
	
	// it will go to the loop fecth all the values and print it
	
/*	
	for(String i:hSet)
	{
		System.out.println(i);
	}*/
	
	
	//iterator method, hasNext(), Next()
	
	//fetch the values of the Hashset using iterator() method
	// we use while loop
	
Iterator<String> itr	=hSet.iterator();
	
// if the hset iteration has values in it, than itr.hasNext()  is going to return true
//ArrayList= (1,2,3,4,5)
	while(itr.hasNext())
	{
		System.out.println(itr.next());
	}
	

	// HashMap -- put() , get()
	HashMap<Integer,String> hMap= new HashMap<Integer,String>();
	//hMap.put(key,value)
	hMap.put(100, "Sonal");
	hMap.put(02,"Tom");
	hMap.put(03,"Sara");
	hMap.put(null,null);
	
	//we will fetch the values of a hashmap using key
	
	System.out.println(hMap.get(02)); //Fetch Tom
	System.out.println(hMap.get(100)); //fetch Sonal
	System.out.println(hMap.get(03));// Sara
	System.out.println(hMap.get(04));//Tim
	
    //for each loop
	
	for(Integer temp:hMap.keySet())
	{
		System.out.println(temp);  //print only keys
		
		System.out.println(hMap.get(temp));
	}
	
	
	
		
		
		
		
		
		
		
		
		
	}

}
