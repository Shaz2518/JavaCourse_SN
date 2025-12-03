package interfacePractice;

public interface InterfaceParent2 {

	void display();
	default void display1() {
		System.out.println("Default Method --> Interface 2 ");
	}
	static void display2() {
		System.out.println("Static Method --> Interface 2");
	}
}
