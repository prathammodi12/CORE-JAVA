package com.pratham.corejava.Java8.Stream;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class Main {
    public static void main(String[] args) {
        List<String > list = Arrays.asList("apple","banana","cherry");
        Stream<String> mystream = list.stream();

        String[] array={"dog","elephant","frog"};
        Arrays.stream(array);

        Stream<Integer> stream1= Stream.of(1,2,3);

        Stream.iterate(0,n-> n+1).limit(100);

        Stream.generate(() -> "hello").limit(5);
    }
}
