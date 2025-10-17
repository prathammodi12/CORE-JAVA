package com.pratham.corejava.Java8.CompletableFuture;

import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ExecutionException;

public class CF {
    public static void main(String[] args) throws ExecutionException, InterruptedException {

        CompletableFuture<String> completableFuture = CompletableFuture.supplyAsync(() -> {
            try {
                Thread.sleep(5000);
                System.out.println("Async Task");
            } catch (Exception e) {

            }
            return "Ok";
        });
        String s = completableFuture.get();
        System.out.println(s);
        System.out.println("Main");
    }
}
