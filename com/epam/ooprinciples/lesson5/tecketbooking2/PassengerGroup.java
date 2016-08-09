package com.epam.ooprinciples.lesson5.tecketbooking2;

import java.util.List;

public class PassengerGroup {

	private static int id = 0;
	private List<Passenger> passengerGroup;
	private int totalPrice;
	private double groupDiscount;

	public PassengerGroup(List<Passenger> passengerGroup) {
		PassengerGroup.id++;
		this.passengerGroup = passengerGroup;
		
	}

	
	private void calculateGroupDiscount(){
		double sumDiscounts = 0;
		for(Passenger p: passengerGroup){
			//System.out.println(p.getFirstName()+p.getDiscount());
			sumDiscounts+=p.getDiscount();
					}
		groupDiscount= sumDiscounts/passengerGroup.size();
	}
	
	
	
	
	
	
	
	//getters setters
	public double getGroupDiscount() {
		calculateGroupDiscount();
		return groupDiscount;
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

	@Override
	public String toString() {
		String str = "PassengerGroup : \n";
		for(Passenger p : passengerGroup) {
			str+= p.toString();
		}
		return str;
		//return "PassengerGroup [passengerGroup=" + passengerGroup + ", totalPrice=" + totalPrice + "]";
	}


	public void addDistances(int distance) {
		for(Passenger p : passengerGroup){
			p.addDistance(distance);
			
		}
		
	}

	
	
	
	
		
}
