package arraysPractice;

import java.util.Arrays;

public class Reverse_Array {

	public static void main(String[] args) {
		int arr[] = {1,2,3,4,5};
		System.out.println("Array before Reverse");
		for(int i=0; i<arr.length; i++)
		{
			System.out.print(arr[i] + " ");
		}
		System.out.println();
		System.out.println("Array After Reverse");
		for(int i= arr.length-1; i>=0; i--)
		{
			System.out.print(arr[i] + " ");
		}
		
		System.out.println("\nInbuilt Methods");
		System.out.println(Arrays.toString(arr));
		
		int brr[] = { 9, 2, 7, 5, 6};
		Arrays.sort(brr);
		System.out.println(Arrays.toString(brr));
		
		
		

	}

}
