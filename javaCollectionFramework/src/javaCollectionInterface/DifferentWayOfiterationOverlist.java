package javaCollectionInterface;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class DifferentWayOfiterationOverlist {

	public static void main(String[] args) {

		List<String> courses = Arrays.asList("C","C++","Java","spring","Hibernate");
		
		//basic for loop
		for(int i=0;i < courses.size();i++) {
			System.out.println(courses.get(i));
		}
		
		//Enhanced for each loop
		
		for( String course:courses) {
			
			System.out.println(course);
		};
		
		 for (Iterator iterator = courses.iterator(); iterator.hasNext();) {
			String course = (String) iterator.next();
			
			System.out.println(course);
		}
		
	}

}
