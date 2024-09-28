package test;

import java.util.*;

public class TestClass {
	public static void main(String[] args) {

		// Declaring empty LinkedList
		LinkedList l1 = new LinkedList();
		
		// You cannot mention size of linked list
		// LinkedList l2 = new LinkedList(10); // Error
		
		// Add multiple members to linkedlist
		Collections.addAll(l1, "Jim","Kimi","Simi","Kimi","Jim","null",35);
		System.out.println(l1);
		
		/*
		 * Functions specific to Collection or List Interface
		 */
		
		// Display total size of linkedlist
		System.out.println(l1.size());
		
		// Remove element by name
		l1.remove("Jim");
		System.out.println(l1);
		
		// Add more elements to linkedlist
		Collections.addAll(l1, "Jack", "Zoro");
		System.out.println(l1);
		
		// Remove multiple value
		ArrayList a2 = new ArrayList();
		Collections.addAll(a2, "Jack","Ram" );
		l1.removeAll(a2);		
		System.out.println(l1);
		
		// Retain specific elements
		ArrayList a3 = new ArrayList();
		Collections.addAll(a3, "Zoro","Simi" );
		l1.retainAll(a3);
		System.out.println(l1);

		// Remove all elements
		l1.clear();
		System.out.println(l1);

		// Check if object is present
		// System.out.println(11.contains("Jim"));
		// contains does not work
		
		// Check if collection is empty
		System.out.println(l1.isEmpty());
		
		// Iterate over LinkedList
		LinkedList l3 = new LinkedList();
		Collections.addAll(l3, "Jim","Jimi","Kim","Kimi");
		Iterator it1 = l3.iterator();
		while(it1.hasNext()) {
			String s1 = (String) it1.next();
			System.out.println(s1);
		}
		
		// Add multiple objects at specific index position
		ArrayList a5 = new ArrayList();
		Collections.addAll(a5, "Penny","Lenny");
		l3.addAll(2, a5);
		System.out.println(l3);
		
		// Get specific member from index position
		System.out.println(l3.get(3));
		
		// Get index position of specific object
		System.out.println(l3.indexOf("Ram"));
					
		// Get last position of specific object
		System.out.println(l3.lastIndexOf("Kimi"));
				
		/*
		 *  Additional LinkedList functions
		 */
		
		l1.addFirst("Demi");
		l1.addFirst("Semi");
		l1.addFirst("Demi");
		System.out.println(l1);
		
		l1.addLast("God");
		System.out.println(l1);
		
		System.out.println(l1.getFirst());
		
		System.out.println(l1.getLast());
		
		System.out.println(l1.removeLast());
		
		System.out.println(l1.removeFirst());
	}
}
