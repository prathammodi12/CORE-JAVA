package com.pratham.corejava.Java8.LambdaFunction;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class useofComparator {
    public static void main(String[] args) {
        List<Integer> list= new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(50);
        list.add(6);
        list.add(99);
        Collections.sort(list, (a, b)-> b-a);
        System.out.println(list);
    }
}
