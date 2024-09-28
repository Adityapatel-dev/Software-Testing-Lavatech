package test;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.TreeSet;

public class SampleClass {

	public static void main(String[] args) {
		// Declare TreeSet 
		TreeSet a1 = new TreeSet();
							
		// Add 4 elements to TreeSet
		Collections.addAll(a1, "Ram", "Ravi","Raman","Kavi");
				
		// Add single element
		a1.add("Jelly");
				
		// Display all elements
		System.out.println(a1);
							
		// Display total size of HashSet
		System.out.println(a1.size());
							
		// Remove element by value
		a1.remove("Kavi");
				System.out.println(a1);
							
		// Add multiple values
		Collections.addAll(a1,"Jack","Jill");
							
		// Display all elements
		System.out.println(a1);
							
		// Remove multiple value
		ArrayList a2 = new ArrayList();
		Collections.addAll(a2, "Jack","Ram" );
		a1.removeAll(a2);		
		System.out.println(a1);
							
		// Retain specific elements
		ArrayList a3 = new ArrayList();
		Collections.addAll(a3, "Kavi","Jill" );
		a1.retainAll(a3);
		System.out.println(a1);
							
		// Remove all elements
		a1.clear();
		System.out.println(a1);
				
		// Check if object is present
		System.out.println(a1.contains("Jill"));
							
		// Check if collection is empty
		System.out.println(a1.isEmpty());
							
		// Iterate over ArrayList
		TreeSet a4 = new TreeSet();
		Collections.addAll(a4, "Jim","Jimi","Kim","Kimi");
		Iterator it1 = a4.iterator();
		while(it1.hasNext()) {
			String s1 = (String) it1.next();
			System.out.println(s1);
		}
				
		// add(index, object) at specific index position does not work
		// addAll(index, collection) i.e add at specific index position does not work
		// get(index) i.e retrieve member at specific index does not work			
		// set(index, object) i.e eplace an object at speicifc index does not work
		// indexOf("object") i.e fetching object's index position does not work
		// lastIndexOf(object) ie. get last position of specific object does not work			

		// Additional functions related to SortedSet
		// Retreive the first element of tree set
		System.out.println(a4.first());
		
		// Retreive the last element of tree set
		System.out.println(a4.last());
		
		System.out.println(a4);
		// Return object before mentioned object
		System.out.println(a4.headSet("Kim"));
		
		// Return object after mentioned object
		System.out.println(a4.tailSet("Jimi"));
		
		// Return object between start and end object, including start object 
		System.out.println(a4.subSet("Jimi","Kimi"));
		
		// Return object <= mentioned object
		System.out.println(a4.floor("Jimi"));
		
		// Return object < mentioned object
		System.out.println(a4.lower("Jimi"));
		
		// Return object >= mentioned object
		System.out.println(a4.ceiling("Jimi"));
		
		// Return object > mentioned object
		System.out.println(a4.higher("Jimi"));
		
		// Return set in descending order
		System.out.println(a4.descendingSet());
	}
}
