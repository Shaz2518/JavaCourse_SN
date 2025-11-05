package javaBasics;

import java.util.Scanner;

public class Reverse_Number {

	public static void main(String[] args) {
		System.out.println("Enter a number");
		Scanner scr = new Scanner(System.in);
		int num = scr.nextInt();
		int rev = 0;
		
		System.out.println("Before Reverse: " + num);
		while(num !=0)
		{
			int rem = num % 10;
			rev = rev * 10 + rem;
			num = num/10;
		}
		System.out.println("After Revere: " + rev);
		
		scr.close();
		

	}

}
