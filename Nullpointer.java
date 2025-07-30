package exception;

public class Nullpointer {
	private static String a1;
	public static void main(String[]args) {
  
 try {
	  a1= null;
	 System.out.println(a1.length());
 }
 catch(NullPointerException e) {
	 System.out.println("oops!");
 }
	}
}
		 
