package com.epam.ooprinciples.lesson5.tecketbooking;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

import javax.annotation.Generated;

public class Program {

	public static void main(String [] args) {
		Program program = new Program();
		program.start();
	}
	
	private void start() {
		
		Passenger passenger1 = new Passenger("Joco", "Nagy", 27);
		Passenger passenger2 = new Passenger("Adrian", "Czigany", 26);
		
		List<Passenger> list = new ArrayList<>();
		list.add(passenger1);
		list.add(passenger2);
		
		PassengerGroup passengerGroup = new PassengerGroup(list);
		
		
		Flight flight1 = new Flight(123123, LocalDateTime.now(), "Bp", "London", 2000);
		Flight flight2 = new Flight(123124, LocalDateTime.now(), "London", "NY", 5000);
		Flight [] arrayFlight = { flight1, flight2 };

		Itinary itinary = new Itinary(arrayFlight);
		Trip trip = new Trip(itinary, passengerGroup);
		
		System.out.println(trip);
		
	}
	
	
	
}
