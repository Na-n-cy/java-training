package org.Vehicle;

public class Rectangle {
	
	    int length;
	    int breadth;
	    Rectangle() {
	        length = 10;
	        breadth = 20;
	    }

	    Rectangle(int l, int b) {
	        length = l;
	        breadth = b;
	    }

	    void calculateArea() {
	        int area = length * breadth;
	        System.out.println("Area of Rectangle: " + area);
	    }
	    public static void main(String[] args) {
	        Rectangle r1 = new Rectangle();
	        r1.calculateArea();  
	        Rectangle r2 = new Rectangle(10, 5);
	        r2.calculateArea();  
	    }
	}

