package com.epam.ooprinciples.lesson5.tecketbooking3;

import java.util.List;

public class PassengerGroup {

	private static int id = 0;
	private List<Passenger> passengerGroup;
	private int totalPrice;
	private int currentTotalDiscount;

	public PassengerGroup(List<Passenger> passengerGroup) {
		PassengerGroup.id++;
		this.passengerGroup = passengerGroup;
		calculateCurrentTotalDiscount();
	}

	private void calculateCurrentTotalDiscount() {
		int sum = 0;
		for (Passenger p : passengerGroup) {
			if (p.getFfProgram() != null) {
				sum += p.getFfProgram().getDiscount();
			}
		}
		this.currentTotalDiscount = sum / this.passengerGroup.size();
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

	public int getCurrentTotalDiscount() {
		return currentTotalDiscount;
	}

	public void setCurrentTotalDiscount(int currentTotalDiscount) {
		this.currentTotalDiscount = currentTotalDiscount;
	}

	@Override
	public String toString() {
		String str = "PassengerGroup : \n";
		for (Passenger p : passengerGroup) {
			str += p.toString();
		}
		return str;
	}

}
