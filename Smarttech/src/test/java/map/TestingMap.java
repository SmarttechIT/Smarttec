package map;

import java.util.HashMap;
import java.util.Hashtable;
import java.util.Map;

public class TestingMap {
	
	// HashMap allow only one null, Its not allow duplicate Keys but it is allow duplicate values 
	public static void main(String[] args) {
		
		Map<String, String> newMap= new HashMap<>();
		newMap.put(null, null);
		newMap.put(null, null);
		newMap.put("First_name", "Ismat");
		newMap.put("First_name", "Ismat");
		newMap.put("Last_name", "Baker");
		newMap.put("Nickname", "Ismat");
		newMap.put("State", "Florida");
		newMap.put("Country", "USA");
		newMap.put("Position", "Automation QA");
		System.out.println(newMap);
	
		Map<Integer, String> myMap= new HashMap<>();
		myMap.put(1, "Laptop");
		myMap.put(2, "Laptop");
		myMap.put(3, "RAM");
		myMap.put(4, "Mouse");
		myMap.put(5, "KeyBaord");
		myMap.put(6, "ROM");
		myMap.put(7, "HDD");
		myMap.put(8, "M Pad");
		
		
		
		
		String Keynum = myMap.get(5);
		
		System.out.println(myMap);
		System.out.println(Keynum);
		System.out.println(myMap.size());
	
		//System.out.println(newMap);
		
	
	}

}
