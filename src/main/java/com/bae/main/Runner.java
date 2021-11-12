package com.bae.main;

import com.bae.garage.Garage;
import com.bae.vehicles.Bike;
import com.bae.vehicles.Car;
import com.bae.vehicles.Lorry;
import com.bae.vehicles.Vehicle;

public class Runner {
	public static void main(String[] args) {
		
		
//	Creating new objects	
		Garage garage = new Garage();
		Car car = new Car(4, "blue", 1, 5, 5, 1.8, "petrol");	
		Bike bike = new Bike(2, "black", 2, 0, "yamaha", "R1", 200);
		Lorry lorry = new Lorry(18, "yellow", 3, 2, "twin cab", 20, 18.5);
		
//	Adding objects
		
		garage.addVehicles(car);	
		garage.addVehicles(bike);
		garage.addVehicles(lorry);
		
	garage.removeTypesOfVehicles("Car");
		
	
	
	} 

}

