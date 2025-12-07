package genericPractice;

class Container<T>
{
	T id;
	T key;
	T value;
	
	T name;
	T lastname;
	T Designation;
	
}
public class SingleTypeGenericDemo {

	public static void main(String[] args) {
		Container<Integer> obj = new Container<Integer>();
		obj.id = 101;
		obj.key = 1;
		obj.value= 1000;
		
		System.out.println(obj.id);
		System.out.println(obj.key);
		System.out.println(obj.value);
		
		Container<String> emp = new Container<String>();
		emp.name = "Shaziya";
		emp.lastname = "Shaikh";
		emp.Designation = "Engineer";
		
		System.out.println(emp.name);
		System.out.println(emp.lastname);
		System.out.println(emp.Designation);

	}

}
