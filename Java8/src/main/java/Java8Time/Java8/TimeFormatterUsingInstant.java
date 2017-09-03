package Java8Time.Java8;

import java.time.Instant;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;

public class TimeFormatterUsingInstant {
	
	public String ios8061TimeFormatter(String timeStamp) {
		Long longTimeStamp = null;
		
		try {
			longTimeStamp = new Long(timeStamp);
		}catch(Exception e) {
			System.out.println("not able for covert TimeStamp to Long");;
			return "";
		}
		
		Instant instant = Instant.ofEpochMilli(longTimeStamp);
		ZonedDateTime  zonedDateTime = instant.atZone(ZoneId.of("America/Chicago"));
		
		return DateTimeFormatter.ISO_OFFSET_DATE_TIME.format(zonedDateTime);
	}
	
}
