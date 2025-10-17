package com.pratham.corejava.Java8.MethodRefference;

import java.util.Arrays;
import java.util.List;

public class RefreneceMethod {
    public static void print(String s){
        System.out.println(s);
    }

    public static void main(String[] args) {
        List<String> names= Arrays.asList("A","B","C","D");
        names.forEach(RefreneceMethod::print);
//        System.out.println(hello());


        List<Student> students = names.stream().map(Student::new).toList();
    }

    private static int hello(){
        return 1;
    }



}
