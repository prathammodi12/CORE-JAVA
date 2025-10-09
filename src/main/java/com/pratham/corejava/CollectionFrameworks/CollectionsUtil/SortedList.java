package com.pratham.corejava.CollectionFrameworks.CollectionsUtil;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class SortedList {
    public static void main(String[] args) {
        List<String> l=new ArrayList<>();

        l.add("Z");
        l.add("A");
        l.add("C");
        l.add("B");
        System.out.println("Before Sorting: "+l);

        Collections.sort(l);
        System.out.println("After Sorting: "+l);
    }
}
