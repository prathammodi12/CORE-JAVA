package com.pratham.corejava.Java8.Java8Features;

@FunctionalInterface
public interface FunctionalInterfaceDemo {
    void method1();
//    void method2(); Invalid because of Functional Interface

    //Only permit exact that method which in Main Interface
    //If any class inherit that it can not declare any method if it declare that is not fumctional Interface.
}
