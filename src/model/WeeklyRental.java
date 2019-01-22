package model;

import java.util.Calendar;
import java.util.Date;

public class WeeklyRental extends AbtractRental{
	private static final double WEEKLYPRICE = 60;
	
	public WeeklyRental(Date startDate) {
		super(WEEKLYPRICE, startDate);
	}

	@Override
	protected void generateEndDate() {
		this.endDate.add(Calendar.DAY_OF_YEAR, 7);
	}
	
}
