package javaBasics;

import java.util.Scanner;

public class Palindrom_Number {

	public static void main(String[] args) {
		System.out.println("Enter a number");
		Scanner scr = new Scanner(System.in);
		int num = scr.nextInt();
		int rev = 0, temp=num;
		
		System.out.println("Before Reverse: " + num);
		while(num !=0)
		{
			int rem = num % 10;
			rev = rev * 10 + rem;
			num = num/10;
		}
		System.out.println("After Revere: " + rev);
		if(temp==rev)
		{
			System.out.println("Number is Palindrom");
		}
		else
			System.out.println("Number is NOT Palindrom");
		scr.close();
		
		

	}

}
