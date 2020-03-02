package CodingQuestion;

import java.io.ObjectOutputStream.PutField;
import java.util.HashMap;
import java.util.LinkedHashMap;

public class HashMapImplementation {

	public static void main(String[] args) {
		
		HashMap<String, String> map = new HashMap<String,String>();
		HashMap<String, String> map1 = new LinkedHashMap<String,String>();//Print in same order

//Add Items
		map.put("Karnataka", "Bangalore");
		map.put("Jharkhand", "Ranchi");
		map.put("Bihar", "Patna");
		map.put("England", "London");
		
		map1.put("Karnataka", "Bangalore");
		map1.put("Jharkhand", "Ranchi");
		map1.put("Bihar", "Patna");
		map1.put("England", "London");
		System.out.println(map);
		System.out.println(map1);
		
//Access
		
		map.get("Karnataka");
		System.out.println(map.get("England"));
		
//Remove
		
				map.remove("Karnataka");
				System.out.println(map);
				
		
//Loop
		for(String i : map.keySet())
		{
		System.out.println("Key :" + i + "  Value :" + map.get(i));
		}
		
		for(String j : map.values()) 
		{
			System.out.print(j + " ");
		}
		

	}

}
