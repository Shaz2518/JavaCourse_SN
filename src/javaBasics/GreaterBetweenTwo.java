package javaBasics;

import java.util.Scanner;

public class GreaterBetweenTwo {

	public static void main(String[] args) {
		System.out.println("Enter 2 numbers");
		Scanner scr = new Scanner(System.in);
		int num1 = scr.nextInt();
		int num2 = scr.nextInt();
		
		
		
		//Logic for getting larger
		if(num1 > num2)
		{
			System.out.println("Num1 is largest." + num1);
		}
		else
		{
			System.out.println("Num2 is largest." + num2);
		}
		
		System.out.println("==============================");
		//Ternary Practice
		int result= num1>num2  ? num1 : num2;
		System.out.println("Ternary result " + result);
		
		scr.close();
	}

}
