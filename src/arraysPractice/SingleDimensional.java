package arraysPractice;

public class SingleDimensional {

	public static void main(String[] args) {
		
		//Approach 1- Declare Array
		int arr[] = new int[3];
		arr[0] = 1;
		arr[1] = 2;
		arr[2] = 3;
		
		System.out.println("Array Elements: ");
		for(int i=0; i<arr.length; i++)
		{
			System.out.print(arr[i] + " ");
		}
		System.out.println();
		System.out.println("================");
		//Approach 2- Declare Array
		int brr[] = {10, 20, 30};
		System.out.println("Array: ");
		for(int b : brr)
		{
			System.out.print(b + " ");
		}
				
	}

}
