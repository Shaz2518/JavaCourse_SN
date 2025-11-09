package polymorphism_MethodOverloading;

public class Addition {

	// Method Overloading Types
	// 1. No Parameters
	void sum() {
		int a = 100;
		int b = 200;

		System.out.println("Method Overloading Type 1: " + (a + b));
	}

	// 2. Different Number of Paramteres
	void sum(int x, int y) {
		System.out.println("Method Overloading Type 2: " + (x + y));
	}

	// 3. Same Number of Parameters - Different Data Type
	void sum(int x, double y) {
		System.out.println("Method Overloading Type 3: " + (x + y));
	}

	// 4. Same Number of Parameters and Same DataType -- Change order of parameters
	void sum(double x, int y) {
		System.out.println("Method Overloading Type 4: " + (x + y));
	}
	
	//5. Increase the paramenters
	void sum(int x, int y, int z) {
		System.out.println("Method Overloading Type 5: " + (x+y+z));
	}

}
