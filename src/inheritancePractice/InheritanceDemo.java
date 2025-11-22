package inheritancePractice;

class A {
	int num1 = 5;
	int num2 = 10;
}

class B extends A {
	int sum = num1 + num2;
}

public class InheritanceDemo {

	public static void main(String[] args) {
		
		A obj1 = new A();
		System.out.println(obj1.num1);
		System.out.println(obj1.num2);
		
		B obj = new B();
		System.out.println(obj.num1 + " + " + obj.num2 + " = " + obj.sum );
		
		
		

	}

}
