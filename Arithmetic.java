package exception;
import java.util.Scanner;
public class Arithmetic {
	public static void main(String[]args) {
	
	try(Scanner sc=new Scanner(System.in)) {
	
	System.out.println("enter numerator a:");
	int a=sc.nextInt();
	System.out.println("enter denominator b");
	int b=sc.nextInt();
	System.out.println(a/b);
	}
	catch(ArithmeticException e)
	{
		System.out.println("Cannot divided by Zero");
	}
}
}
