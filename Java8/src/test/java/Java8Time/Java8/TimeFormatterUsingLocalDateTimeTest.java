package Java8Time.Java8;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class TimeFormatterUsingLocalDateTimeTest {
	
	
	private TimeFormatterUsingLocalDateTime timeFormatterUsingLocalDateTime = new TimeFormatterUsingLocalDateTime();
	
	@Test
	public void testISOTimeFormatter() {
		String timeStamp = "Sun Sep 03 16:02:00 EDT 2017";
		String wantedTimeStamp = timeFormatterUsingLocalDateTime.DateFormatter(timeStamp);
		String exceptTimeStamp = "2017-09-03T16:02:00-05:00";
		
		assertEquals(exceptTimeStamp, wantedTimeStamp);
	}
	
	@Test
	public void testISOTimeFormatter_invalidedTimeStamp() {
		String timeStamp = "Sat Sep 03 16:02:00 EDT 2017";
		String wantedTimeStamp = timeFormatterUsingLocalDateTime.DateFormatter(timeStamp);
		String exceptTimeStamp = "";
		
		assertEquals(exceptTimeStamp, wantedTimeStamp);
	}
	
}
