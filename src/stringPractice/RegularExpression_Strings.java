package stringPractice;

public class RegularExpression_Strings {

	public static void main(String[] args) {
		
		String str = " 32%^%@67672Welcome 21736276371%^%^%^%^to *&*^%^$%#$#Java Program.";

		//Remove All Numbers
		String numRemv = str.replaceAll("[0-9]", "");
		System.out.println(numRemv);
		
		//Keep Only Numbers
		String numOnly = str.replaceAll("[^0-9]", "");
		System.out.println(numOnly);
		
		//Remove Alphabets.
		String alphaRemove = str.replaceAll("[a-zA-Z]", "");
		System.out.println(alphaRemove);
		
		//Keep Only Alphabets
		String alphaOnly = str.replaceAll("[^a-zA-Z]", "");
		System.out.println(alphaOnly);
		
		//Remove Junk Characters
		String junkRmv = str.replaceAll("[^a-zA-Z0-9]", "");
		System.out.println(junkRmv);
		
		//Keep Junk Characters
		String junkOnly = str.replaceAll("[a-zA-Z0-9]", "");
		System.out.println(junkOnly);
	}

}
