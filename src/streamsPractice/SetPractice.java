package streamsPractice;

import java.util.HashSet;
import java.util.Set;

public class SetPractice {

	public static void main(String[] args) {
		
		Set<String> names = new HashSet<>();
		names.add("Hello");
		names.add("Water");
		names.add("Kite");
		
		System.out.println(names);
		
		names.remove("Water");
		System.out.println(names);
		
		
		Set<String> name = Set.of("Hello", "Water", "Kite");
		System.out.println(name);
		
		name.add("Hello");
		System.out.println(name);
		
	}

}
