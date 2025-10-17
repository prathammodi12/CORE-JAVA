package com.pratham.corejava.Java8.Function;

import java.util.function.BiConsumer;
import java.util.function.BiFunction;
import java.util.function.Consumer;

public class BiFunctionuse {
    public static void main(String[] args) {
        BiFunction<String, String, Integer> biFunction = (x,y)-> x.length() + y.length();
        System.out.println(biFunction.apply("Hi", "Pratham"));


        Consumer<Integer> consumer = x-> {
            System.out.println(x);
        };
        consumer.accept(28);


        BiConsumer<Integer, Integer> biConsumer = (x,y)->{
            System.out.println(x+y);
        };
        biConsumer.accept(1,2);

    }
}
