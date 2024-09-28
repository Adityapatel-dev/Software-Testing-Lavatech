package com.lavatech.www;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
public class SampleClass {
	public static void main(String[] args) {
			
			// Declare ArrayList 
			ArrayList a1 = new ArrayList(3);
			
			// Initialising arraylist with multiple values
			// Add 4 elements to ArrayList
			Collections.addAll(a1, "Kavi" ,"Ram", "Ravi","Raman","Kavi","null",32);
			a1.add("Sham");
			
			// Display all elements
			System.out.println(a1);
			
			/*
			 * Functions specific to Collection or List Interface
			 */

			// Display total size of ArrayList
			System.out.println(a1.size());
			
			// Remove element by value
			a1.remove("Kavi");
			System.out.println(a1);
						
			// Add more multiple values
			Collections.addAll(a1,"Jack","Jill");
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
			a3.clear();
			System.out.println(a3);
			
			// Check if object is present
			System.out.println(a1.contains("Jill"));
			
			// Check if collection is empty
			System.out.println(a3.isEmpty());
			
			// Convert ArrayList to String array
			Object[] temp = a1.toArray(new String[a1.size()]);
			System.out.println(temp);
			//temp = a1.toArray();
			
			// Iterate over ArrayList
			ArrayList a4 = new ArrayList();
			Collections.addAll(a4, "Jim","Jimi","Kim","Kimi");
			Iterator it1 = a4.iterator();
			while(it1.hasNext()) {
				String s1 = (String) it1.next();
				System.out.println(s1);
			}

			// Add element at specific index position
			a4.add(3,"Jelly");
			System.out.println(a4);
			
			// Add multiple objects at specific index position
			ArrayList a5 = new ArrayList();
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
	}
}