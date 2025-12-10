package streamsPractice;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ForEachExample {

	public static void main(String[] args) {
		List<Integer> values = Arrays.asList(23,25,1,23,5,8,7,9);
		
		//Iterate using for loop
		for(int i=0; i<values.size(); i++)
		{
			System.out.println(values.get(i));
		}
		System.out.println("============");
		//Iterate using enhanced for loop
		for(Integer i : values ) {
			System.out.println(i);
		}
		System.out.println("============");
		//Iterate using foreach loop
		values.forEach(n->System.out.println(n));
		

	}

}
