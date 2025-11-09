package polymorphism_MethodOverloading;

public class AdditionMain {

	public static void main(String[] args) {

		Addition obj = new Addition();
		
		obj.sum();
		obj.sum(10, 20);
		obj.sum(99, 0.99);
		obj.sum(99.34, 1);
		obj.sum(67, 273, 2137);

	}

}
