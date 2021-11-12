package com.bae.vehicles;

public class Vehicle {
// Attributes
	private int numberofwheels;
	private String colour;
	private int vehicleID;
	private int numberofdoors;
	

	// Constructors
	public Vehicle(int numberofwheels, String colour, int numberofdoors , int vehicleID) {
	super();
	this.numberofwheels = numberofwheels;
	this.colour = colour;
	this.numberofdoors = numberofdoors;
	this.vehicleID = vehicleID;
	}
	
	
public Vehicle() {
		super();
	}


//	Getters and Setters
	public int getNumberofwheels() {
		return numberofwheels;
	}

	public void setNumberofwheels(int numberofwheels) {
		this.numberofwheels = numberofwheels;
	}
	public String getColour() {
		return colour;
	}
	public void setColour(String colour) {
		this.colour = colour;
	}
	public int getNumberofdoors() {
		return numberofdoors;
	}
	public void setNumberofdoors(int numberofdoors) {
		this.numberofdoors = numberofdoors;
	}

	public int getVehicleID() {
		return vehicleID;
	}


	public void setVehicleID(int vehicleID) {
		this.vehicleID = vehicleID;
	}

	
//	toString



	@Override
	public String toString() {
		return "Vehicle [numberofwheels=" + numberofwheels + ", colour=" + colour + ", numberofdoors, " + numberofdoors
				+ + vehicleID + "vehicleID=]"; 
	}


	public void add(Vehicle vehicle) {
		
		
	}


	public void remove(Vehicle vehicle) {
	
		
	}


	public void clear(Vehicle vehicle) {
		
		
	}
	
	
}
