package javaBasics;

public class Number_Patterns {

	public static void main(String[] args) {
		
		int num=5;
		
		for(int i=1; i<=num; i++)
		{
			for(int j=1; j<=i; j++)
			{
				if(i %2 ==0)
				{System.out.print(i);
				break;
				}	
				
			System.out.print(i);
			}
			
			System.out.println(" ");
		}

	}

}
