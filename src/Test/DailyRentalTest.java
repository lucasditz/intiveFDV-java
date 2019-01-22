package Test;

import static org.junit.jupiter.api.Assertions.*;
import java.util.Date;
import org.junit.jupiter.api.Test;

import Model.DailyRental;

class DailyRentalTest {

	@Test
	void testDaylyRentalPriceIsTwenty() {
		Date startDate = new Date();
		
		DailyRental dailyRental = new DailyRental(startDate);
		
		assertEquals(20, dailyRental.getPrice());
	}

}
