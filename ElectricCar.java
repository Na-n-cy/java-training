package org.Vehicle;

public class ElectricCar extends Car{
	ElectricCar(String vehicle,String fuel,int price,String model,String brand){
		super(vehicle,fuel,price,model,brand);
		}
	void Batterycapacity() {
		System.out.println("75kwh");
	}
	public static void main(String[]args) {
		ElectricCar e1=new ElectricCar("four wheeler","Electric",1830000,"model 3","tesla");
		e1.Batterycapacity();
		e1.carModel();
		e1.carBrand();
		e1.vehicleType();
		e1.fuelType();
		
	}
}
