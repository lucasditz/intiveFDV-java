package Model;

import java.util.Calendar;
import java.util.Date;

public class DailyRental extends AbtractRental{
	private static final double DAILYPRICE = 20;
	
	public DailyRental(Date startDate) {
		super(DAILYPRICE, startDate);
	}

	@Override
	protected void generateEndDate() {
		this.endDate.add(Calendar.DATE, 1);
	}
	
}
