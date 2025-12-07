package collectionPractice;

import java.util.ArrayList;

public class RemoveMultipleElements {

	public static void main(String[] args) {
		// Declaration
		ArrayList arrList = new ArrayList();
		arrList.add(100);
		arrList.add("Shaziya");
		arrList.add(null);
		arrList.add(376.273672);
		arrList.add("Shaziya");
		arrList.add(null);
		
		System.out.println(arrList);
		
		ArrayList arr = new ArrayList();
		arr.add("Shaziya");
		arr.add(null);
		
		arrList.removeAll(arr);
		System.out.println(arrList);
		
		//Check if array is empty
		boolean arrL= arr.isEmpty();
		System.out.println(arrL);
		
		arr.clear();
		System.out.println(arr.isEmpty());

	}

}
