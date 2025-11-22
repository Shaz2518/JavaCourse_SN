package inheritancePractice;

class Main{
	int a = 10;
	int b = 5;
}

class Addition extends Main{
	int sum = a + b;
	void Sum() {
		System.out.println("Sum " + sum);
	}
	
}

class Subtraction extends Main {
	int sub = a - b;
	void Subtract() {
		System.out.println("Subtract " + sub);
	}
	
}

class Multiplication extends Main{
	int mul = a * b;
	void Multiply() {
		System.out.println("Multiply " + mul);
	}
	
}

class Division extends Main{
	int div = a/b;
	void Divide() {
		System.out.println("Divide " + div);
		
		}
	
}

public class HierarchicalInheritance_Demo {

	public static void main(String[] args) {
		Addition add = new Addition();
		add.Sum();
		
		Subtraction minus = new Subtraction();
		minus.Subtract();
		
		Multiplication multi = new Multiplication();
		multi.Multiply();
		
		Division div = new Division();
		div.Divide();
		
	

	}

}
