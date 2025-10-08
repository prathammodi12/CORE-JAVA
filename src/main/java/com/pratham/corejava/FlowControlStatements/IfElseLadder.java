package com.pratham.corejava.FlowControlStatements;

public class IfElseLadder {
    public static void main(String[] args) {
        String choice = "Change Pin";

        if (choice.equals("Check Balance")) {
            System.out.println("Check Balance");
        } else if (choice.equals("Change Pin")) {
            System.out.println("Change Pin");
        } else if (choice.equals("Withdraw Cash")) {
            System.out.println("Withdraw Cash");
        } else if (choice.equals("Deposit Cash")) {
            System.out.println("Deposit Cash");
        } else {
            System.out.println("Time Out");
        }
    }
}
