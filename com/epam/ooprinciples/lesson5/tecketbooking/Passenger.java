package com.epam.ooprinciples.lesson5.tecketbooking;

public class Passenger {
	
	private static int id = 0;
	private String firstName;
	private String lastName;
	private int age;
	
	
	public Passenger(String firstName, String lastName, int age) {
		Passenger.id++;
		this.firstName = firstName;
		this.lastName = lastName;
		this.age = age;
	}
	
	
	
	public static int getId() {
		return id;
	}

	public static void setId(int id) {
		Passenger.id = id;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}
	
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}



	public int getAge() {
		return age;
	}



	public void setAge(int age) {
		this.age = age;
	}



	public void booking() {
		
	}



	@Override
	public String toString() {
		String str = "\t" + firstName + " " + lastName + " (" + age + ")";
		return str;
	}
	
	
	
	
	
}
