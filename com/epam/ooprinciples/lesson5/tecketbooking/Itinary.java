package com.epam.ooprinciples.lesson5.tecketbooking;

import java.util.List;

public class Itinary {
	private int sumOfDistances = 0;
	private List<Flight> flights;
	
	public Itinary(List<Flight> flights) {
		super();
		this.flights = flights;
		calculateDistance();
	}
	
	private void calculateDistance(){
		
		for (Flight flight: flights) {
			sumOfDistances+=flight.getDistance();
		}
	}

	int getSumOfDistances() {
		return sumOfDistances;
	}

	public List<Flight> getFlights() {
		return flights;
	}

	
	
}
