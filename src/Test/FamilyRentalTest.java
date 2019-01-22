package Test;

import static org.junit.jupiter.api.Assertions.*;
import java.util.Date;
import org.junit.jupiter.api.Test;
import Model.DailyRental;
import Model.FamilyRental;
import Model.HourlyRental;
import Model.WeeklyRental;

class FamilyRentalTest {
		
	@Test
	void testWhenRentalIsAddedTwiceFamilyRentalThrowException() {
		Date startDate = new Date();
		
		HourlyRental hourlyRental1 = new HourlyRental(startDate);

		FamilyRental familyRental = new FamilyRental();
		familyRental.addRental(hourlyRental1);
		
		assertThrows(IllegalArgumentException.class, () -> {
			familyRental.addRental(hourlyRental1);
	    });
	}
	
	@Test
	void testWhenFamilyRentalAreLessThanThreeThrowException() {
		Date startDate = new Date();
		
		WeeklyRental weeklyRental1 = new WeeklyRental(startDate);
		DailyRental daylyRental1 = new DailyRental(startDate);
		
		FamilyRental familyRental = new FamilyRental();
		familyRental.addRental(weeklyRental1);
		familyRental.addRental(daylyRental1);
		
		assertThrows(UnsupportedOperationException.class, () -> {
			familyRental.getPrice();
	    });
	}
	
	@Test
	void testWhenFamilyRentalAreGraterThanFiveThrowException() {
		Date startDate = new Date();
		
		HourlyRental hourlyRental1 = new HourlyRental(startDate);
		DailyRental daylyRental1 = new DailyRental(startDate);
		WeeklyRental weeklyRental1 = new WeeklyRental(startDate);
		
		HourlyRental hourlyRental2 = new HourlyRental(startDate);
		DailyRental daylyRental2 = new DailyRental(startDate);
		WeeklyRental weeklyRental2 = new WeeklyRental(startDate);
		
		FamilyRental familyRental = new FamilyRental();
		familyRental.addRental(hourlyRental1);
		familyRental.addRental(daylyRental1);
		familyRental.addRental(weeklyRental1);
		
		familyRental.addRental(hourlyRental2);
		familyRental.addRental(daylyRental2);
		
		assertThrows(UnsupportedOperationException.class, () -> {
			familyRental.addRental(weeklyRental2);
	    });
	}
	
	@Test
	void testFamilyRentalPriceIsThirtyPercentDiscountOffAllRentalsIncluded() {
		Date startDate = new Date();
		
		HourlyRental hourlyRental1 = new HourlyRental(startDate);
		DailyRental daylyRental1 = new DailyRental(startDate);
		WeeklyRental weeklyRental1 = new WeeklyRental(startDate);
		
		HourlyRental hourlyRental2 = new HourlyRental(startDate);
		DailyRental daylyRental2 = new DailyRental(startDate);
		
		FamilyRental familyRental = new FamilyRental();
		familyRental.addRental(hourlyRental1);
		familyRental.addRental(daylyRental1);
		familyRental.addRental(weeklyRental1);
		
		familyRental.addRental(hourlyRental2);
		familyRental.addRental(daylyRental2);
		
		double priceSum = hourlyRental1.getPrice() + daylyRental1.getPrice() + weeklyRental1.getPrice() + 
				hourlyRental2.getPrice() + daylyRental2.getPrice();
		double priceWithDiscount = priceSum  * (1-familyRental.getDiscount());
		
		assertEquals(priceWithDiscount, familyRental.getPrice());
	}
	
}
