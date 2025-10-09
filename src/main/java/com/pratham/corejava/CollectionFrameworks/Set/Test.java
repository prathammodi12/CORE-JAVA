package com.pratham.corejava.CollectionFrameworks.Set;

import java.util.Set;
import java.util.TreeSet;

public class Test {
    public static void main(String[] args) {

        Set<SortingObjects> set= new TreeSet<>();
        set.add(new SortingObjects(101, "Pratham"));
        set.add(new SortingObjects(200, "Kush"));


        for (SortingObjects obj : set) {
            System.out.println(obj.id);
            System.out.println(obj.name);
        }
    }
}
