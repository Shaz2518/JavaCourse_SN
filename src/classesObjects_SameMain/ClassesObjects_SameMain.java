package classesObjects_SameMain;

public class ClassesObjects_SameMain {

	public int rollNo;
	public String name;
	public char grade;
	public String address;
	
	public void displayStudentDetails() {
		System.out.println(rollNo);
		System.out.println(name);
		System.out.println(grade);
		System.out.println(address);
	}
	
	public void displayRollNumber() {
		System.out.println("Roll Number is: " + rollNo);
	}
	
	
	public static void main(String[] args) {
		ClassesObjects_SameMain student1 = new ClassesObjects_SameMain();
		
		student1.rollNo = 1;
		student1.name = "Alex";
		student1.grade = 'A';
		student1.address = "USA";
		
		System.out.println("==Student Details==");
		student1.displayRollNumber();
		student1.displayStudentDetails();
		
		ClassesObjects_SameMain student2 = new ClassesObjects_SameMain();
		
		student2.rollNo = 2;
		student2.name = "John";
		student2.grade = 'C';
		student2.address = "India";
		
		System.out.println("==Student Details==");
		student2.displayRollNumber();
		student2.displayStudentDetails();
		
		

	}

}
