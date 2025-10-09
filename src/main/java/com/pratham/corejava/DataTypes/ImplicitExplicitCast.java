package com.pratham.corejava.DataTypes;

public class ImplicitExplicitCast {
    public static void main(String[] args) {
        //Implicit Type Conversion Example
        byte b = 100;
        int i = b;
        System.out.println(i);

        char ch='A';
        int xp=ch;
        System.out.println(xp);

        //Explicit Type Conversion Example
        int y=100;
        byte z=(byte)i;

        int x= 98;

        char dh=(char)x;
        System.out.println(dh);


        int i1=129;
        byte z1=(byte)i1;

        System.out.println(z1);

        int m= 612;
        byte n=(byte)m;
        char o= (char)n;
        System.out.println(o);

    }
}
