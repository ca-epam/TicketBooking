package com.epam.ooprinciples.lesson5.tecketbooking;

public class Ticket {
	private int basePrize;
	private int discountedPrize;
	private Passenger passenger;
	private Flight flight;
	public Ticket(Passenger passenger, Flight flight) {
		super();
		this.passenger = passenger;
		this.flight = flight;
		initPrize();
		
	}
	
	private void initPrize(){
		basePrize = flight.getDistance()*100;
		
	}
	
	

	@Override
	public String toString() {
		
		return ""+basePrize+"HUF";
	}

	public int getBasePrize() {
		return basePrize;
	}

	public int getDiscountedPrize() {
		return discountedPrize;
	}
	
}
