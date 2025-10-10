package com.pratham.corejava.CollectionFrameworks.concurrentcollections;

import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;

public class UseOfThreading extends Thread {
    static CopyOnWriteArrayList<String> courses=new CopyOnWriteArrayList<>();
    @Override
    public  void run() {
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        courses.add("Kubernetes");
    }


    public static void main(String[] args) {

        Thread t1 = new UseOfThreading();
        t1.start();
        courses.add("java");
        courses.add("python");
        courses.add("javascript");
        courses.add("c++");

        Iterator<String> iterator = courses.iterator();

        while(iterator.hasNext()){
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            String course = iterator.next();
            System.out.println(course);
            if(course.equals("python")){
                courses.remove(course);
            }
        }
        System.out.println(courses);

    }
}
