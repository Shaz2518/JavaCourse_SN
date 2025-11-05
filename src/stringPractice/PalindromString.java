package stringPractice;

public class PalindromString {

	public static void main(String[] args) {
		String str = "raceCAR";
		String rev = "";
		
		System.out.println("Input String: " + str);
		for(int i = str.length()-1; i>=0; i--)
		{
			rev += str.charAt(i);
		}
		System.out.println("Reverse String: " + rev);
		
		//Check Palindrom
		if(str.equalsIgnoreCase(rev))
		{
			System.out.println("String is Palindrom");
		}
		else
		{
			System.out.println("String is not Palindrom");
		}

	}

}
