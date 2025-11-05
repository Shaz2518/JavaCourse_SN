package stringPractice;

import java.util.Arrays;

public class ReplaceOnlyAlphabets {

	public static void main(String[] args) {

		String str = "abc123pqr456xyz";

		int left = 0;
		int right = str.length() - 1;
		char ch[] = str.toCharArray();

		while (left < right) {
			
			//If Left Character is Digit-- Skip and Move to Next
			if (Character.isDigit(ch[left])) {
				left++;
			} 
			//If Right Character is Digit-- Skip and Move to Next
			else if (Character.isDigit(ch[right])) {
				right--;
			} 
			
			//If Left/Right Character is Alphabet-- Swap
			else {
				char temp = ch[left];
				ch[left] = ch[right];
				ch[right] = temp;
				left++;
				right--;
			}
		}

		System.out.println(new String(ch));

	}

}
