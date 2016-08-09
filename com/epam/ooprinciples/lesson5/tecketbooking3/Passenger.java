package com.epam.ooprinciples.lesson5.tecketbooking3;

public class Passenger {

	private static final int GOLD_PROGRAM = 50000;
	private static final int SILVER_PROGRAM = 20000;

	private static int id = 0;
	private String firstName;
	private String lastName;
	private int age;
	private int allTravelledKm;
	private IFFProgram ffProgram = null;

	public Passenger(String firstName, String lastName, int age) {
		Passenger.id++;
		this.firstName = firstName;
		this.lastName = lastName;
		this.age = age;
		this.allTravelledKm = 0;
	}

	public void addTravelledKms(final int kilometers) {
		this.allTravelledKm += kilometers;
		if (this.allTravelledKm > GOLD_PROGRAM) {
			if (this.ffProgram == null || this.ffProgram instanceof SilverFFProgram) {
				ffProgram = new GoldFFProgram();
			}
		} else if (this.allTravelledKm > SILVER_PROGRAM) {
			if (this.ffProgram == null) {
				ffProgram = new SilverFFProgram();
			}
		}
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

	public int getAllTravelledKm() {
		return allTravelledKm;
	}

	public void setAllTravelledKm(int allTravelledKm) {
		this.allTravelledKm = allTravelledKm;
	}

	public IFFProgram getFfProgram() {
		return ffProgram;
	}

	public void setFfProgram(IFFProgram ffProgram) {
		this.ffProgram = ffProgram;
	}

	@Override
	public String toString() {
		String str = firstName + " " + lastName + " (" + age + ")";
		return str;
	}

}
