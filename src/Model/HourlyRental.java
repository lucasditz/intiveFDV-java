package Model;

import java.util.Calendar;
import java.util.Date;

public class HourlyRental extends AbtractRental{
	private static final double HOURLYPRICE = 5;
	
	public HourlyRental(Date startDate) {
		super(HOURLYPRICE, startDate);
	}

	@Override
	protected void generateEndDate() {
		this.endDate.add(Calendar.HOUR_OF_DAY, 1);
	}
	
}
