package arraysPractice;

public class FindNumberOfDuplicates {

	public static void main(String[] args) {
		int arr[]= { 1,2,3,2,4,2,5,3};
		int num = 3;
		int count =0;
		
		for(int x : arr)
		{
			if(x == num)
			{
				count++;
			}
		}
		System.out.println("Count of number " + num + " is: " + count);

	}

}
