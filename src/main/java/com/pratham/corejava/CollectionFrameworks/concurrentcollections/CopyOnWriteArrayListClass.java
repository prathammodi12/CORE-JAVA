package com.pratham.corejava.CollectionFrameworks.concurrentcollections;

import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;

public class CopyOnWriteArrayListClass {

    public static void main(String[] args) {

        CopyOnWriteArrayList<String> courses=new CopyOnWriteArrayList<>();
        courses.add("java");
        courses.add("python");
        courses.add("javascript");
        courses.add("c++");

        Iterator<String> iterator = courses.iterator();

        while(iterator.hasNext()){
            String course = iterator.next();
            System.out.println(course);
            if(course.equals("python")){
                courses.remove(course);
            }
        }
        System.out.println(courses);

    }
}
