package test;


import java.util.Map;
import java.util.TreeMap;

public class SampleClass {

	public static void main(String[] args) {
		// Map interface functions
		
		// Add single key value pair
		TreeMap m1 = new TreeMap();
		m1.put("Kavi", 100);
		System.out.println(m1);
				
		// Add multiple key value pair
		Map<String,Integer> m2 = Map.of(
				"Sham", 101,
				"Raman",102,
				"Danny",103,
				"Simi",104,
				"Abby",105
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
		
		/*
		 * SortedMap interface functions
		 */
		// Return the first key
		System.out.println(m1.firstKey());
		
		// Return the last key
		System.out.println(m1.lastKey());
		
		// Return all entries less than specific key
		System.out.println(m1.headMap("Kavi"));
		
		// Return all entries greater than or equal to specific key
		System.out.println(m1.tailMap("Kavi"));
		
		// Return all entries between 2 specified keys
		System.out.println(m1.subMap("Danny","Simi"));
		
		/*
		 * NavigableMap interface related with functions
		 */
		
		// Return highest key element <= key
		System.out.println(m1.floorKey("Kavi"));
		
		// Return highest key element < key
		System.out.println(m1.lowerKey("Kavi"));
		
		// Return lowest key element >= key
		System.out.println(m1.ceilingKey("Kavi"));
				
		// Return highest key element > key
		System.out.println(m1.higherKey("Kavi"));
		
		// Reverse the Map
		System.out.println(m1.descendingMap());
		
		// Return and remove first key pair
		m1.pollFirstEntry();
		System.out.println(m1);
		
		// Return and remove last key pair
		m1.pollLastEntry();
		System.out.println(m1);
	}
}
