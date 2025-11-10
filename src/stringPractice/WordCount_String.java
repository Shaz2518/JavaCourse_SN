package stringPractice;

public class WordCount_String {

	public static void main(String[] args) {
		String str = "He   llo    and      Welcome to        Java    Cla    ss";
		int count = 1;

		for (int i = 0; i < str.length(); i++) {
			if (str.charAt(i) == ' ' && str.charAt(i + 1) != ' ') {
				count++;
			}
		}

		System.out.println("Words in String are: " + count);

	}

}
