package stringPractice;

import java.util.Arrays;

public class ReverseEachWordInString {

	public static void main(String[] args) {
		String str = "Hello World and Welcome";
		String ch[] = str.split(" ");  //SPlit String

		System.out.println("String Before: " + str);

		// Reverse a String
		String rev = "";
		
		for (String word : ch)  //For Traversing each word in charater Array
		{
			String reverseWord = "";
			for (int i = word.length() - 1; i >= 0; i--) //For reversing each word
			{
				reverseWord = reverseWord + word.charAt(i);
			}
			rev = rev  + reverseWord + " ";  //Concatenating all words

		}
		System.out.println("Reverse String is: " + rev);

	}

}
