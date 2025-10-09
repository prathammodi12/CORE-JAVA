package com.pratham.corejava.MultiThreading;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Main {
    public static void main(String[] args) {
        for(int i=1; i<10; i++){
            System.out.println(factorial(i));
        }
    }

    private static long factorial(int n){
        long result = 1;
        for(int i=1; i<=n; i++){
            result *=i;
        }
        return result;
//        ExecutorService executor = Executors.newFixedThreadPool(10);
    }

}
