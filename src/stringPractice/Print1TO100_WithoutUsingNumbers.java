package stringPractice;

public class Print1TO100_WithoutUsingNumbers {

	public static void main(String[] args) {

		//Print 1-100 without using numbers
		 int one = 'A'/'A';  //Ascii value division ==> one = 1
		 String str = "dddddddddd"; //10 characters for length
		 int len = str.length();
		 
		 for(int i = one; i<=len*len; i++)
		 {
			 System.out.print(i + " ");
		 }

	}

}
