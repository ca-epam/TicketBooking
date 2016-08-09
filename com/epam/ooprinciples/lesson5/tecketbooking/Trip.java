package com.epam.ooprinciples.lesson5.tecketbooking;

import java.util.ArrayList;
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
		
		initTickets(passengerGroup, itinary);
	}



public void addPassengerGroup(){
	
	
}


private void initTickets(PassengerGroup gp, Itinary i ){
	tickets = new ArrayList<>();
	for(Passenger p : gp.getPassengerGroup()){
		for(Flight f : itinary.getFlights()){
			tickets.add(new Ticket(p, f));
		}
	}
	
}
@Override
public String toString() {
	// TODO Auto-generated method stub
	int sum= 0;
	for(Ticket t: tickets){
		sum+=t.getBasePrize();
	}
	String result = "prize: "+sum+"HUF\n";
	for(Passenger p : passengerGroup.getPassengerGroup()){
		result+= p+"\n"+itinary+"\n\n";
	}
	return result;
}
}
