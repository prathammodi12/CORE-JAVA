package com.pratham.corejava.FlowControlStatements;

public class LoopsDemo {
    public static void main(String[] args) {
        int i=10;

        while(i >10){
            System.out.println(i);
        } //while with condition

        do{
            System.out.println("Inside the loop");
        }while(i<=1);
        //first loop is running after condition check

        for(int j=0;j<10;j++){
            System.out.println(j);
        }

        //Labelled Block

        l1: {
            System.out.println("Block Begins");

            if(i==5){
                break l1;
            }
            System.out.println("Block Ends");
        }
        System.out.println("Loop Ends");
    }
}
