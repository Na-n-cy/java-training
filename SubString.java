package String;

public class MainS {
public static void main(String[]args) {
	String original="Programming";
	String sub1=original.substring(0,4);
	String sub2=new String(original.substring(0,4));
	System.out.println(sub1==sub2);
	System.out.println(sub1.equals(sub2));
}
}
