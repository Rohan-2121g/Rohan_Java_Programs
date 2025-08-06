package com.rohan;

abstract class BankAccount {
    String accountHolder;
    int accountNumber;
    double balance;

    BankAccount(String holder, int number, double balance) {
        this.accountHolder = holder;
        this.accountNumber = number;
        this.balance = balance;
    }

    abstract void deposit(double amount);
    abstract void withdraw(double amount);

    void showBalance() {
        System.out.println("Balance (बैलेंस): ₹" + balance);
    }
}

class SavingsAccount extends BankAccount {
    SavingsAccount(String holder, int number, double balance) {
        super(holder, number, balance);
    }

    void deposit(double amount) {
        balance += amount;
        System.out.println("₹" + amount + " deposited into Savings Account (सेविंग्स खाते में जमा किया गया)");
    }

    void withdraw(double amount) {
        if (amount <= balance) {
            balance -= amount;
            System.out.println("₹" + amount + " withdrawn from Savings Account (सेविंग्स खाते से निकाला गया)");
        } else {
            System.out.println("Insufficient balance in Savings Account (सेविंग्स खाते में पर्याप्त बैलेंस नहीं है)");
        }
    }
}

class CurrentAccount extends BankAccount {
    CurrentAccount(String holder, int number, double balance) {
        super(holder, number, balance);
    }

    void deposit(double amount) {
        balance += amount;
        System.out.println("₹" + amount + " deposited into Current Account (करंट खाते में जमा किया गया)");
    }

    void withdraw(double amount) {
        if (amount <= balance) {
            balance -= amount;
            System.out.println("₹" + amount + " withdrawn from Current Account (करंट खाते से निकाला गया)");
        } else {
            System.out.println("Insufficient balance in Current Account (करंट खाते में पर्याप्त बैलेंस नहीं है)");
        }
    }
}

class FixedDepositAccount extends BankAccount {
    boolean isDeposited = false;

    FixedDepositAccount(String holder, int number, double balance) {
        super(holder, number, balance);
    }

    void deposit(double amount) {
        if (!isDeposited) {
            balance += amount;
            isDeposited = true;
            System.out.println("₹" + amount + " deposited as Fixed Deposit (फिक्स्ड डिपॉज़िट के रूप में जमा किया गया)");
        } else {
            System.out.println("Fixed Deposit already exists. Cannot deposit again (फिक्स्ड डिपॉज़िट पहले से बना हुआ है। दोबारा जमा नहीं कर सकते)");
        }
    }

    void withdraw(double amount) {
        System.out.println("Withdrawal not allowed from Fixed Deposit Account (फिक्स्ड डिपॉज़िट खाते से निकासी की अनुमति नहीं है)");
    }

    @Override
    void showBalance() {
        System.out.println("Fixed Deposit Balance (फिक्स्ड डिपॉज़िट बैलेंस): ₹" + balance + " (Locked / लॉक किया गया)");
    }
}

public class OWN_TRY_ABSTRACTION {
    public static void main(String[] args) {
        BankAccount acc1 = new SavingsAccount("Rostorm", 101, 5000);
        BankAccount acc2 = new CurrentAccount("Goated", 102, 10000);
        BankAccount acc3 = new FixedDepositAccount("Rohan", 103, 0);

        acc1.deposit(1500);
        acc1.withdraw(2000);
        acc1.showBalance();

        acc2.deposit(5000);
        acc2.withdraw(12000);
        acc2.showBalance(); 

        acc3.deposit(10000);
        acc3.withdraw(5000); 
        acc3.showBalance();
    }
}