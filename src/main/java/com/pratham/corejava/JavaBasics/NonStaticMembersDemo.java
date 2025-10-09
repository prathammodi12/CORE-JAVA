package com.pratham.corejava.JavaBasics;

public class NonStaticMembersDemo {

    int num;

    NonStaticMembersDemo(){
        System.out.println("Inside the Constructors");
    }

    {
        System.out.println("Inside the Non Static Block");
    }

    public static void main(String[] args) {
        System.out.println("Inside the main method");
        NonStaticMembersDemo obj=new NonStaticMembersDemo();
        obj.doSomething();
    }

    static {
        System.out.println("Inside the Static Block");
    }

    void doSomething(){
        System.out.println("Inside the doSomething ");
    }
}
