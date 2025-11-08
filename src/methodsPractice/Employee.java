package methodsPractice;

public class Employee {

	// Class variables
	int empID;
	String empName;
	double empSalary;

	// Initailze value using another method
	void SetEmployeeData(int id, String name, double sal) {

		empID = id;
		empName = name;
		empSalary = sal;

	}

	// Class method
	void displayEmployeeData() {

		System.out.println("==Employee Details===");

		System.out.println("Employee ID: " + empID);
		System.out.println("Employee Name: " + empName);
		System.out.println("Employee Salary: " + empSalary);
		System.out.println();

	}

	public static void main(String[] args) {

		// Create object of class
		Employee emp1 = new Employee();

		// Assign value using instance of a class object
		emp1.empID = 100;
		emp1.empName = "John";
		emp1.empSalary = 45600.343d;

		emp1.displayEmployeeData();

		// Assign value using another method
		Employee emp2 = new Employee();
		emp2.SetEmployeeData(101, "Alex Carey", 3672.67);
		emp2.displayEmployeeData();
	}

}
