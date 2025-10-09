package com.pratham.corejava.CollectionFrameworks.Set;

import java.util.*;

public class HashSetDemo {
    public static void main(String[] args) {
        Random obj= new Random();
        
//        List<Integer> list= new ArrayList<>();
//        Set<Integer> set=new HashSet<>();
        Set<Integer> set=new LinkedHashSet<>();

        for(int i=1; i<=5; i++){
            int number = obj.nextInt(105);
            set.add(number);
            System.out.println(number);
        }

        System.out.println("HashSet elements"+set);

//        System.out.println("Set:" + set);

    }
}
