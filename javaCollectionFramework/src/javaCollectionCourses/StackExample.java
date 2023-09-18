package javaCollectionCourses;

import java.util.Iterator;
import java.util.Stack;

public class StackExample {

	public static void main(String[] args) {

	Stack<String> stack = new Stack<String>();
	
	stack.push("dog");
	stack.addElement("boy");
	
	Iterator<String> iter = stack.iterator();

	while (iter.hasNext()) {
		 
		System.out.println(iter.next());
	}
	
	}
}