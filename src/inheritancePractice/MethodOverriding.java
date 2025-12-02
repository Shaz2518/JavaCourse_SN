package inheritancePractice;

class Area {

	int Calculate() {
		System.out.println("Base");
		return 5 * 10;
	}
}

class Rectangle extends Area {

	int Calculate() {
		System.out.println("Over ride Method");
		return 50 * 2;
	}
}

class Rect extends Area {

	int Calculate() {
		System.out.println("Override this.");
		return 10 * 5;
	}
}

public class MethodOverriding {

	public static void main(String[] args) {
		Area A1 = new Area();
		int recArea = A1.Calculate();
		System.out.println(recArea);

		System.out.println("============");

		Rectangle rec = new Rectangle();
		int recArea1 = rec.Calculate();
		System.out.println(recArea1);

		System.out.println("=============");

		Rect r1 = new Rect();
		int recArea2 = r1.Calculate();
		System.out.println(recArea2);

	}

}
