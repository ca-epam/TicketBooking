package com.epam.ooprinciples.lesson5.tecketbooking3;

public class Ticket {

	private static final int COST_PER_KILOMETER = 50;
	public static int TICKET_COUNTER = 0;

	private int basePrice;
	private int discountedPrice;
	private Flight flight;

	public Ticket(final double discount, Flight flight) {
		this.flight = flight;
		initPrice();
		Ticket.TICKET_COUNTER++;

	}

	private void initPrice() {
		basePrice = flight.getDistance() * COST_PER_KILOMETER;

	}

	private void calculateDiscountedPrize(final double discount) {
		this.discountedPrice = (int) (basePrice - basePrice * discount / 100);
	}

	public int getBasePrice() {
		return basePrice;
	}

	public int getDiscountedPrice() {
		return discountedPrice;
	}

	@Override
	public String toString() {

		return "" + basePrice + "HUF";
	}

}
