package Main;

import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.text.ParseException;
import java.util.Calendar;

public class Main {

	public static void main(String[] args) throws ParseException {
		
		SimpleDateFormat sdf1 = new SimpleDateFormat("dd/MM/yyyy");
		SimpleDateFormat sdf2 = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
		
		Date x1 = new Date();
		
		Date y1 = sdf1.parse ("25/01/2024");
		Date y2 = sdf2.parse("25/01/2024 12:13:25");
		Date y3 = Date.from(Instant.parse("2024-01-2024T12:24:25Z"));
		
		System.out.println("y1: "+ sdf2.format(y1));
		System.out.println("y1: "+ sdf2.format(y2));
		System.out.println("y1: "+ sdf2.format(y2));
		
		Date d= Date.from(Instant.parse("2024-01-25T14:28:36Z"));
		
		Calendar cal = Calendar.getInstance();
		cal.setTime(d);
	}

}
