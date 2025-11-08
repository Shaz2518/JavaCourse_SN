package methodsPractice;

public class Methods_Main {

	public static void main(String[] args) {
		Method_Types meth = new Method_Types();

		// No Input Params, No Return Type
		meth.message1();

		// No Input Params, Return Type
		int x = meth.message2();
		System.out.println("This method has no parameteres but return type: " + x);

		// Input Params, No Return Type
		meth.message3("Java Programming");
		meth.message4("Shaziya", 10);

		// Input Param, Return Type
		String fullName = meth.message5("Shaziya", "Shaikh");
		System.out.println("Welcome, " + fullName);

	}

}
