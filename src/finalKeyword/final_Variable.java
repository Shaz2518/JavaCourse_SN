package finalKeyword;

class TestClass {

	// Final keyword
	final int a = 100;

	// Final method

	void ParentClass() {
		System.out.println("Parent");
	}

	class Test extends TestClass {
		void ParentClass() {

		}

		void ParentDisplayMethod() {
			System.out.println("Parent");
		}
	}
}

class FinalClass{
	void display() {
		System.out.println("Final Class");
	}
}

class ChildClass extends FinalClass{
	
}

public class final_Variable {

	public static void main(String[] args) {
		TestClass obj = new TestClass();
		// obj.a=1000;
		System.out.println(obj.a);

	}

}
