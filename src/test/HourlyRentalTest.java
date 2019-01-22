package test;

import org.junit.Test;
import static org.junit.Assert.*;
import java.util.Date;

import model.HourlyRental;


public class HourlyRentalTest {

	@Test
	public void testHourlylyRentalPriceIsFive() {
		Date startDate = new Date();
		
		HourlyRental hourlyRental = new HourlyRental(startDate);
		
		assertEquals(5, hourlyRental.getPrice(), 0.01);
	}
	
}
