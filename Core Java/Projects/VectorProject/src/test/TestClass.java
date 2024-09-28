package test;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Vector;

public class TestClass {
	public static void main(String[] args) {
		// Declare Vector with initial size
		Vector v1 = new Vector(3);
		
		// Add 4 elements to Vector
		Collections.addAll(v1, "Ram", "Ravi","Raman","Kavi","Ram",null,23);
		
		// Display all elements
		System.out.println(v1);
		
		/*
		 * Functions specific to Collection or List Interface
		 */
		
		// Display total size of Vector
		System.out.println(v1.size());
		
		// Remove element by value
		v1.remove("Kavi");
		System.out.println(v1);
		
		// Add multiple values
		Collections.addAll(v1,"Jack","Jill");
		System.out.println(v1);

		// Remove multiple value
		ArrayList a2 = new ArrayList();
		Collections.addAll(a2, "Jack","Ram" );
		v1.removeAll(a2);		
		System.out.println(v1);

		// Retain specific elements
		ArrayList a3 = new ArrayList();
		Collections.addAll(a3, "Kavi","Jill" );
		v1.retainAll(a3);
		System.out.println(v1);

		// Remove all elements
		v1.clear();
		System.out.println(v1);

		// Check if object is present
		System.out.println(v1.contains("Jill"));

		// Check if collection is empty
		System.out.println(v1.isEmpty());

		// Iterate over Vector
		Vector v2 = new Vector();
		Collections.addAll(v2, "Ram", "Ravi","Raman","Kavi");
		Iterator it1 = v2.iterator();
		while(it1.hasNext()) {
			String s1 = (String) it1.next();
			System.out.println(s1);
		}

		// Add element at specific index position
		v2.add(3,"Jelly");
		System.out.println(v2);

		// Add multiple objects at specific index position
		Vector v3 = new Vector();
		Collections.addAll(v3, "Penny","Lenny");
		v1.addAll(0, v3);
		System.out.println(v1);
		
		// Get specific member from index position
		System.out.println(v1.get(1));
		
		// Replace an object at specific index position
		v1.set(0, "Ram");
		System.out.println(v1);
		
		// Get index position of specific object
		System.out.println(v1.indexOf("Ram"));
		
		// Get last position of specific object
		System.out.println(v1.lastIndexOf("Kimi"));

		/* 
		 * Additional vector functions
		 */
		
		// Add new object to vector		
		v1.addElement("Chikoo");
		System.out.println(v1);
		
		// Remove element from index position
		v1.removeElementAt(1);
		System.out.println(v1);
		
		// Retrive element from specific index position
		System.out.println(v1.elementAt(0));
		
		// Retrive first element from vector
		System.out.println(v1.firstElement());
		
		// Retrive last element from vector
		System.out.println(v1.lastElement());
		
		// Remove all elements from vector
		v1.removeAllElements();
		System.out.println(v1);
				
		// Display capacity
		System.out.println(v1.capacity());
	}
}
