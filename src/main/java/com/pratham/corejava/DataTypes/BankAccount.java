package com.pratham.corejava.DataTypes;

public class BankAccount {
    static String bankName="Bank of America";
    //use static variable
    String accountHolderNumber;
    String accountNumber;
    float balance;

    public static void main(String[] args) {
        System.out.println(BankAccount.bankName);
        BankAccount bankAccount = new BankAccount();
//        bankAccount.accountHolderNumber="John";
//        bankAccount.accountHolderNumber="123456789";
//        bankAccount.balance= 202000f;
        System.out.println(bankAccount.balance);

    }
}
