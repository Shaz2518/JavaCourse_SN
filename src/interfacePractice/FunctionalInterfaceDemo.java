package interfacePractice;

@FunctionalInterface
interface FunctionalInt {

	void method();

	default void method1() {
		System.out.println("Default method1");
	}

	default void method2() {
		System.out.println("Default method2");
	}

	static void method3() {
		System.out.println("Static method1");
	}

	static void method4() {
		System.out.println("Static method2");
	}
}

public class FunctionalInterfaceDemo implements FunctionalInt {

	public void method() {
		System.out.println("Functional Interface Method");

	}
	
	public static void main(String[] args) {

		FunctionalInterfaceDemo fid = new FunctionalInterfaceDemo();
		// Abstract Method
		fid.method();

		// Default Method
		fid.method1();
		fid.method2();

		// Static Method
		FunctionalInt.method3();
		FunctionalInt.method4();

	}

	

}
