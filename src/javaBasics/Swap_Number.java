package javaBasics;

import java.util.Scanner;

public class Swap_Number {

	public static void main(String[] args) {
		System.out.println("Enter 2 numbers");
		Scanner scr = new Scanner(System.in);
		
		int a = scr.nextInt(); //5
		int b = scr.nextInt(); //7
		
		//Swap without 3rd varibale
		
		System.out.println("Before Swap: " + a + " " + b);
		a = a+b; // 5+7= 12
		b= a-b;  // 12-7= 5
		a= a-b;  // 12-5 = 7
		
		System.out.println("After Swap:" + a + " " + b);
		scr.close();
		
		

	}

}
