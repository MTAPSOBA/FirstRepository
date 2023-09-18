package javaCollectionInterface;

import java.util.ArrayList;
import java.util.List;

public class CreatArrayListFromCollectionExampl {

	public static void main(String[] args) {

		List<Integer> firstfivePrimeNumber =new ArrayList<>();
		
		firstfivePrimeNumber.add(2);
		firstfivePrimeNumber.add(3);
		firstfivePrimeNumber.add(5);
		firstfivePrimeNumber.add(7);
		firstfivePrimeNumber.add(11);
		
		
		List<Integer> firstTeenPrimeNumber = new ArrayList<>(firstfivePrimeNumber);
		
		List<Integer> nextFivePrimeNumber = new ArrayList<>();
		
		
		nextFivePrimeNumber.add(13);
		nextFivePrimeNumber.add(17);
		nextFivePrimeNumber.add(19);
		nextFivePrimeNumber.add(23);
		nextFivePrimeNumber.add(29);
		
		firstTeenPrimeNumber.addAll(nextFivePrimeNumber);
		
		System.out.println(firstTeenPrimeNumber);
	
		
		
		
	}

}
