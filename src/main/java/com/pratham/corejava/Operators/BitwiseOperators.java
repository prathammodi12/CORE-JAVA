package com.pratham.corejava.Operators;

public class BitwiseOperators {

    //Notes:
    //   & operator returns true if both arguments are true
    //   | operator returns true if atlest one argument is true
    //   ^ operator returns true if both arguments are different

    public static void main(String[] args) {
        System.out.println(true & true);
        System.out.println(false | true);
        System.out.println(false ^ true);


    boolean x=true, y=false;

    //In the || and && check only first variable
        // if that is satisfied then no need to check second
    if(x || y) {
        System.out.println("Inside if");
    }


    int b=20;

    b+=40; // b=b+40
        System.out.println(b);//ans is 60

}
}
