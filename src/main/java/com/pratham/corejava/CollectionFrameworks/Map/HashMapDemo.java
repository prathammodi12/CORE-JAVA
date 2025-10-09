package com.pratham.corejava.CollectionFrameworks.Map;

import java.util.HashMap;
import java.util.Map;

public class HashMapDemo {
    public static void main(String[] args) {
        Map<String,Integer> map= new HashMap<>();

        map.put("John", 80);
        map.put("Pratham", 90);

        System.out.println(map.keySet());
        System.out.println(map.values());


        for(String key:map.keySet()){
            System.out.println("Key: "+ key + " Value: "+ map.get(key));
        }

    }
}
