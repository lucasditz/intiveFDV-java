package Test;

import static org.junit.jupiter.api.Assertions.*;
import java.util.Date;
import org.junit.jupiter.api.Test;
import Model.HourlyRental;


class HourlyRentalTest {

	@Test
	void testHourlylyRentalPriceIsFive() {
		Date startDate = new Date();
		
		HourlyRental hourlyRental = new HourlyRental(startDate);
		
		assertEquals(5, hourlyRental.getPrice());
	}
	
}
