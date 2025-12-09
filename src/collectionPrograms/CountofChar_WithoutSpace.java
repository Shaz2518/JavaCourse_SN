package collectionPrograms;

import java.util.HashMap;

public class CountofChar_WithoutSpace {

	public static void getOccurrence(String str) {
		String strNew = str.toLowerCase();
		HashMap<Character, Integer> map = new HashMap<>();
		char ch[] = strNew.toCharArray();
		
		
		for(char c: ch)
		{
			if(!String.valueOf(c).isBlank()) {
				if(map.containsKey(c)) {
					map.put(c, map.get(c)+1);
				}
				else
					map.put(c, 1);
			}
		}
		
		System.out.println(strNew + map);
		
	}
	
	public static void main(String[] args) {
		getOccurrence("aa    bccc");
		getOccurrence("mada  M");
		getOccurrence("te   st");
		getOccurrence("aaabb     bbc   cdd   ddd");
		getOccurrence("    ");

	}

}
