class employee{
    String name;
    int salary;
    void display_info(){
        System.out.println("name:"+name);
        System.out.println("salary:"+salary);
    }
    public static void main(String[]args){
        employee e1=new employee();
        e1.name="Nancy";
        e1.salary=80000;
        e1.display_info();
    }
}