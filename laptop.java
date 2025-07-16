class laptop{
    String brand;
    int RAM;
    void show_configurations(){
        System.out.println("brand:"+brand);
        System.out.println("RAM:"+RAM+"GB");
    }
    public static void main(String[]args){
        laptop p1=new laptop();
        p1.brand="lenovo";
        p1.RAM=12;
        p1.show_configurations();    
    }
}