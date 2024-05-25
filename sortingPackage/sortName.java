package sortingPackage;

import java.util.*;

public class sortName implements Comparator<Student>{
	
	@Override
	public int compare(Student student1, Student student2) {
		Student s1 = (Student)student1;
		Student s2 = (Student)student2;
		
		return s1.name.compareToIgnoreCase(s2.name);
	}

}
