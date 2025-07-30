package String;

public class CharacterIndex {
	    public static void main(String[] args) {
	        String str1 = "AlRightTechnology";
	        String str2 = "SeleniumAutomationtool";
	        String str3 = "shahul";
	        String str4 = "j a v a p r o g r a m";
	        String str5 = "9095484678";
	        int index1 = str1.lastIndexOf('o');        
	        int index2 = str2.indexOf('o');            
	        int index3 = str3.indexOf('n');            
	        int index4 = str4.lastIndexOf(' ');        
	        int index5 = str5.indexOf('8');       
	        System.out.println("String 1: Last index of 'o' = " + index1);
	        System.out.println("String 2: Index of 'o' = " + index2);
	        System.out.println("String 3: Index of 'n' = " + index3);
	        System.out.println("String 4: Last index of space = " + index4);
	        System.out.println("String 5: Index of '8' = " + index5);
	    }
	}
	

