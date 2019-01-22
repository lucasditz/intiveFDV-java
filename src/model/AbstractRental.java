package model;
import java.util.Calendar;
import java.util.Date;

public abstract class AbstractRental implements RentalInterface {
	protected static double rentalSerialCode = 1;
	
	protected double rentalCode;
	protected Calendar startDate = Calendar.getInstance();
	protected Calendar endDate = Calendar.getInstance();
	protected double price;
	
	protected abstract void generateEndDate();
	
	protected AbstractRental(double price, Date startDate) {
		this.price = price;
		setStartDate(startDate);
		rentalCode = rentalSerialCode;
		rentalSerialCode++;
	}
	
	public double getRentalCode() {
		return rentalCode;
	}
	
	public Date getStartDate() {
		return startDate.getTime();
	}
	
	public void setStartDate(Date startDate) {
		this.startDate.setTime(startDate);
		generateEndDate();
	}
	
	public Date getEndDate() {
		return endDate.getTime();
	}
	
	public double getPrice() {
		return price;
	}
}
