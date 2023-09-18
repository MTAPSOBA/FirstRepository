package javaCollectionInterface;

import java.util.ArrayList;
import java.util.Collection;

public class Collectiondemo {

	public static void main(String[] args) {
 
		Collection<String> fruitCollection = new ArrayList<>();
		
		fruitCollection.add("banana");
		fruitCollection.add("apple");
		fruitCollection.add("mango");
		fruitCollection.add("passionFruit");
		
		System.out.println(fruitCollection);
		
		System.out.println(fruitCollection.size());
		
	
		
		System.out.println(fruitCollection.contains("banana"));
		
	}

}
