package org.Vehicle;

public class Car extends Vehicle{
	String model;
	String brand;
	Car(String vehicle,String fuel,int price,String model,String brand){
		super(vehicle,fuel,price);
		this.model=model;
		this.brand=brand;
	}
	void carModel() {
		System.out.println("model:"+model);
	}
	void carBrand() {
		System.out.println("Brand:"+brand);
	}
}
