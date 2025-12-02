package interfacePractice;

interface Book{
	
	int noOfPages = 150;
	String author = "Shaziya";
	
	void method1();
	default void method2() {
		System.out.println("Default Method");
	}
	static void method3() {
		System.out.println("Static Method");
	}
}

public class InterfaceDemo implements Book {

	public void method1() {
		System.out.println("This is abstract method");
		
	}
	public void method4(String str) {
		System.out.println(str);
	}
	public static void main(String[] args) {
		
		//Case1 --> Create Class Object
		InterfaceDemo obj = new InterfaceDemo();
		obj.method1();
		obj.method2();
		//obj.method3();  //Not possible (Static method cannot be called using Class obj
		Book.method3(); // Static method can be call by Interface name
		System.out.println("=========================");
		
		//Case2 --> Create a Interface Object
		//Book bk = new Book(); //Interface obj cannot be created
		//System.out.println("===============================");
		
		//Case3 --> Create a class obj
		Book bk = new InterfaceDemo();
		bk.method1();
		bk.method2();
		//bk.method3(); //Not possible
		Book.method3();
		
		//Case4 --> Child class method cannot be accessed using interface obj
		//bk.method4(); //Not possible
		obj.method4("Shaziya Shaikh"); //Can be accessed using Child obj


	}

}
