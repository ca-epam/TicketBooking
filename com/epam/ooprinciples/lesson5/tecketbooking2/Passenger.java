package com.epam.ooprinciples.lesson5.tecketbooking2;


public class Passenger {
	
	private static int id = 0;
	private String firstName;
	private String lastName;
	private int age;
	private int distance;
	FFProgram ffProgram = null;
	
	
	public Passenger(String firstName, String lastName, int age) {
		Passenger.id++;
		this.firstName = firstName;
		this.lastName = lastName;
		this.age = age;
		distance=0;
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

	public double getDiscount(){
		if(ffProgram!=null){
			return ffProgram.getDiscount();
		}
		return 0;
	}
	public void addDistance(int distance) {
		this.distance += distance;
			if (this.distance>100000){
				ffProgram = new GoldFFProgram();
			}else if(this.distance>50000){
				ffProgram= new SilverFFProgram();
			}
	}
	public void setAge(int age) {
		this.age = age;
	}



	public void booking() {
		
	}



	@Override
	public String toString() {
		String str = firstName + " " + lastName + " (" + age + ")";
		return str;
	}
	
	
	
	
	
}
