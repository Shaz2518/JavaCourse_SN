package stringPractice;

public class RemoveWhiteSpace_String {

	public static void main(String[] args) {
		
		//Remove White Space from Start and End - Single Word
		
		String strWord = "      He     llo      ";
		
		System.out.println(strWord.trim());
		System.out.println(strWord.replaceAll("\\s", ""));
		
		System.out.println("===================");
		//Remove White Space from Start and End - Multiple Word
		
		String strSent = "      We  lc ome          to JAV   A Train     ing    !";
		System.out.println(strSent.trim());
		System.out.println(strSent.replaceAll("\\s", ""));
		

	}

}
