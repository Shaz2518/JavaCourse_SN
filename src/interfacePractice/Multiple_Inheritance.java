package interfacePractice;

public class Multiple_Inheritance implements InterfaceParent1, InterfaceParent2{

	public void method() {
		System.out.println("Abstract Method Interface 1");
	}
	
	public void display() {
		System.out.println("Abstract Method Interface 2");
	}
	public static void main(String[] args) {
		InterfaceParent1 ip1 = new Multiple_Inheritance();
		ip1.method();
		ip1.method1();
		InterfaceParent1.method2();
		
		System.out.println("=====================");

		InterfaceParent2 ip2 = new Multiple_Inheritance();
		ip2.display();
		ip2.display1();
		InterfaceParent2.display2();
		
		

	}

}
