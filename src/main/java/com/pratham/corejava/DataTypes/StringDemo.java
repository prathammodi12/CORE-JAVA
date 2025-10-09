package com.pratham.corejava.DataTypes;

public class StringDemo {
    public static void main(String[] args) {
//        jvm--> heap memory (StringDemo Pool)
//        StringDemo test2= new StringDemo();
//        StringDemo test = new StringDemo();

        int a=1; //stack & heap ( string pool )
        String str1= "Hello";
        String str2= "Hello";
        String str3= new String("Hello");

        System.out.println(str1==str2);
        System.out.println(str1==str3);
        System.out.println(str1.equals(str3));
    }
}
