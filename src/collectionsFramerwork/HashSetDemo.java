package collectionsFramerwork;

import java.util.HashSet;

public class HashSetDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// used to store values but values are not stored in proper index, they are stored randomly
		
		HashSet<String> hset= new HashSet<String>();
		
		hset.add("selenium");
		
		hset.add("Java");
		hset.add("PHP");
		hset.add("Ruby");
		
		
		//To print the array List values one by one , get() method is not applicable to HashSet 
				//System.out.println(hset.get(0));
			
				
				// OR use for loop of for each loop -- not applicable to HashSet
				
				/*for (int i=0; i<aList.size();i++)
				{
					System.out.println(aList.get(i));
				}*/
			
		
		//Use for each loop to fetch data of a HashSet
		
		for(String temp:hset)
		{
			System.out.println(temp);
		}
		
	}

}
