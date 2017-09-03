package Java8Time.Java8;

import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class TimeFormatterUsingInstantTest {
	
	private TimeFormatterUsingInstant timeFormatterUsingInstant = new TimeFormatterUsingInstant();
	
	@Test
	public void testISOTimeFormatter() {
		String timeStamp = "1504075712345";
		String resultTimeStamp = timeFormatterUsingInstant.ios8061TimeFormatter(timeStamp);
		String exceptTimeStamp = "2017-08-30T01:48:32.345-05:00";
		
		assertEquals(exceptTimeStamp, resultTimeStamp);
	}
	
	@Test
	public void testISOTimeFormatter_invalidedTimeStamp() {
		String timeStamp = "";
		String resultTimeStamp = timeFormatterUsingInstant.ios8061TimeFormatter(timeStamp);
		String exceptTimeStamp = "";
		
		assertEquals(exceptTimeStamp, resultTimeStamp);
	}
}
  
