package com.bae.vehicles;

public class Car extends Vehicle {

// Attributes	
	private int numberofseats;
	private double enginesize;
	private String fueltype;
	
		
//	Constructors
	
	public Car(int numberofwheels, String colour, int vehicleID, int numberofdoors, int numberofseats, double enginesize,
			String fueltype) {
		super(numberofwheels, colour, vehicleID, numberofdoors);
		this.numberofseats = numberofseats;
		this.enginesize = enginesize;
		this.fueltype = fueltype;
	}


//	Getters and Setters

	public Car(int numberofwheels, String colour, int numberofdoors, int vehicleID) {
		super(numberofwheels, colour, vehicleID,  numberofdoors);
	}


	public int getNumberofseats() {
		return numberofseats;
	}


	public void setNumberofseats(int numberofseats) {
		this.numberofseats = numberofseats;
	}


	public double getEnginesize() {
		return enginesize;
	}


	public void setEnginesize(double enginesize) {
		this.enginesize = enginesize;
	}


	public String getFueltype() {
		return fueltype;
	}


	public void setFueltype(String fueltype) {
		this.fueltype = fueltype;
	}
	
	
	}
	

