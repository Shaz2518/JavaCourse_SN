package genericPractice;

class className<I,S>
{
	I id;
	S name;
}

public class MultiTypeGenericsDemo {

	public static void main(String[] args) {
		className<Integer,String> obj = new className<>();
		obj.id = 101;
		obj.name= "Shaziya";
		
		System.out.println(obj.id);
		System.out.println(obj.name);

	}

}
