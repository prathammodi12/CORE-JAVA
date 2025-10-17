package com.pratham.corejava.Java8.Predicate;

import java.util.function.Predicate;

public class Main {
    public static void main(String[] args) {
//        Predicate<Integer> salaryGreaterThanOneLac=x -> x > 1000000;
//        System.out.println(salaryGreaterThanOneLac.test(2));

        Predicate<Integer> isEven= x-> x % 2 ==0;
        Predicate<String> startsWithLetterV = x-> x.toLowerCase().startsWith("v");
        System.out.println(startsWithLetterV.negate().test("vishal"));
    }
}
