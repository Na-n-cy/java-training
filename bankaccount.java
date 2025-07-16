class bankaccount{
    String account_holder;
    int balance;
    void check_balance(){
        System.out.println("account holder:"+account_holder);
        System.out.println("current balance:"+balance);
    }
    public static void main(String[]args){
        bankaccount b1=new bankaccount();
        b1.account_holder="isai";
        b1.balance=200000;
        b1.check_balance();
    }
}