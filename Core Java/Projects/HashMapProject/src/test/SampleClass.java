package test;

import java.util.HashMap;
import java.util.Map;

public class SampleClass {

	public static void main(String[] args) {
		
		// Map interface functions
		
		// Add single key value pair
		HashMap m1 = new HashMap();
		m1.put("Kavi", 100);
		System.out.println(m1);
		
		// Add multiple key value pair
		Map<String,Integer> m2 = Map.of(
				"Sham", 101,
				"Raman",102
				);
		m1.putAll(m2);
		// Insert order not preserved
		System.out.println(m1);
		
		// Retrive specific key value pair
		System.out.println(m1.get("Raman"));
		
		// Remove specific key value pair
		m1.remove("Raman");
		System.out.println(m1);
		
		// Check whether the key exists
		System.out.println(m1.containsKey("Sham"));
		
		// Check whether the value exists
		System.out.println(m1.containsValue("Sham"));
		
		// Check whether the hashmap is empty or not
		System.out.println(m1.isEmpty());
		
		// Return count of key=value pair
		System.out.println(m1.size());
		
		/*
		 * HashMap specific functions 
		 */
		
		// Display hashset entries as set
		System.out.println(m1.entrySet());
		
		// Display all keys
		System.out.println(m1.keySet());
		
		// Display all values
		System.out.println(m1.values());
		
		// Replace value of specific key
		m1.replace("Sham",505);
		System.out.println(m1);
		
	}
}
