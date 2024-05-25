package sortingPackage;

import java.util.*;

public class sortRollNo implements Comparator<Student>{
	
	@Override
	public int compare(Student student1, Student student2) {
		Student s1 = (Student)student1;
		Student s2 = (Student)student2;
		
		return Integer.compare(s1.rollno, s2.rollno);
		
	}
}
