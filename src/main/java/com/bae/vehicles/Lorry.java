package com.bae.vehicles;

public class Lorry extends Vehicle {

// Attributes
	private String cabsize;
	private int length;
	private double maxload;
	
	
//	Constructors
	public Lorry(int numberofwheels, String colour, int vehicleID, int numberofdoors, String cabsize, int length, double maxload) {
		super(numberofwheels, colour, vehicleID, numberofdoors);
		this.cabsize = cabsize;
		this.length = length;
		this.maxload = maxload;
	}


public Lorry(int numberofwheels, String colour, int vehicleID, int numberofdoors) {
	super(numberofwheels, colour, vehicleID, numberofdoors);
}



//	Getters and Setters

public String getCabsize() {
	return cabsize;
}


public void setCabsize(String cabsize) {
	this.cabsize = cabsize;
}


public int getLength() {
	return length;
}


public void setLength(int length) {
	this.length = length;
}


public double getMaxload() {
	return maxload;
}


public void setMaxload(double maxload) {
	this.maxload = maxload;
}

	
}
