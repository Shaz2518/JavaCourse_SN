package exceptionHandling;

import java.util.Scanner;

public class ArithmeticExceptionDemo {

	public static void main(String[] args) {
		try {
			System.out.println("Enter a number");
			Scanner scr = new Scanner(System.in);
			int num = scr.nextInt();
			
			
		}
		
		catch(ArithmeticException e)
		{
			System.out.println("Arithmetic Exception");
			String str = e.getMessage();
			System.out.println("Exception Occurred: " + str);
		}
		
		
		
		
		finally{
			System.out.println("Exception Handled");
		}
		

	}

}
