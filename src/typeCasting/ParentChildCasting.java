package typeCasting;

class Parent {

	int a = 100;

	void method() {
		System.out.println("Parent Method");
	}

}

class Child extends Parent {
	int b = 200;

	void displaySum() {
		int sum = a + b;
		System.out.println(sum);
	}
}

public class ParentChildCasting {

	public static void main(String[] args) {
		// With Child class Object
		Child ch = new Child();
		System.out.println(ch.a);
		ch.method();
		System.out.println(ch.b);
		ch.displaySum();
		
		//With Parent Class and Child Instance Variable
		System.out.println("======");
		Parent p = new Child();
		System.out.println(p.a);
		p.method();
		
		//With Child Class Parent Instance Variable
		System.out.println("======");
		Child c = (Child)new Parent();
		System.out.println(p.a);
		p.method();
		
		
	

	}

}
