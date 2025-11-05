package stringPractice;

public class ReverseAString {

	public static void main(String[] args) {
		
		//Reverse a String - Simple for-loop
		
		String str = "Hello";
		int len = str.length();
		String rev = "";
		
		System.out.println("Before Reverse: " + str);
		
		for(int i=len-1; i>=0; i--)
		{
			rev = rev + str.charAt(i);
		}
		System.out.println("Reverse String: " + rev);
		
		System.out.println("===================");
		//By toCharArrayMethod()
		
		String strg = "Welcome";
		char ch[] = strg.toCharArray();
		String reverse="";
		
		System.out.println("Before Reverse: " + strg);
		for(int i=ch.length-1; i>=0; i--)
		{
			reverse += ch[i];
		}
		System.out.println("Reverse String: " + reverse);
	}

}
