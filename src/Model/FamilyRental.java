package Model;

import java.util.HashMap;

public class FamilyRental implements RentalInterface{
	private static final int MIN_RENTAL = 3;
	private static final int MAX_RENTAL = 5;
	private static final double DISCOUNT = 0.3;
	
	private HashMap<Double,AbtractRental> rentals = new HashMap<Double,AbtractRental>();
	
	public void addRental(AbtractRental rental) {
		if (rentals.size() == MAX_RENTAL) {
			throw new UnsupportedOperationException("Maximum rental included in promotion of "+ MAX_RENTAL+" exceeded."); 
		}
		
		if (rentals.containsKey(rental.getRentalCode())) {
			throw new IllegalArgumentException("The rental is already in the list.");
		}
		
		rentals.put(rental.getRentalCode(),rental);
	}
	
	@Override
	public double getPrice() {
		if (rentals.size() < MIN_RENTAL) {
			throw new UnsupportedOperationException("Minimum rental for promotion are "+ MIN_RENTAL+"."); 
		}
		
		double price = 0;
		
		for (AbtractRental rental : rentals.values()) {
			price+= rental.getPrice();
		}
				
		return price * (1-DISCOUNT);
	}
	
	public double getDiscount() {
		return this.DISCOUNT;
	}

}
