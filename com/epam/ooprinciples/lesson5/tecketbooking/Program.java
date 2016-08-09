package com.epam.ooprinciples.lesson5.tecketbooking;

import java.util.ArrayList;
import java.util.List;

public class Program {

	public static void main(String [] args) {
		Program program = new Program();
	}
	
	private void start() {
		
		Passenger passenger1 = new Passenger("Joco", "Nagy", 27);
		Passenger passenger2 = new Passenger("Adrian", "Czigany", 26);
		
		List<Passenger> list = new ArrayList<>();
		list.add(passenger1);
		list.add(passenger2);
		
		PassengerGroup passengerGroup = new PassengerGroup(list);
		
		
		
	}
	
	
	
}
