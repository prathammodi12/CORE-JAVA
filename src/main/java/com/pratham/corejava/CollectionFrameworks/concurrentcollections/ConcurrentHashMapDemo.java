package com.pratham.corejava.CollectionFrameworks.concurrentcollections;

import java.util.*;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;
import java.util.concurrent.CopyOnWriteArrayList;

//import static com.sun.org.apache.xml.internal.security.keys.keyresolver.KeyResolver.iterator;

public class ConcurrentHashMapDemo extends Thread {
    static ConcurrentHashMap<String, String> courses = new ConcurrentHashMap<String, String>() ;
        @Override
        public void run() {
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            courses.put("Kubernetes", "9.0");
        }


        public static void main(String[] args) {

            Thread t1 = new ConcurrentHashMapDemo();
            t1.start();
            courses.put("java", "9.1");
            courses.put("python", "3.10");
            courses.put("javascript", "5.4");
            courses.put("c++", "9.3");

            Iterator<String> iterator = courses.keySet().iterator();
            while (iterator.hasNext()) {
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
                String course = iterator.next();
                System.out.println(course);
                if (course.equals("python")) {
                    courses.remove(course);
                }
            }
            System.out.println(courses);

        }

}
