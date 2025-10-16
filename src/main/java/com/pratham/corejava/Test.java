package com.pratham.corejava;

class A {
    int i = 10;
    void show() { System.out.println("A"); }
}

class B extends A {
    int i = 20;
    void show() { System.out.println("B"); }
}

public class Test {
    public static void main(String[] args) {
        A obj = new B();
        System.out.println(obj.i);
        obj.show();
    }
}
