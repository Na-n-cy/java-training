package String;

public class AddresscCheck {
	public class AddressCheck {
	    public static void main(String[] args) {
	        String address = "5-35-2a,venkatesh nivas,Aruppukottai";
	        if (address.toLowerCase().contains("pincode")) {
	            System.out.println("valid address");
	        } else {
	            System.out.println("invalid address");
	        }
	    }
	}
}
