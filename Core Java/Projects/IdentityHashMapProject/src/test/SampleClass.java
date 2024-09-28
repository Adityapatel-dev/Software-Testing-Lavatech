package test;

import java.util.HashMap;
import java.util.IdentityHashMap;

public class SampleClass {
	public static void main(String[] args) {
		
		/* 
		* HashMap uses ".equals()" to identify duplicate keys, hence duplicate keys are avoided
		*/
		HashMap m1 = new HashMap();
		m1.put(new String("Sham"), 101);
		m1.put(new String("Sham"), 102);
		System.out.println(m1);
		
		/* 
		* IdentityHashMap uses "==" to identify duplicate keys, hence duplicate keys are allowed
		*/
		IdentityHashMap m2 = new IdentityHashMap();
		m2.put(new String("Sham"), 101);
		m2.put(new String("Sham"), 102);
		System.out.println(m2);
	}
}
