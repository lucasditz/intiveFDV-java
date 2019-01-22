package test;

import org.junit.Test;
import static org.junit.Assert.*;
import java.util.Date;

import model.WeeklyRental;

public class WeeklyRentalTest {

	@Test
	public void testHourlylyRentalPriceIsSixty() {
		Date startDate = new Date();
		
		WeeklyRental weeklyRental = new WeeklyRental(startDate);
		
		assertEquals(60, weeklyRental.getPrice(), 0.01);
	}

}
