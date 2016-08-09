package com.epam.ooprinciples.lesson5.tecketbooking;

import java.util.List;

public class Trip {
	private static int id = 0;
	private Itinary itinary;
	private PassengerGroup passengerGroup;
	private List<Ticket> tickets;

	public Trip(Itinary itinary, PassengerGroup passengerGroup) {
		super();
		Trip.id++;
		this.itinary = itinary;
		this.passengerGroup = passengerGroup;
	}



public void addPassengerGroup(){
	
	
}


private void initTickets(PassengerGroup gp, Itinary i ){
	for(Passenger p : gp.getPassengerGroup()){
		for(Flight f : itinary.getFlights()){
			tickets.add(new Ticket(p, f));
		}
	}
}
@Override
public String toString() {
	// TODO Auto-generated method stub
	String result = "";
	for(Passenger p : passengerGroup.getPassengerGroup()){
		result+= p+"\n"+itinary+"\n\n";
	}
	return result;
}
}
