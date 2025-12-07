package collectionPractice;

import java.util.ArrayList;
import java.util.Iterator;

public class RetriveArrayListElement {

	public static void main(String[] args) {
		// Declaration
		ArrayList arrList = new ArrayList();
		arrList.add(100);
		arrList.add("Shaziya");
		arrList.add(null);
		arrList.add(376.273672);
		arrList.add("Shaziya");
		arrList.add(null);
		
		//Retrieve All Element is ArrayList
		
		//Using for loop
		System.out.println("====for loop=====");
		for(int i=0; i<arrList.size();i++)
		{
			System.out.println(arrList.get(i));
		}
		
		//Using enhanced for loop (for each-Object Class)
		System.out.println("====for each=====");
		for(Object obj : arrList)
		{
			System.out.println(obj);
		}
		
		//Using Iterator (Parent class for Collection)
		System.out.println("====Iterator=====");
		Iterator it = arrList.iterator();
		while(it.hasNext())
		{
			System.out.println(it.next());
		}
		

	}

}
