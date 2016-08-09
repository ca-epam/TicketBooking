package com.epam.ooprinciples.lesson5.tecketbooking2;

public class Ticket {
	private int basePrize;
	private int discountedPrize;
	private Passenger passenger;
	private Flight flight;
	public Ticket(double discount, Flight flight) {
		super();
	
		this.flight = flight;
		initPrize();
		calculateDiscountedPrize(discount);
		
	}
	
	private void initPrize(){
		basePrize = flight.getDistance()*100;
		
	}
	
	private void calculateDiscountedPrize(double discount){
		discountedPrize = (int) (basePrize - basePrize*discount/100);
		
	}

	@Override
	public String toString() {
		
		return ""+basePrize+"HUF\nDiscounted prize: "+discountedPrize+"HUF";
	}

	public int getBasePrize() {
		return basePrize;
	}

	public int getDiscountedPrize() {
		return discountedPrize;
	}
	
}
