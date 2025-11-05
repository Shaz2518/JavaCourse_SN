package stringPractice;

public class Mutable_Immutable {

	public static void main(String[] args) {
		String str = "Welcome";
		
		str.concat(" Training");
		System.out.println(str);
		
		
		StringBuilder sb = new StringBuilder("Welcome");
		sb.append("\tTo Java");
		
		System.out.println("String Builder: " + sb);
		
		StringBuffer sbf = new StringBuffer("\tTraining");
		sb.append(sbf);
		System.out.println("String Buffer: " + sb);
	
		
	}

}
