package com.pratham.corejava.JavaBasics;

public class StaticMethodsDemo {
    public static void main(String[] args) {
        System.out.println("Inside main method");
        StaticMethodsDemo.method1();
    }

   static void method1(){
        System.out.println("Inside method1");
   }

   static{
       System.out.println("I am Static");
       StaticMethodsDemo.method1();

   }
}
