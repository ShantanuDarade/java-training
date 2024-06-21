package com.globalpayex;

import com.globalpayex.college.entities.Student;

import java.sql.SQLOutput;
import java.util.Random;

public class UniversalSelection {
    public static <T> T surpriseMe(T[] elements) {
        Random random = new Random();
        int n = random.nextInt(elements.length);
        return elements[n];
    }

    public static void main(String[] args) {
        String[] movies = {"3 Idiots","Avatar","Terminator","Robot"};
        String movie = surpriseMe(movies);
        System.out.println(movie);

        Student[] students = {
                new Student("shantanu",10,'m',100),
                new Student("shubham",8,'m',90),
                new Student("nayan",9,'m',90),
                new Student("shrutam",7,'m',80),
        };
        Student monitor = surpriseMe(students);
        System.out.println(monitor);
    }
}
