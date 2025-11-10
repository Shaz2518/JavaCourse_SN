package encapsulationPractice;

public class thisKeyword_Constructor {

	thisKeyword_Constructor(){
		this(300,677);
		System.out.println("Default Constructor");
		
	}
	
	thisKeyword_Constructor(int a, int b){
		System.out.println(a+b);
	}
	
	
	public static void main(String[] args) {
		thisKeyword_Constructor construc = new thisKeyword_Constructor();
		
		

	}

}
