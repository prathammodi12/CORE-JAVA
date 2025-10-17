package com.pratham.corejava.Java8.LambdaFunction;

public class Main {
    public static void main(String[] args) {
//            Employee employee = ()->"Software Engineer"+ Thread.currentThread().getName();
        //        employee.getName();
//            System.out.println(employee.getName());

        Runnable runnable = () -> {
            for (int i = 1; i <= 10; i++) {
                System.out.println("Hello " + i + Thread.currentThread().getName());
            }
        };
        Thread thread = new Thread(runnable);
        thread.start();


        Employee employee = new Employee() {
            @Override
            public String getSalary() {
                return "10";
            }
//
//            @Override
//            public String getDesignation() {
//                return "Software Engineer";
//            }
        };
        System.out.println(employee.getSalary());
    }

}
