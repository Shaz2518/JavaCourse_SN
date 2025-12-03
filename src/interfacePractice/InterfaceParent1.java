package interfacePractice;

public interface InterfaceParent1 {
	
	void method();
	default void method1() {
		System.out.println("Default Method --> Interface 1");
	}
	static void method2() {
		System.out.println("Static Method --> Interface 1");
	}

}
