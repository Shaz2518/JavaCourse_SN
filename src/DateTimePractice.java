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

	}

}
