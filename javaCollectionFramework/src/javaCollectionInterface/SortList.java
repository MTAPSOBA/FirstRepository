package javaCollectionInterface;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class SortList {

	public static void main(String[] args) {

		/*
		 * List<Integer> list= new ArrayList<Integer>();
		 * 
		 * list.add(12); list.add(34); list.add(76); list.add(90); list.add(54);
		 * list.add(19); Collections.sort(list); System.out.println(list);
		 * 
		 * Collections.reverse(list); System.out.println(list);
		 * 
		 */
		List<Employee> employees = new ArrayList<Employee>();

		employees.add(new Employee(20, "paul", 20, 12000));
		employees.add(new Employee(21, "jean", 45, 45000));
		employees.add(new Employee(22, "ali", 34, 32000));
		employees.add(new Employee(23, "george", 53, 50000));
		
	//	Collections.sort(employees, Comparator<employees>()){}
		
		

	}

	class mysort implements Comparator<Employee>{

		@Override
		public int compare(Employee o1, Employee o2) {
			return (int) (o1.getSalary()-o2.getSalary());
		}
		
		
		
	}
	
	
	
	
}
