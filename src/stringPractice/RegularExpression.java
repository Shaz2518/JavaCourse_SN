package stringPractice;

public class RegularExpression {

	public static void main(String[] args) {
		//I/P -- AuToMation
		// O/P -- ATM (Only caps no other characters)
		
		String str = "AuToMatioN";
		
		//Regular Expression
		String newStr = str.replaceAll("[^A-Z]", "");
		System.out.println(newStr);
		
		System.out.println("======");
		
		
		//For Loop and Conditions
		String result = "";
		for(int i =0; i<str.length(); i++)
		{
			char ch = str.charAt(i);
			if(Character.isUpperCase(ch))
			{
				result = result + ch;
			}
		}
		System.out.println(result);
		

	}

}
