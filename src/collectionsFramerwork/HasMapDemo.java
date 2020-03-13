package collectionsFramerwork;

import java.util.HashMap;
import java.util.Map;

public class HasMapDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		HashMap<String, String> hmap= new HashMap<String, String>();
		
		hmap.put("1", "Sonal");
		hmap.put("2", "Tom");
		hmap.put("3", "sara");
		
		// to fetch the values
		System.out.println(hmap.get(101));
		
		//or for each loop
		
		for(Map.Entry<String,String> temp:hmap.entrySet())
		{
			//System.out.println(hmap.get);
		}
		
	
		
	


}
}