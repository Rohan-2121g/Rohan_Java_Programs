package com.rohan;

abstract class ATM {
    abstract void checkBalance();
    abstract void withdrawCash(double amount);
    abstract void depositCash(double amount);
}

class BankATM extends ATM {
    private double balance = 2500.0; // Updated initial balance

    public void checkBalance() {
        System.out.println("Your current balance is: $" + balance);
    }

    public void withdrawCash(double amount) {
        if (amount > balance) {
            System.out.println("Insufficient Balance");
        } else {
            balance -= amount;
            System.out.println("Withdrawal of $" + amount + " successful");
        }
    }

    public void depositCash(double amount) {
        balance += amount;
        System.out.println("Deposit of $" + amount + " successful");
    }
}

public class SIMPLE_ATM {

    public static void main(String[] args) {
        ATM obj = new BankATM();
        obj.checkBalance();           // $2500.0
        obj.depositCash(1500);        // Deposit $1500
        obj.withdrawCash(1200);       // Withdraw $1200
        obj.checkBalance();           // Final balance $2800.0
    }
}