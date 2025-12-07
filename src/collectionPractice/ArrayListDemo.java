package collectionPractice;
import java.util.*;
public class ArrayListDemo {

	public static void main(String[] args) {
		
		//Declaration
		ArrayList arrList = new ArrayList();
		arrList.add(100);
		arrList.add("Shaziya");
		arrList.add(null);
		arrList.add(376.273672);
		arrList.add("Shaziya");
		arrList.add(null);
		
		
		//Size of an ArrayList
		int size = arrList.size();
		System.out.println(size);
		
		//Retrive ArrayList Element
		System.out.println(arrList);
		
		//Remove Element from index
		arrList.remove(4);
		
		//Retrive ArrayList Element
		System.out.println(arrList);
		
		//Add element at particular index
		arrList.add(4, "Hello");
		
		//Retrive ArrayList Element
		System.out.println(arrList);
	}

}
