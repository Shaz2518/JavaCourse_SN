package collectionPractice;

import java.util.ArrayList;
import java.util.HashSet;

public class HashSetDemo {

	public static void main(String[] args) {
		HashSet hs = new HashSet();
		hs.add("Shaziya");
		hs.add(101);
		hs.add(273.732);
		hs.add("Shaziya");
		
		System.out.println(hs);
		
		//Delete value
		hs.remove(101);
		System.out.println(hs);
		
		//Convert Hashset to ArrayList
		ArrayList arr = new ArrayList(hs);
		
	}

}
