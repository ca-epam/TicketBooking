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
		
	}
	
	private void initPrize(){
		basePrize = flight.getDistance()*100;
	}
	
	

	@Override
	public String toString() {
		
		return ""+basePrize;
	}
	
}
