package com.pratham.corejava.Java8.LambdaFunction;

public  class Test {
    int a=2;

    private void dosomething(){
        int a=3;
        Employee employee= () -> {
            return "100";
        };
        System.out.println(employee.getSalary());
    }


public static void main(String[] args) {
    new Test().dosomething();
}}


