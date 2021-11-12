package com.bae.vehicles;

public class Bike extends Vehicle {

// Attributes
	private String make;
	private String model;
	private int topspeed;
	
//	Constructors
	
	public Bike(int numberofwheels, String colour, int vehicleID, int numberofdoors, String make, String model, int topspeed) {
		super(numberofwheels, colour, vehicleID, numberofdoors);
		this.make = make;
		this.model = model;
		this.topspeed = topspeed;
	}



	public Bike(int numberofwheels, String colour, int vehicleID, int numberofdoors) {
		super(numberofwheels, colour, vehicleID, numberofdoors);
	}

// Getters and Setters

	public String getMake() {
		return make;
	}



	public void setMake(String make) {
		this.make = make;
	}



	public String getModel() {
		return model;
	}



	public void setModel(String model) {
		this.model = model;
	}



	public int getTopspeed() {
		return topspeed;
	}



	public void setTopspeed(int topspeed) {
		this.topspeed = topspeed;
	}


}



