package test;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class SampleClass {

	public static void main(String[] args) {
		List l1 = new ArrayList();
	
		// Add multiple members to ArrayList
		Collections.addAll(l1, "apple","orange","banana");
		
		// Sort list members
		Collections.sort(l1);
		System.out.println(l1);
		
		// Shuffle the list
		Collections.shuffle(l1);
		System.out.println(l1);
		
		// Reverse the list
		Collections.reverse(l1);
		System.out.println(l1);
		
		// Get element frequency
		int freq = Collections.frequency(l1, "apple");
		System.out.println("Frequency of apple: "+freq);
		
		// Create a synchronized list
		List l2 = Collections.synchronizedList(l1);
		System.out.println("Synchronized list: "+l2);
		
		

	}

}
