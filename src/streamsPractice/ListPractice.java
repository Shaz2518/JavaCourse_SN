package streamsPractice;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ListPractice {

	public static void main(String[] args) {
		/*
		//Aproach-1
		List<String> list = new ArrayList<>();
		
		//Adding Elements
		list.add("Shaziya");
		list.add("Alex");
		list.add("John");
		list.add("Alex");
		
		System.out.println(list);
		
		//Removing Elements
		list.remove("Shaziya");
		System.out.println(list);
		
		//Updating Elemens
		list.set(1, "Shaz");
		System.out.println(list);
		*/
		
		//Approach-2
		List<String> names = Arrays.asList("John", "Amar", "Akbar", "Anthony");
		System.out.println(names);
		
		//names.add("Hello");
		//System.out.println(names);
		
		//names.remove(3);
		//System.out.println(names);
		
		names.set(1, "Shaz");
		System.out.println(names);
		
		

	}

}
