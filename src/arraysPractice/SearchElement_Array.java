package arraysPractice;

public class SearchElement_Array {

	public static void main(String[] args) {
		int arr[]= {1,2,3,4,5,11,39,46,89,99};
		int elementSearch = 38;
		boolean status = false; //Number is not present
		for(int a : arr)
		{
			if(a==elementSearch)
			{
				System.out.println("Element Found");
				status=true;
				break;
			}
		}
		if(status == false)
		{
			System.out.println("Element NOT Found");
		}
		

	}

}
