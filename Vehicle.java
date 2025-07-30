package org.Vehicle;

public class Vehicle {
	String vehicle;
	String fuel;
	int price;
	Vehicle(String vehicle,String fuel,int price) {
		this.vehicle=vehicle;
		this.fuel=fuel;
		this.price=price;
	}
	void vehicleType() {
		System.out.println("Vehicle:"+vehicle);
		System.out.println("Price:"+price);
	}
	void fuelType() {
		System.out.println("fuel:"+fuel);
	}
}
