package com.pratham.corejava.Java8.Function;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Function;

public class useOfFunctionInterface {
    public static void main(String[] args) {
        Function<String, Integer> function1 = x -> x.length();

        Function<String, String> function2 = s -> s.length() >= 3 ? s.substring(0, 3) : s;

        Function<List<Student>, List<Student>> studentsWithVipAsPrefix = li -> {
            List<Student> result = new ArrayList<>();
            for (Student s : li) {
                if (function2.apply(s.getName()).equalsIgnoreCase("Pra")) {
                    result.add(s);
                }
            }
            return result;
        };

        Student s1 = new Student(2, "Vipul");
        Student s2 = new Student(2, "Vipulav");
        Student s3 = new Student(2, "Pratham");
        List<Student> students = Arrays.asList(s1, s2, s3);

        List<Student> filteredStudents = studentsWithVipAsPrefix.apply(students);
        System.out.println(filteredStudents);
    }

    private static class Student {
        private int id;
        private String name;

        public Student(int id, String name) {
            this.id = id;
            this.name = name;
        }

        public int getId() {
            return id;
        }

        public String getName() {
            return name;
        }

        @Override
        public String toString() {
            return "MethodRefference.Student{" +
                    "id=" + id +
                    ", name='" + name + '\'' +
                    '}';
        }
    }
}
