package stringPractice;

public class Pangram_String {

	public static void main(String[] args) {
		String str = "The quick brown fox jumps over the lazy dog";
		str = str.toLowerCase();
		int flag = 1; // Assuming String in Pangram

		if (str.length() > 26) {
			for (char ch = 'a'; ch <= 'z'; ch++) {
				if (str.indexOf(ch) == -1) {
					flag = 0;
				}
			}
		
			
		if (flag == 1) {
			System.out.println("String is Pangram");
		} else {
				System.out.println("String is not a Pangram");
			}

		} else
			System.out.println("String Length is not matching-- Not a Pangram");

	}

}
