package com.pratham.corejava.CollectionFrameworks.Map;

import java.util.IdentityHashMap;
import java.util.LinkedHashMap;
import java.util.Map;

public class IdentityHashMapDemo {
    public static void main(String[] args) {
        Map<Integer,String> map= new IdentityHashMap<>();

        Integer id1= new Integer(10);
        Integer id2= new Integer(10);


        map.put(id1, "John");
        map.put(id2, "Pratham");

        System.out.println(map);
//        System.out.println(map.values());


        /*for(String key:map.keySet()){
            System.out.println("Key: "+ key + " Value: "+ map.get(key));
        }
*/
    }
}
