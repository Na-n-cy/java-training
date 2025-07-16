class pen{
    String colour;
    String brand;
    void display(){
        System.out.println("Writing with " +colour + " pen of " + brand + " brand");
    }
    public static void main(String[]args){
        pen p1=new pen();
        p1.colour="blue";
        p1.brand="trimax";
        p1.display();    
    }
}