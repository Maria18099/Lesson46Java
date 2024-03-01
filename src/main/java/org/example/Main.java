package org.example;

import com.google.gson.Gson;

import java.io.*;

public class Main {
    public static void main(String[] args) {
        //json
        Gson gson = new Gson();
        Student student = new Student("Ann",12, new Subject("Math",120));
        try (FileWriter fileWriter = new FileWriter("students.txt")) {
            fileWriter.write(gson.toJson(student));
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        Student student1;
        try (FileReader fileReader = new FileReader("students.txt")) {
            student1 = gson.fromJson(fileReader,Student.class);
            System.out.println(student1);
        }
        catch (IOException e){

        }
    }
}