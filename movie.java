class movie{
    String title;
    int rating;
    void display(){
        System.out.println("title:"+title);
        System.out.println("rating:"+rating);
    }
    public static void main(String[]args){
        movie m1=new movie();
        m1.title="sita ramam";
        m1.rating=10;
        m1.display();    
    }
}