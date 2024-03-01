package org.example;

import java.io.Serializable;

public class Student implements Serializable {
    private String name;
    private int age;
    private Subject subject;

    public Student(String name, int age, Subject subject) {
        this.name = name;
        this.age = age;
        this.subject = subject;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", subject=" + subject +
                '}';
    }
}
