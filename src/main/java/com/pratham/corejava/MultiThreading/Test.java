package com.pratham.corejava.MultiThreading;

public class Test {
    public static void main(String[] args) {
//        System.out.println("Hello World");
//        System.out.println(Thread.currentThread().getName());

            World world= new World();

            world.start();
            for(; ; ){
              System.out.println(Thread.currentThread().getName());
            }

    }
}
