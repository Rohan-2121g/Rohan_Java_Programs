package com.rohan;


abstract class BankAccount1 {
    abstract void calculateInterest();

    public void showBalance() {
        System.out.println("Showing Balance.");
    }
}

class SavingsAccount1 extends BankAccount1 {

    void calculateInterest() {
        System.out.println("Interest for Savings Account is 4%");
    }
}

class FixedDepositAccount1 extends BankAccount1 {

    void calculateInterest() {
        System.out.println("Interest for Fixed Deposit Account is 6.5%");
    }
}



public class TASK_11_ACC_details {

	public static void main(String[] args) {
        

    	BankAccount1 acc1= new SavingsAccount1();
    	BankAccount1 acc2= new FixedDepositAccount1();
    	
        acc1.showBalance();
        acc1.calculateInterest();
        
        acc2.showBalance();
        acc2.calculateInterest();
       
        
    }
}
