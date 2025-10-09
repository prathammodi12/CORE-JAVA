package com.pratham.corejava.Operators;

public class StringConcat {
    public static void main(String[] args) {
        String s1="xyz";
        String s2="abc";

        int a=10, b=20, c=30;

        System.out.println(s1+s2) ;

        System.out.println(a+b+s1+b+c); //operator consider from left to right
    }
}
