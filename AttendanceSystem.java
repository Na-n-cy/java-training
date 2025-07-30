package gradecalculator;
import java.util.Scanner;

class Student {
    String name;
    int rollNumber;
    String section;
    Student(String name, int rollNumber, String section) {
        this.name = name;
        this.rollNumber = rollNumber;
        this.section = section;
    }
    void displayDetails() {
        System.out.println("Name: " + name);
        System.out.println("Roll Number: " + rollNumber);
        System.out.println("Section: " + section);
    }
}

public class AttendanceSystem {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of students: ");
      System.out.print("Name: ");
        String name = sc.nextLine();
        System.out.print("Roll Number: ");
        int rollNumber = sc.nextInt();
        sc.nextLine(); 
        System.out.print("Section: ");
        String section = sc.nextLine();
    
        Student s=new Student(name,rollNumber,section);
            s.displayDetails();
            System.out.println();
            sc.close();
        }

   
    }



