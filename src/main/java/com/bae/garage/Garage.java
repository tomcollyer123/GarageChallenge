package com.bae.garage;

import java.util.ArrayList;
import java.util.List;

import com.bae.vehicles.Bike;
import com.bae.vehicles.Car;
import com.bae.vehicles.Lorry;
import com.bae.vehicles.Vehicle;

public class Garage {

	List<Vehicle> vehicles = new ArrayList<Vehicle>();

//	Bill calculating method
	public String billToPay() {
	

	double hourlyRate=30;
	double billToPay=0;
	
	
	Vehicle vehicle = new Vehicle();
	
    if(vehicle.getClass().getSimpleName().equals ("car")) {
	      billToPay = hourlyRate*10;
	  }
	else if(vehicle.getClass().getSimpleName().equals ("bike")) {
	   billToPay = hourlyRate*20;
	 }
	else if(vehicle.getClass().getSimpleName().equals ("lorry")) {
	    billToPay = hourlyRate*30;
	}
       
	return ("Total bill = " + billToPay); 
       
}



// Add vehicle method
	
public void addVehicles(Vehicle vehicle) {
	vehicle.add(vehicle);
	
}
// Remove vehicle method
public void removeVehicles(Vehicle vehicle) {
	vehicle.remove(vehicle);

}
// Clear all vehicles method
public void clearVehicles(Vehicle vehicle) {
	vehicle.clear(vehicle);

}
// Removing types of vehicles
public void removeTypesOfVehicles(String vehicle) {
//	  
//	if(vehicle.getClass().getSimpleName().equals ("car")) {
//		vehicle.remove(vehicle);
//	}
//	else if(vehicle.getClass().getSimpleName().equals ("bike")) {
//		vehicle.remove(vehicle);
//	}
//	else if(vehicle.getClass().getSimpleName().equals ("bike")) {
//		vehicle.remove(vehicle);
//	}
//	else System.out.println("No vehicles match this result");
//		

	List<Vehicle> vehiclesToRemove = new ArrayList<Vehicle>();
	for (Vehicle v : vehicles) {
		if (vehicle.getClass().getSimpleName().equals (vehicle)) {
			vehiclesToRemove.add(v);
		}
	}
	vehicles.removeAll(vehiclesToRemove);
	}

public void vehicles() {
	System.out.println(vehicles);
}

}
		
		
			
