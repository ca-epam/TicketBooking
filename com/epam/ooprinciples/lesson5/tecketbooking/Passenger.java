package com.epam.ooprinciples.lesson5.tecketbooking;

public class Passenger {
	
	private static int id = 0;
	private String firstName;
	private String lastName;
	private int age;
	
	
	public Passenger(String firstName, String lastName, int age) {
		(this.id)++;
		this.firstName = firstName;
		this.lastName = lastName;
		this.age = age;
	}
	
	
	
	
}
