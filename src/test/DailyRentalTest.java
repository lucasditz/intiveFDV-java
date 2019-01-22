package test;

import org.junit.Test;
import static org.junit.Assert.*;
import java.util.Date;

import model.DailyRental;

public class DailyRentalTest {

	@Test
	public void testDaylyRentalPriceIsTwenty() {
		Date startDate = new Date();
		
		DailyRental dailyRental = new DailyRental(startDate);
		
		assertEquals(20, dailyRental.getPrice(), 0.01);
	}

}
