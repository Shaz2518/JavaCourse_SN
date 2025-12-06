package typeCasting;

public class TypeCastingDemo {

	public static void main(String[] args) {
		
		//UpCasting
		int a = 100;
		long longVal = a;
		System.out.println(longVal);
		
		float floatVal = 100.86f;
		double doubleVal = floatVal;
		System.out.println(doubleVal);
		
		//DownCasting
		float floatValue = 367.78f;
		int intValue = (int)floatValue;
		System.out.println(intValue);
		
		double doubleV = 232635.6723716;
		int intValueP = (int)doubleV;
		System.out.println(intValueP);

	}

}
