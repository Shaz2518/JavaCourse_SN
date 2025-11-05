package stringPractice;

import java.util.Arrays;

public class ReverseWord_String {

	public static void main(String[] args) {
		//Reverse Word in String.
		
		
		String str = "Welcome to Java Program";
		String rev="";
		
		String splitStr[] = str.split(" ");
		
		for(int i= splitStr.length-1; i>=0; i--)
		{
			System.out.println(splitStr[i]);
			rev = rev + splitStr[i] + " ";
		}
		System.out.println("Input String: " + str);
		System.out.println("Reverse String: " + rev);
		
		

	}

}
