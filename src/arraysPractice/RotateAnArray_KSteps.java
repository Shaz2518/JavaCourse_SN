package arraysPractice;

import java.util.Arrays;

public class RotateAnArray_KSteps {

	public static void main(String[] args) {
		// Reverse an Arra
		// Rotate by K Steps

		int arr[] = { 1, 2, 3, 4, 5 };
		int k = 19;
		System.out.println("Input Array: " + Arrays.toString(arr));
		rotateArray(arr, k);
		System.out.println("Rotated Array: " + Arrays.toString(arr));
	}

	// Rotate by K Steps
	public static void rotateArray(int arr[], int k) {
		int len = arr.length;
		k = k % len; //if k is more then size of an Array, rotate array by the reminder
		reverseArray(arr, 0, len-1);
		reverseArray(arr, 0, k-1);
		reverseArray(arr, k, len-1);
	}

	//Reverse an Array- Two Pointers
	public static void reverseArray(int arr[], int start, int end) {
		while (start <= end) {
			int temp = arr[start];
			arr[start] = arr[end];
			arr[end] = temp;
			start++;
			end--;
		}
	}
}
