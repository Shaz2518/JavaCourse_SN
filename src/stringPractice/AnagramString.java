package stringPractice;

import java.util.Arrays;

public class AnagramString {

	public static void main(String[] args) {
		String str1 = "listen";
		String str2 = "silept";

		str1 = str1.toLowerCase();
		str2 = str2.toLowerCase();

		// Check length-- It should be same then only proceed.

		if (str1.length() == str2.length()) {
			char chStr1[] = str1.toCharArray();
			char chStr2[] = str2.toCharArray();

			// Sort Array
			Arrays.sort(chStr1);
			Arrays.sort(chStr2);

			//Compare both Array
			boolean result = Arrays.equals(chStr1, chStr2);
			if (result) {
				System.out.println("String is Anagram. ");
			} else {
				System.out.println("String is NOT Anagarm");
			}

		} else
			System.out.println("The Length is different-- String is not Anagram");
	}

}
