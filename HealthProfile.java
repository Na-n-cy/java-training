package Encapsulation;
import java.util.Scanner;
	class HealthProfile {
	private double weight; 
	private double height; 
	public HealthProfile(double weight, double height) {
	this.weight = weight;
	this.height = height;
	}
	public double getWeight() {
	return weight;
	}
	public void setWeight(double weight) {
	if (weight > 0) {
	this.weight = weight;
	}
	}
	public double getHeight() {
	return height;
	}
	
	public void setHeight(double height) {
	if (height > 0) {
	this.height = height;
}
	}
	public double calculateBMI() {
		return weight / (height * height);
		}
		}
		public class Main {
		public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter your weight in kg: ");
		double weight = scanner.nextDouble();
		System.out.print("Enter your height in meters: ");
		double height = scanner.nextDouble();
		HealthProfile user = new HealthProfile(weight, height);
		System.out.println("\n--- Health Details ---");
		System.out.println("Weight: " + user.getWeight() + " kg");
		System.out.println("Height: " + user.getHeight() + " m");
		System.out.printf("BMI: %.2f\n", user.calculateBMI());
		System.out.print("\nEnter your updated weight (if any):");
		double newWeight = scanner.nextDouble();
		user.setWeight(newWeight);
		System.out.println("\n--- Updated Health Details ---");
		System.out.println("Updated BMI\n"+user.calculateBMI());
		scanner.close();
		}
		}



