package comparatorInterface;

import java.util.Comparator;

public class StudentComparatorIMPl implements Comparator<Student> {

	@Override
	public int compare(Student stud1, Student stud2) {
		
		if(stud1.getHighSchoolEnglishScore() > stud2.getHighSchoolEnglishScore()) {
			return +1;
				}
		if(stud1.getHighSchoolEnglishScore() < stud2.getHighSchoolEnglishScore()) {
			return -1;
		}
		
		return 0;
	}

	}

	


