package javaCollectionCourses;

import java.util.Enumeration;
import java.util.Vector;

public class VectorExample {

	public static void main(String[] args) {

		Vector<String> vec = new Vector<>();
		vec.add("banana");
		vec.add("Apple");
		vec.add("mango");
		vec.add("orange");
		vec.add("passionfruit");
		vec.add("mandarin");
			
	Enumeration en = vec.elements();
		System.out.println("\nelement Are:");
		while (en.hasMoreElements())
				System.out.println(en.nextElement());
		
		
	}

}
