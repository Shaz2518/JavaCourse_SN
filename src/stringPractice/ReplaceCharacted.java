package stringPractice;

public class ReplaceCharacted {

	public static void main(String[] args) {
		String str = "$123,564,655";
		
		String newStr = str.replace("$", "");
		String finalStr = newStr.replace(",", "");
		System.out.println(finalStr);

	}

}
