package Encapsulation;
abstract class SmartVehicle {
 protected String modelName;
 protected double batteryCapacity; 
public SmartVehicle(String modelName, double batteryCapacity) {
     this.modelName = modelName;
     this.batteryCapacity = batteryCapacity;
 }
 public abstract double calculateRange();
 public void displayInfo() {
     System.out.println("Model: " + modelName);
     System.out.println("Battery Capacity: " + batteryCapacity + " kWh");
 }
}class ElectricCar extends SmartVehicle {

 public ElectricCar(String modelName, double batteryCapacity) {
     super(modelName, batteryCapacity);
 }
 public double calculateRange() {
     return batteryCapacity / 0.2;
 }
}
class ElectricScooter extends SmartVehicle {

 public ElectricScooter(String modelName, double batteryCapacity) {
     super(modelName, batteryCapacity);
 }
 public double calculateRange() {
     return batteryCapacity / 0.05;
 }
}
public class DashBoard {
		    public static void main(String[] args) {
		        
		        SmartVehicle vehicle;

		        vehicle = new ElectricCar("Tesla Model 3", 75);
		        vehicle.displayInfo();
		        System.out.println("Estimated Range: " + vehicle.calculateRange() + " km\n");

		        vehicle = new ElectricScooter("Ola S1", 3);
		        vehicle.displayInfo();
		        System.out.println("Estimated Range: " + vehicle.calculateRange() + " km");
		    }
		

}

