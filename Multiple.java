package exception;

import java.util.Scanner;
public class Multiple {
	public static void main(String[]args) {
		int[] numbers= {23,56,78,98,54};
try(Scanner sc=new Scanner(System.in);){
	 System.out.println("enter index");
	 int index=sc.nextInt();
	 System.out.println("Element at index"+index+" is "+numbers[index]);
	 System.out.println("enter numerator a:");
		int a=sc.nextInt();
		System.out.println("enter denominator b");
		int b=sc.nextInt();
		System.out.println(a/b);

 }catch(ArrayIndexOutOfBoundsException e) {
	 System.out.println("invalid index !");
}
catch(ArithmeticException e)
{
	System.out.println("Cannot divided by Zero");
}
	}
}
