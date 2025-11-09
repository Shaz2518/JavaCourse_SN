package methodsPractice;

public class Recursion_Demo {

	public static void main(String[] args) {
		 int n = 10;
		 printNumbers(n);
		 System.out.println("====reverse===");
		 printNumberReverse(n);
	}
	//Print numbers from 1-10
	public static void printNumbers(int x) {
		
		if(x<1)
		{
			return;
		}
		printNumbers(x-1);
		System.out.print(x + " ");
		System.out.println();
	}
	
	//Print number from 10-1
	public static void printNumberReverse(int y) {
		
		if(y<1)
		{
			return;
		}
		System.out.print(y + " ");
		printNumberReverse(y-1);
	}

}
