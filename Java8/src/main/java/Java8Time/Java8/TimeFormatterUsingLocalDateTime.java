package Java8Time.Java8;

import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;

public class TimeFormatterUsingLocalDateTime {
	
	public String DateFormatter(String timeStamp) {
		DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern("EEE MMM dd HH:mm:ss z yyyy");
		LocalDateTime localDateTime = null;
		
		try {
			localDateTime = LocalDateTime.parse(timeStamp, dateTimeFormatter);
		} catch(DateTimeParseException e) {
			System.out.println(e);
			return "";
		}
		
		ZoneId zoneId = ZoneId.of("America/Chicago");
		ZonedDateTime zonedDateTime = localDateTime.atZone(zoneId);
		System.out.println(DateTimeFormatter.ISO_OFFSET_DATE_TIME.format(zonedDateTime));
		return DateTimeFormatter.ISO_OFFSET_DATE_TIME.format(zonedDateTime);
	}
}
