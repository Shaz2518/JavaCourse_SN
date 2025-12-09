package collectionPrograms;

import java.util.HashMap;

public class CountOccurenceOfCharacter {

	public static void getOccurrence(String str) {

		HashMap<Character, Integer> map = new HashMap<>();
		String str1 = str.toLowerCase();
		char ch[] = str1.toCharArray();

		for (char c : ch) {
			if (map.containsKey(c)) {
				map.put(c, map.get(c) + 1);
			} else {
				map.put(c, 1);
			}
		}
		System.out.println(map);

	}

	public static void main(String[] args) {

		getOccurrence("aabccc");
		getOccurrence("madaM");
		getOccurrence("test");
		getOccurrence("aaabbbbccddddd");
		getOccurrence("");
	}

}
