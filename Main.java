package ploymorphism;

class Animal{
	void Sound() {
		System.out.println("Animal makes a sound");
		}
	void eat() {
		System.out.println("Animal eats");
	}
	void eat(String food) {
		System.out.println("Animal eats "+food);
	}
}
class Dog extends Animal{
	void Sound() {
		System.out.println("Dog barks");
	}
	void eat(int quantity) {
		System.out.println("dog eats "+quantity+" times a day");
	}
}

public class Main {
	public static void main(String[]args) {
		Animal a=new Animal();
		a.Sound();
		a.eat();
		a.eat("grass");
		Dog d=new Dog();
		d.Sound();
		d.eat("bones");
		d.eat(3);
		
	}
}
