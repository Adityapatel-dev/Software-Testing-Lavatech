package test;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Stack;

public class SampleClass {

	public static void main(String[] args) {
		
		// Declare Stack 
		Stack s1 = new Stack();
					
		// Add 4 elements to ArrayList
		Collections.addAll(s1, "Ram", "Ravi","Raman","Kavi","Ram",null,23);
					
		// Display all elements
		System.out.println(s1);
		
		/*
		 * Functions specific to Collection or List Interface
		 */
		
		// Display total size of ArrayList
		System.out.println(s1.size());

		// Remove element by value
		s1.remove("Kavi");
		System.out.println(s1);
					
		// Add multiple values
		Collections.addAll(s1,"Jack","Jill");
	
				// Remove multiple value
		ArrayList a2 = new ArrayList();
		Collections.addAll(a2, "Jack","Ram" );
		s1.removeAll(a2);		
		System.out.println(s1);

		// Retain specific elements
		Stack a3 = new Stack();
		Collections.addAll(a3, "Kavi","Jill" );
		s1.retainAll(a3);
		System.out.println(s1);

		// Remove all elements
		a3.clear();
		System.out.println(a3);

		// Check if object is present
		System.out.println(s1.contains("Jill"));

		// Check if vector collection is empty
		System.out.println(a3.isEmpty());

		// Iterate over ArrayList
		Stack a4 = new Stack();
		Collections.addAll(a4, "Jim","Jimi","Kim","Kimi");
		Iterator it1 = a4.iterator();
		while(it1.hasNext()) {
			String temp = (String) it1.next();
			System.out.println(temp);
		}

		// Add element at specific index position
		a4.add(3,"Jelly");
		System.out.println(a4);

		// Add multiple objects at specific index position
		Stack a5 = new Stack();
		Collections.addAll(a5, "Penny","Lenny");
		a4.addAll(2, a5);
		System.out.println(a4);

		// Get specific member from index position
		System.out.println(a4.get(3));

		// Replace an object at specific index position
		a4.set(0, "Ram");
		System.out.println(a4);
		
		// Get index position of specific object
		System.out.println(a4.indexOf("Ram"));
					
		// Get last position of specific object
		System.out.println(a4.lastIndexOf("Kimi"));
		
		/*
		 * Additional Stack functions
		 */
		
		// Add new object at the end
		a4.push("Danny");
		a4.push("Sam");
		System.out.println(a4);
		
		// Remove object from the end
		a4.pop();
		a4.pop();
		System.out.println(a4);
		
		// Return last object from the stack
		System.out.println(a4.peek());
		
		// Return index position from back
		System.out.println(a4.search("Jimi"));
		
		// Check whether the stack is empty or not.
		System.out.println(a4.empty());
	}
}