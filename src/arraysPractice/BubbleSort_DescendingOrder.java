package arraysPractice;

import java.util.Arrays;

public class BubbleSort_DescendingOrder {

	public static void main(String[] args) {
		int arr[] = { 10, 33, 45, 8, 6, 99, 77, 22,0};
		System.out.println("Input Array: " + Arrays.toString(arr));
		
		for(int i=0; i<arr.length; i++)
		{
			for(int j= i+1; j<arr.length; j++)
			{
				if(arr[i] < arr[j])
				{
					int temp = arr[i];
					arr[i] = arr[j];
					arr[j] = temp;				}
			}
		}
		System.out.println("Sorted Array: " + Arrays.toString(arr));
		


	}

}
