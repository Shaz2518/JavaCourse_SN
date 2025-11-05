package javaBasics;

import java.util.Scanner;

public class BMI_Calculator {

	public static void main(String[] args) {

		System.out.println("Enter a weight");
		Scanner scr = new Scanner(System.in);
		double weight = scr.nextDouble();
		
		if(weight<20)
		{
			System.out.println("Under Weight");
		}
		else if (weight>=20 && weight<25)
		{
			System.out.println("Normal Weight");
		}
		else if(weight>=25 && weight<30)
		{
			System.out.println("Over weight");
		}
		else
			System.out.println("Obsese");

		scr.close();
	}

}
