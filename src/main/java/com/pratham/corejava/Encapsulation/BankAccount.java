package com.pratham.corejava.Encapsulation;

public class BankAccount {
    private long accountNumber;
    private double balance;

    public void deposit(double amount){
        if(amount >0){
            balance+=amount;
            System.out.println("Deposited:"+ amount);
        }else{
            System.out.println("Invalid Deposit Amount");
        }
    }

    public void withdraw(double amount){
            if(amount> 0 && amount<=balance){
                balance-= amount;
                System.out.println("Withdrawed:"+ amount);
            }else{

                System.out.println("Invalid amount or Insufficient Balance");
            }
    }

    public long getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(long accountNumber) {
        this.accountNumber = accountNumber;
    }

    public double getBalance() {
        return this.balance;
    }

}
