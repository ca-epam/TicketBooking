package com.epam.ooprinciples.lesson5.tecketbooking3;

import java.util.List;

public class Itinary {
	private int sumOfDistances = 0;
	private Flight[] flights;

	public Itinary(Flight[] flights) {
		this.flights = flights;
		calculateDistance();
	}

	private void calculateDistance() {
		for (Flight flight : flights) {
			sumOfDistances += flight.getDistance();
		}
	}

	int getSumOfDistances() {
		return sumOfDistances;
	}

	public Flight[] getFlights() {
		return flights;
	}

	@Override
	public String toString() {
		String result = "";
		for (Flight f : flights) {
			result += f + "\n";
		}
		return result;
	}

}
