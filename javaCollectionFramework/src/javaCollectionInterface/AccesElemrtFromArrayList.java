package javaCollectionInterface;

import java.util.ArrayList;
import java.util.List;

public class AccesElemrtFromArrayList {

	public static void main(String[] args) {

		List<String> topProgrammingLanguage = new ArrayList<>();
		
		System.out.println(topProgrammingLanguage.isEmpty());
		
		topProgrammingLanguage.add("C");
		topProgrammingLanguage.add("java");
		topProgrammingLanguage.add("c++");
		topProgrammingLanguage.add("python");
		topProgrammingLanguage.add("net");
		System.out.println("here the top "  + topProgrammingLanguage.size() + " Programming Language in the World ");
		
	
		String BestprogrammingLanguage = topProgrammingLanguage.get(1);
		System.out.println("Best Programming language is " + BestprogrammingLanguage);
	}

}
