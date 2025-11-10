package stringPractice;

public class OccurenceOfCharacter {

	public static void main(String[] args) {

		String str = "Java String Examples aaaaaaaaaaaa";
		str = str.toLowerCase();
		char ch = 's';
		int count = 0;

		for (int i = 0; i < str.length(); i++) {
			if (str.charAt(i) == ch) {
				count++;
			}
		}
		System.out.println("Count of Character is: " + count);

	}

}
