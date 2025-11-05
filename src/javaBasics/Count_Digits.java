package javaBasics;

import java.util.Scanner;

public class Count_Digits {

	public static void main(String[] args) {
		System.out.println("Enter a number");
		Scanner scr = new Scanner(System.in);
		int num = scr.nextInt();

		int count = 0;
		while (num != 0) {
			int rem = num / 10;
			count++;
			num = num / 10;
		}

		System.out.println("Count of Digits: " + count);
		scr.close();

	}

}
