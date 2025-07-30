package Encapsulation;

abstract class BankAccount {
 private String accountNumber;    
 private double balance;           
 public BankAccount(String accountNumber, double initialBalance) {
     this.accountNumber = accountNumber;
     this.balance = initialBalance;
 }
 public double getBalance() {
     return balance;
 }
 protected void setBalance(double balance) {
     this.balance = balance;
 }

 public String getAccountNumber() {
     return accountNumber;
 }
 public void deposit(double amount) {
     if (amount > 0) {
         balance += amount;
         System.out.println("Deposited ₹" + amount + ",New Balance: ₹" + balance);
     } else {
         System.out.println("Invalid deposit amount.");
     }
 }
 public abstract void withdraw(double amount);
}

class SavingsAccount extends BankAccount {
 private static double Balance= 500;

 public SavingsAccount(String accountNumber, double initialBalance) {
     super(accountNumber, initialBalance);
 }
 public void withdraw(double amount) {
     if (amount <= 0) {
         System.out.println("Invalid withdrawal amount.");
         return;
 }
     double currentBalance = getBalance();
     if (currentBalance - amount >= Balance) {
         setBalance(currentBalance - amount);
         System.out.println("Withdraw ₹" + amount + ",New Balance: ₹" + getBalance());
     } else {
         System.out.println("Withdrawal denied: Minimum ₹" + Balance + " balance required.");
   
     }
 }
}

 class CurrentAccount extends BankAccount {
 private static final double Limit = -10000;

 public CurrentAccount(String accountNumber, double initialBalance) {
     super(accountNumber, initialBalance);
 }
 public void withdraw(double amount) {
     if (amount <= 0) {
         System.out.println("Invalid withdrawal amount.");
         return;
     }

     double currentBalance = getBalance();
     if (currentBalance - amount >= Limit) {
         setBalance(currentBalance - amount);
         System.out.println("Withdraw ₹" + amount + ",New Balance: " + getBalance());
     } else {
         System.out.println("Withdrawal denied:" + Limit+ " reached.");
     }
 }
}


public class BankApp {
	    public static void main(String[] args) {
	        SavingsAccount savings = new SavingsAccount("SA123", 2000);
	        System.out.println("Savings Account Balance: ₹" + savings.getBalance());
	        savings.deposit(1000);
	        savings.withdraw(2200);  
	        savings.withdraw(600);   

	      
	        CurrentAccount current = new CurrentAccount("CA456", 5000);
	        System.out.println("Current Account Balance: ₹" + current.getBalance());
	        current.withdraw(13000);  
	        current.withdraw(12000);  
	        current.deposit(8000);    
	    }
	}


