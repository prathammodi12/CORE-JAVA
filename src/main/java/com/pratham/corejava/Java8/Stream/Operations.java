package com.pratham.corejava.Java8.Stream;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class Operations {

    public static void main(String[] args) {
        List<Integer> list= Arrays.asList(1,2,3,4,5,7,8,10,0);
        List<Integer> list1 = list.stream()
                .filter(x -> x % 2 == 0)
                .map(x->x / 2)
                .distinct()
                .skip(1).
                sorted((a,b)-> (b -a)).toList();
        System.out.println(list1);


        List<Integer> list2 = Stream.iterate(0, n -> n + 1).limit(101).skip(2).toList();
        System.out.println(list2);


    }
}
