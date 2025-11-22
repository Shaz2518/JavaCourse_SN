package inheritancePractice;


class Parent{
	int num1 =10;
	int num2 = 5;
}

class Child1 extends Parent {
	int sum = num1 + num2;
	int sub;
	
}

class Child2 extends Child1{
	int mul;
	void Display() {
		System.out.println("Sum " + sum);
		sub = num1 - num2;
	}
	
}

class Child3 extends Child2{
	
	void Multiply() {
		mul = num1 * num2;
		System.out.println("Sub " + sub);
		System.out.println("Mul " + mul);
	}
	
}
public class MultiLevelInheritance_Demo {

	public static void main(String[] args) {
		Child3 ch = new Child3();
		ch.Display();
		ch.Multiply();
		
	}

}
