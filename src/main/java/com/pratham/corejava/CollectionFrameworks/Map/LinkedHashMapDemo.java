package com.pratham.corejava.CollectionFrameworks.Map;

import java.util.LinkedHashMap;
import java.util.Map;

public class LinkedHashMapDemo {
    public static void main(String[] args) {
        Map<String,Integer> map= new LinkedHashMap<>();

        map.put("John", 70);
        map.put("Pratham", 100);

        System.out.println(map.keySet());
        System.out.println(map.values());


        for(String key:map.keySet()){
            System.out.println("Key: "+ key + " Value: "+ map.get(key));
        }

    }
}
