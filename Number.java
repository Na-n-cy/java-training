package exception;
import java.util.Scanner;
public class Number {
public static void main(String[]args) {
	try(Scanner sc=new Scanner(System.in)) {
		String a;
		try {
			System.out.println("Enter a number");
			a=sc.nextLine();
			System.out.println(Integer.parseInt(a));
			}
		catch(NumberFormatException e) {
			System.out.println(e);
		}
		System.out.println("That's not a number!");
		
	}
}
}
