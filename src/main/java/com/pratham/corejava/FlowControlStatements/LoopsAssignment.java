package com.pratham.corejava.FlowControlStatements;

import java.util.Scanner;

public class LoopsAssignment {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter a Number");
        int n= sc.nextInt();

//        System.out.println("Using for loop");
        for(int i=1; i<=n; i++){
            if(i% 10==0)
                continue;//skip multiples of 10
         System.out.println(i);
        }
        sc.close();
    }
}
