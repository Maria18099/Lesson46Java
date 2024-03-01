package org.example;

import java.io.Serializable;

public class Subject implements Serializable {
    private String name;
    private int hours;

    public Subject(String name, int hours) {
        this.name = name;
        this.hours = hours;
    }

    @Override
    public String toString() {
        return "Subject{" +
                "name='" + name + '\'' +
                ", hours=" + hours +
                '}';
    }
}
