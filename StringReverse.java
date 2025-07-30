package String;

public class Nancy {
public static void main(String[]args) {
	String org="!avaj evol i";
	StringBuilder sb =new StringBuilder(org);
	String reversed=sb.reverse().toString();
	System.out.println(reversed);
}
}
