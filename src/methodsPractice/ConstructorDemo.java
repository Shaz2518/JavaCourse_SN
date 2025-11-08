package methodsPractice;

public class ConstructorDemo {

	int a;
	int b;

	// Default Constructor
	ConstructorDemo() {
		a = 100;
		b = 300;

	}

	// Parametrized Constructor
	ConstructorDemo(int x, int y) {
		a = x;
		b = y;
	}

	void sum() {

		System.out.println(a + b);
	}

	public static void main(String[] args) {

		// Calling Defult Constructor
		ConstructorDemo cd1 = new ConstructorDemo();
		cd1.sum();

		//Calling Parametrized Constructor
		ConstructorDemo cd2 = new ConstructorDemo(500, 500);
		cd2.sum();

	}

}
