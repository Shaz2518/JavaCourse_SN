package exceptionHandling;

public class IndexOutOfBoundException {

	public static void main(String[] args) {
		try {
			int arr[]= {1,2,3,4};
			System.out.println(arr[5]);
		}
		
		catch(Exception e)
		{
			String str = e.getMessage();
			System.out.println("Exception Handled.\n" + str);
		}
		

	}

}
