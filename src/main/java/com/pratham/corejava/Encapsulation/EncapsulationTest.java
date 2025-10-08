package com.pratham.corejava.Encapsulation;

public class EncapsulationTest {
    public static void main(String[] args) {
//        Student student = new Student();
//        student.setAge(-18);
//        System.out.println(student.getAge());

        BankAccount bankAccount= new BankAccount();
        bankAccount.deposit(500);
        bankAccount.withdraw(400);
        bankAccount.withdraw(90);
        bankAccount.withdraw(100);
        System.out.println(bankAccount.getBalance());
    }
}
