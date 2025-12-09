package lambdaexpression;

public class ChildClass {

	public static void main(String[] args) {
		ParentInterface pf = new ParentInterface() {

			@Override
			public void displayMethod() {
				System.out.println("This is Parent Interface Method");

			}

		};
		pf.displayMethod();

	}

}
