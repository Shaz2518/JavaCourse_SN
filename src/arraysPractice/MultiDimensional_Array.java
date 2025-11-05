package arraysPractice;

public class MultiDimensional_Array {

	public static void main(String[] args) {
		// Approach 1
		int arr[][] = new int[3][3];
		arr[0][0] = 1;
		arr[0][1] = 0;
		arr[0][2] = 1;

		arr[1][0] = 0;
		arr[1][1] = 1;
		arr[1][2] = 0;

		arr[2][0] = 1;
		arr[2][1] = 0;
		arr[2][2] = 1;

		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[0].length; j++) {
				System.out.print(arr[i][j] + " ");
			}
			System.out.println();
		}

		System.out.println("=============");

		// Approach 2
		int brr[][] = { { 1, 1, 1 }, { 0, 0, 0 }, { 1, 0, 1 } };

		for (int x[] : brr) {
			for (int y : x) {
				System.out.print(y + " ");
			}
			System.out.println();
		}

	}

}
