package com.pratham.corejava.CollectionFrameworks.concurrentcollections;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayListProblem {

    public static void main(String[] args) {
        ArrayList<String> courses=new ArrayList<>();
        courses.add("java");
        courses.add("python");
        courses.add("javascript");
        courses.add("c++");

        Iterator<String> iterator = courses.iterator();

        while(iterator.hasNext()){
            System.out.println(iterator.next());
//            courses.add("Docker"); we can not done any kind of content modification with iterator
        }

    }
}
