package exception;
import java.util.Scanner;
public class Array {
	public static void main(String[]args) {
		int[] numbers= {23,56,78,98,54};
try(Scanner sc=new Scanner(System.in);){
	 System.out.println("enter index");
	 int index=sc.nextInt();
	 System.out.println("Element at index"+index+" is "+numbers[index]);
 }catch(ArrayIndexOutOfBoundsException e) {
	 System.out.println("invalid index !");
 }
}
}
