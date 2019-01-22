package Test;

import static org.junit.jupiter.api.Assertions.*;
import java.util.Date;
import org.junit.jupiter.api.Test;
import Model.WeeklyRental;

class WeeklyRentalTest {

	@Test
	void testHourlylyRentalPriceIsSixty() {
		Date startDate = new Date();
		
		WeeklyRental weeklyRental = new WeeklyRental(startDate);
		
		assertEquals(60, weeklyRental.getPrice());
	}

}
