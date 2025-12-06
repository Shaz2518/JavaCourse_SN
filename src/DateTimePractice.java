import java.util.Date;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;

public class DateTimePractice {

	public static void main(String[] args) {
		
		LocalDate date = LocalDate.now();
		System.out.println("Date: " + date);
		
		LocalTime time = LocalTime.now();
		System.out.println("Time: " + time);
		
		LocalDateTime datetime = LocalDateTime.now();
		System.out.println("Date & Time: " + datetime);
		
		//Formatted Date
		Date d = new Date();
		SimpleDateFormat format = new SimpleDateFormat("dd/mm/yyyy");
		String str = format.format(d);
		System.out.println(str);
		
		Date d1 = new Date();
		SimpleDateFormat format1 = new SimpleDateFormat("dd-MMMM z");
		String str1 = format1.format(d1);
		System.out.println(str1);
		
		
		

	}

}
