package comparatorInterface;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class StudentApp {

	public static void main(String[] args) {

		
		
	Student student1 = new Student("paul", "Traore", 4.5f, 5, 10);
	Student student2 = new Student("ALi", "Bkg", 3.5f, 7, 9);
	Student student3 = new Student("Jean", "Ilboudo", 6.5f, 1, 7);
	Student student4 = new Student("Moussa", "Ouedraogo", 5.5f, 3, 5);
	Student student5 = new Student("adama", "barra", 8.5f, 7, 8);
	Student student6 = new Student("kabir", "Nikiema", 1.5f, 9, 3);
	Student student7 = new Student("Seni", "Sana", 3.5f, 6, 7);
	
	
	List<Student> studentList = new ArrayList<>();		
	studentList.add(student1);
	studentList.add(student2);
	studentList.add(student3);
	studentList.add(student4);
	studentList.add(student5);
	studentList.add(student6);
	studentList.add(student7);
	
	System.out.println("Before sorting ----");
	
	Iterator<Student> itr =studentList.iterator();
	
	while (itr.hasNext()) {
		Student stu =itr.next();
		
		System.out.println(stu);
	}
	StudentComparatorIMPl studentComp = new StudentComparatorIMPl();
		
	Collections.sort(studentList, studentComp);
	
	 System.out.println("After sorting ----");
	
	Iterator<Student> itr2 =studentList.iterator();
	
	while (itr2.hasNext()) {
		Student stu =itr2.next();
		
		System.out.println(stu);
	}
	}

}
