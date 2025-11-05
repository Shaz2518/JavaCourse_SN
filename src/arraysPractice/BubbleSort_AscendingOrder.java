package arraysPractice;

import java.util.Arrays;

public class BubbleSort_AscendingOrder {

	public static void main(String[] args) {
		// Sort an Array using Bubble Sort.
		// Bubble Sort is a sorting technique which take individual value
		// from array and compare with subsequent value and swap as necessary

		int arr[] = { 10, 33, 45, 8, 6, 99, 77, 22,0};

		System.out.println("Input Array: " + Arrays.toString(arr));

		// Outer for loop to take 1 value
		for (int i = 0; i < arr.length; i++) {
			// Inner for loop to compare i vakue with subsequent element
			for (int j = i + 1; j < arr.length; j++) {
				// Condtion to check if element at i is greater than j. (Yes, Swap)
				if (arr[i] > arr[j]) {
					int temp = arr[i];
					arr[i] = arr[j];
					arr[j] = temp;
				}
			}
		}
		System.out.println("Sorted Array: " + Arrays.toString(arr));
	}

}
