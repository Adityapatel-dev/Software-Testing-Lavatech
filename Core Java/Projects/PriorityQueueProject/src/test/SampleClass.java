package test;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.PriorityQueue;
import java.util.Queue;

public class SampleClass {

	public static void main(String[] args) {
		// Declare PriorityQueue 
		PriorityQueue a1 = new PriorityQueue();
		// Queue q1 = new PriorityQueue();

		// Add 4 elements to PriorityQueue
		// Notice the objects are added in ascending order of alphabets
		Collections.addAll(a1, "Kavi" ,"Ram", "Ravi","Raman","Kavi");

		/*
		 * Functions specific to Collection or List Interface
		 */
		
		// Add single object to PriorityQueue
		a1.add("Danny");
		System.out.println(a1);
		
		// Display all elements
		System.out.println(a1);
					
		// Display total size of PriortiyQueue
		System.out.println(a1.size());
					
		// Remove element by value
		a1.remove("Kavi");
		System.out.println(a1);

		// Add multiple values
		Collections.addAll(a1,"Jack","Jill");
		System.out.println(a1);
					
		// Remove multiple value
		ArrayList a2 = new ArrayList();
		Collections.addAll(a2, "Jack","Ram" );
		a1.removeAll(a2);		
					
		// Display all elements
		System.out.println(a1);

		// Retain specific elements
		PriorityQueue a3 = new PriorityQueue();
		Collections.addAll(a3, "Kavi","Jill" );
		a1.retainAll(a3);
		System.out.println(a1);
					
		// Remove all elements
		a3.clear();
		System.out.println(a3);
					
		// Check if object is present
		System.out.println(a1.contains("Jill"));
					
		// Check if collection is empty
		System.out.println(a3.isEmpty());
					
					
		// Iterate over ArrayList
		PriorityQueue a4 = new PriorityQueue();
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
		// Get last position of specific object
		
		
		// Additional function specific to Queue Interface
		// Add single objects to queue
		a1.offer("Alpha");
		a1.offer("Alpha");
		System.out.println(a1);
		
		// Return head of the queue
		System.out.println(a1.peek());
		System.out.println(a1.element());

		// Remove last element of queue
		a1.poll();
		System.out.println(a1);
		
		a1.remove("Jill");
		System.out.println(a1);
		
		System.out.println(a1.isEmpty());
	}
	
}
