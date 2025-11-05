package arraysPractice;

import java.util.Arrays;
import java.util.Scanner;

public class GetArraysElement_FromConsole {

	public static void main(String[] args) {
		int arr[]= new int[5];
		Scanner scr = new Scanner(System.in);
		
		System.out.println("Enter Array Elements");
		for(int i=0; i<arr.length; i++)
		{
			arr[i] = scr.nextInt();
		}
		
		System.out.println("Array Elements are: " + Arrays.toString(arr));
		scr.close();

	}

}
