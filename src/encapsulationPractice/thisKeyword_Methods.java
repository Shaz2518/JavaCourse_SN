package encapsulationPractice;

public class thisKeyword_Methods {

	private void display(String name) {
		System.out.println("this keyword demo" + name);
	}
	
	void getData() {
		
		
		this.display("Hello");
		System.out.println("Method instance");
	}
	
	
	public static void main(String[] args) {
		
		thisKeyword_Methods thisKeyword = new thisKeyword_Methods();
		thisKeyword.getData();
		
		

	}

}
