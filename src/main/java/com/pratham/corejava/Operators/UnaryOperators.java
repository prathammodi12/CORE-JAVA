package com.pratham.corejava.Operators;

public class UnaryOperators {
    public static void main(String[] args) {
        int x=10;

//        int y=++x;//Pre Increment
        //First Increment after value assign

        int y=x--;//Post Increment
        //Fist Value will assign after x decrement

//        and we only assign variable we can not use operator with values

//        Both as common for ++ and --
        System.out.println("Value of x:"+ x);

        System.out.println("Value of y:"+ y);

    }
}
