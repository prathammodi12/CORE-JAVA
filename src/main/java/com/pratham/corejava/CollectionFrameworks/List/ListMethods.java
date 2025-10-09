package com.pratham.corejava.CollectionFrameworks.List;

import java.util.ArrayList;
import java.util.List;

public class ListMethods {
    public static void main(String[] args) {

        List<Integer> list= new ArrayList<>();

        for(int i=0; i<=100; i+=10){
            list.add(i);
        }
        System.out.println("List:"+ list);

        list.set(1,300);
        System.out.println("List after Replacement"+ list);


        List<Integer> secondList= new ArrayList<>();
        secondList.add(1);
        secondList.add(2);
        secondList.add(3);
        System.out.println("Second List:"+ secondList);

        list.addAll(2,secondList);
        System.out.println("First List:"+list);

    }
}
