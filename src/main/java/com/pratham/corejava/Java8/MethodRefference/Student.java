package com.pratham.corejava.Java8.MethodRefference;

public class Student {
    private String name;

    public Student(String name) {  // 👈 This is what map(Student::new) needs
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
