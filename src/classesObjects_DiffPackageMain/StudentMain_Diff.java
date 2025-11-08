package classesObjects_DiffPackageMain;

import classesObjects_SameMain.ClassesObjects_SameMain;

public class StudentMain_Diff {

	public static void main(String[] args) {
		ClassesObjects_SameMain student3 = new ClassesObjects_SameMain();
		
		student3.rollNo = 3;
		student3.name = "Steve";
		student3.grade = 'C';
		student3.address = "Dubai";
		
		System.out.println("==Student Details==");
		student3.displayRollNumber();
		student3.displayStudentDetails();
		
		ClassesObjects_SameMain student2 = new ClassesObjects_SameMain();
		
		student2.rollNo = 4;
		student2.name = "Summit";
		student2.grade = 'C';
		student2.address = "India";
		
		System.out.println("==Student Details==");
		student2.displayRollNumber();
		student2.displayStudentDetails();
		

	}

}
