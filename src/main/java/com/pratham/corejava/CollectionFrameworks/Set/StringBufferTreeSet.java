package com.pratham.corejava.CollectionFrameworks.Set;

import java.util.Set;
import java.util.TreeSet;

public class StringBufferTreeSet {
    public static void main(String[] args) {
        Set<StringBuffer> set = new TreeSet<>();

        set.add(new StringBuffer("abc"));
        set.add(new StringBuffer("xyz"));
        set.add(new StringBuffer("ghi"));
        set.add(new StringBuffer("def")) ;

        for (StringBuffer obj : set) {
            System.out.println(obj);
        }
    }
}
