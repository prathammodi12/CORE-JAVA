package com.pratham.corejava.FlowControlStatements;

public class IfElseDemo {
    public static void main(String[] args) {
        int x=10,y=20;

        if(x > y){
            System.out.println("X is greater");
        } else if(y>x) {
            System.out.println("Y is greater");
        } else{
            System.out.println("Both are equals");
        }

        for(int i=0; i<10; i++){
            if(i%2==0){
                continue;
            }
            System.out.println(i);
        }
    }
}
