package staticKeywordPractice;

public class StaticKeyword_Demo {

	//Variables
	int rollNum;
	char grade;
	static String city = "Mumbai";
	
	
	//methods
	void displayExp() {
		
		System.out.println("Non Static Method");
	}
	
	static void displaySt() {
		
		System.out.println("Static Method");
	}
	 
	public static void main(String[] args) {
		
		//Non Static method and varibale. --> Need to create obj of the class
		StaticKeyword_Demo obj = new StaticKeyword_Demo();
		System.out.println(obj.grade);
		obj.displayExp();
		
		//Static method and variable
		System.out.println(city);
		displaySt();

	}

}
