package com.pratham.corejava.CollectionFrameworks.Set;

public class SortingObjects  implements  Comparable<SortingObjects>{

    int id;
    String name;

    SortingObjects(int id, String name){
        this.id = id;
        this.name = name;
    }

    @Override
    public int compareTo(SortingObjects o) {

        int id1= this.id;
        int id2= o.id;

        if(id1< id2) {
            return -1;
        }else if(id1>id2){
            return 1;
        }else{

            return 0;
        }
    }
}
