package javaBasics;

import java.util.Scanner;

public class Fibonacci_Number {

	public static void main(String[] args) {
		System.out.println("Enter a number");
		Scanner scr = new Scanner(System.in);
		int num = scr.nextInt();
		int a=0, b=1, c;
		for(int i=0; i<num; i++)
		{
			System.out.print(a + " ");
			c = a+b;
			b=a;
			a=c;
		}
		scr.close();
		

	}

}
