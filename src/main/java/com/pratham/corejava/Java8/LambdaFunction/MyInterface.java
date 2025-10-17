package com.pratham.corejava.Java8.LambdaFunction;
//@FunctionalInterface
//public interface LambdaFunction.MyInterface {
//    public void sayHello();
//
//    default void sayBye(){
//        System.out.println("Bye");
//    };
//}

public interface MyInterface{
    static void sayHello() {
        System.out.println("Hello");
    }

    default void sayBye(){
        System.out.println("Bye");
    }

    class MyClass implements MyInterface{
        public static void main(String[] args) {
            MyClass obj = new MyClass();
            MyInterface.sayHello();
            obj.sayBye();
        }
    }
}

