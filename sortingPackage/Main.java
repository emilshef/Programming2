package sortingPackage;

import java.util.*;

public class Main {

	public static void main (String[] args) {
		
		//create an arraylist of type Student
		ArrayList<Student> studentList = new ArrayList<>();
		
		//add items to my arraylist
		studentList.add(new Student(1, "Teddy Morris", "1234 Main St."));
		studentList.add(new Student(2, "Nicole Mahan", "846 Liberty Hill Rd."));
		studentList.add(new Student(9, "Michael Dahl", "2394 Wayward Ln."));
		studentList.add(new Student(6, "Peter Lamai", "749 Little Rock Ave."));
		studentList.add(new Student(8, "Charles Woo", "1051 Morgan Way"));
		studentList.add(new Student(3, "Penelope Gomez", "860 Temple Blvd"));
		studentList.add(new Student(10, "Diana Parker", "9730 Rockland Ave."));
		studentList.add(new Student(4, "Kate London", "8640 Tannenbaum St."));
		studentList.add(new Student(7, "Brian Anderson", "4539 Renoir Circle"));
		studentList.add(new Student(5, "Woo Bin Seo", "2398 Coconut Lane"));
		
		//print out the unsorted list
		System.out.println("List before sorting: ");
		//lop to print out list
		for (Student student: studentList) {
		System.out.println(student);
		}
		
		System.out.println();
		
		//call sort method (see below) with an arraylist and comparator, print list
		selectionSort(studentList, new sortRollNo());
		System.out.println("Sorted by Roll No.: ");
			for (Student student : studentList) {
				System.out.println(student);
			}
			
		System.out.println();
		
		selectionSort(studentList, new sortName());
		System.out.println("Sorted by Name: ");
			for (Student student : studentList) {
				System.out.println(student);
			}
		

	}
	//sorting method
	public static void selectionSort(ArrayList<Student> studentList, Comparator<Student> comparator) {
		//iterate through outerloop
		  for (int i = 0; i < studentList.size() - 1; ++i) {
	            int minIndex = i;
	            //iterate through inner loop
	            for (int j = i + 1; j < studentList.size(); ++j) {
	                if (comparator.compare(studentList.get(j), studentList.get(minIndex)) < 0) {
	                    minIndex = j;
	                }
	            }

	            // Swap the elements
	            Student temp = studentList.get(minIndex);
	            studentList.set(minIndex, studentList.get(i));
	            studentList.set(i, temp);
		
	}

}
}
