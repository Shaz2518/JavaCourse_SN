package enumPractice;


public class EnumDemo {

	public static void main(String[] args) {
		
		for(DaysOfTheWeek day: DaysOfTheWeek.values())
		{
			System.out.println(day + " " + day.ordinal());
		}
		
		

	}

}
