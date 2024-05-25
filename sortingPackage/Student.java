package sortingPackage;

public class Student {
	int rollno;
	String name;
	String address;
	
	public Student() {
		this.rollno = -1;
		this.name = "N/A";
		this.address = "N/A";
		
	}
	//constructor method
	public Student(int rollno, String name, String address) {
		this.rollno = rollno;
		this.name = name;
		this.address = address;
	}
	

	
	public void setRollNo (int rollno) {
		this.rollno = rollno;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public void setAddress(String address) {
		this.address = address;
	}
	
	@Override
	public String toString() {
		return "Name: "+ name +
		", Role No: " + rollno +
		", Address: " + address;
		
	}
}
	
