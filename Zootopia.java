package gradecalculator;
class Animal {
    String name;
    int age;

    Animal(String name, int age) {
        this.name = name;
        this.age = age;
    }

    void displayInfo() {
        System.out.println("Name: " +name);
        System.out.println("Age:"+age);
    }
}
class Bird extends Animal {
    boolean canFly;

    Bird(String name, int age, boolean canFly) {
        super(name, age);
        this.canFly = canFly;
    }
    void displayInfo() {
        System.out.println("Name: " + name + ", Age: " + age + ", Can Fly: " + (canFly ? "Yes" : "No"));
    }
}
class Mammal extends Animal {
    String Type;

    Mammal(String name, int age, String Type) {
        super(name, age);
        this.Type = Type;
    }
    void displayInfo() {
        System.out.println("Name: " + name + ", Age: " + age + ", Diet: " +Type);
    }
}
 
public class Zootopia {
	public static void main(String[] args) {
        Animal a1 = new Bird("Parrot", 2, true);
        Animal a2 = new Bird("Penguin", 3, false);
        Animal a3 = new Mammal("Tiger", 5, "Carnivore");
        Animal a4 = new Mammal("Elephant", 10, "Herbivore");
        System.out.println("zootopia Registry");
        a1.displayInfo();
        a2.displayInfo();
        a3.displayInfo();
        a4.displayInfo();
       
    }
}
