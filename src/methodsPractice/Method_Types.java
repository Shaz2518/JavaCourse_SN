package methodsPractice;

public class Method_Types {

	// No Input Params, No Return Type
	void message1() {
		System.out.println("This method has no parameters and no return type");
	}
	
	
	// No Input Params, Return Type
	int message2() {
		
		int a = 10;
		a++;
		return a;
	}
	
	// Input Params, No Return Type
	void message3(String name) {
		
		System.out.println("This method has parameters but no return type: " + name);
		
	}
	
	void message4(String name, int num)
	{
		num++;
		
		System.out.println("Name: "  + name + " " + "Integer: " + num);
	}
	
	
	// Input Param, Return Type
	String message5(String firstName, String lastName) {
		
		return firstName + " " + lastName;
		
	}

}
