package com.epam.ooprinciples.lesson5.tecketbooking;

import java.time.LocalDateTime;

public class Flight {
	private int flightCode;
	private LocalDateTime date;
	private String origin;
	private String departure;
	private int distance;
	
	public Flight(int flightCode, LocalDateTime date, String origin, String departure, int distance) {
		this.flightCode = flightCode;
		this.date = date;
		this.origin = origin;
		this.departure = departure;
		this.distance = distance;
	}

	public int getFlightCode() {
		return flightCode;
	}

	public LocalDateTime getDate() {
		return date;
	}

	public String getOrigin() {
		return origin;
	}

	public String getDeparture() {
		return departure;
	}

	public int getDistance() {
		return distance;
	}

	@Override
	public String toString() {
		return origin+"-"+departure+" ("+distance+"km)";
	}
	
	
}
