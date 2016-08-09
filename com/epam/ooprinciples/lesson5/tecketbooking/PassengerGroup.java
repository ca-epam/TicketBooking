package com.epam.ooprinciples.lesson5.tecketbooking;

import java.util.List;

public class PassengerGroup {

	private static int id = 0;
	private List<Passenger> passenger;
	private int totalPrice;

	public PassengerGroup(List<Passenger> passenger) {
		(this.id)++;
		this.passenger = passenger;
	}
	
	
	
		
}
