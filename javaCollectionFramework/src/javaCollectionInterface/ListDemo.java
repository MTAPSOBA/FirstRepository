package javaCollectionInterface;

import java.util.ArrayList;
import java.util.List;

public class ListDemo {

	public static void main(String[] args) {

		List<String>  list = new ArrayList<>();
		
		//List accept duplicate
		//List accept null
		list.add("element1");
		list.add("element1");
		list.add("element2");
		list.add("element3");
		list.add("element4");
		
		System.out.println(list);
	}

}
