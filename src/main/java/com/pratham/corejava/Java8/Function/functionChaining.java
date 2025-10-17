package com.pratham.corejava.Java8.Function;

import java.util.function.Function;

public class functionChaining {
    public static void main(String[] args) {
//        Function<String, String> function1= s-> s.toUpperCase();
//        Function<String, String> function2= s-> s.substring(0,3);
//
//        Function<String, String> stringStringFunction = function1.andThen(function2);
//        System.out.println(stringStringFunction.apply("Vipul")) ;
//
//        System.out.println(function1.andThen(function2).apply("Pratham"));

    // use of andthen method of Function
    // run left to right
        Function<Integer,Integer> function1 = x-> 2*x;
        Function<Integer,Integer> function2 = x-> x*x;
        System.out.println(function1.andThen(function2).apply(2));
        System.out.println(function2.andThen(function1).apply(16));


        //use of compose method of Function
        //  run right to left
        System.out.println(function1.compose(function2).apply(2));

    }
}
