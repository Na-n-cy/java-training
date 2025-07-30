package String;

public class append {
 public static void main(String[]args) {
	 String sb="Nancy";
	 StringBuffer org=new StringBuffer(sb);
	 org.append("23AD303");
	 System.out.println(org);
	 org.insert(5,"_");
	 System.out.println(org);
	 
 }
}
