package com.epam.ooprinciples.lesson5.tecketbooking;

import java.util.List;

public class PassengerGroup {

	private static int id = 0;
	private List<Passenger> passengerGroup;
	private int totalPrice;

	public PassengerGroup(List<Passenger> passengerGroup) {
		PassengerGroup.id++;
		this.passengerGroup = passengerGroup;
	}

	public static int getId() {
		return id;
	}

	public static void setId(int id) {
		PassengerGroup.id = id;
	}

	public List<Passenger> getPassengerGroup() {
		return passengerGroup;
	}

	public void setPassengerGroup(List<Passenger> passengerGroup) {
		this.passengerGroup = passengerGroup;
	}

	public int getTotalPrice() {
		return totalPrice;
	}

	public void setTotalPrice(int totalPrice) {
		this.totalPrice = totalPrice;
	}

	
	
	
	
		
}
