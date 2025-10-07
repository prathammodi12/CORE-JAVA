package com.pratham.corejava.WrapperClasses;

import java.lang.reflect.Type;

public class ObjectAndString {
    public static void main(String[] args) {
        long x=1000;

        Long y=Long.valueOf(x);

        String s=y.toString();
        System.out.println(s);

        long z=Long.valueOf(s);
    }
}
