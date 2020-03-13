package collectionsFramerwork;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayListDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		// Static Array:
		
		int [] arr1= new int[3];
		
		// ArrayList is a Dynamic Array
		
		ArrayList<Integer> aList= new ArrayList<Integer>();
		// Adding values to the Array List
		aList.add(100);
		aList.add(200);
		aList.add(300);
		
		
		
		//To print the array List values one by one
		System.out.println(aList.get(0));
	
		
		// OR use for loop of for each loop
		
		for (int i=0; i<aList.size();i++)
		{
			System.out.println(aList.get(i));
		}
	
		
		// Or use iterator() method
		
		Iterator<Integer> itr = aList.iterator();
		
		while(itr.hasNext())
		{
			System.out.println(itr.next());
		}
		
		
		
		
		
		
	}

}
