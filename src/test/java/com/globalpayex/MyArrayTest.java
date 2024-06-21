package com.globalpayex;

import com.globalpayex.college.entities.Student;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MyArrayTest {

    @Test
    void testSet() {
        Integer[] elements = {1,2,3,4,6};
        var o1 = new MyArray<Integer>(elements);
        o1.set(5,5);

        System.out.println(o1.get(5));
        assertEquals(5,o1.get(5));
    }

    @Test
    void testMyArrayOfStudents() {

        Student[] students = {
                new Student("shantanu",10,'m',100),
                new Student("shubham",8,'m',90),
                new Student("nayan",9,'m',90),
                new Student("shrutam",7,'m',80),
        };
        //      var o1 = new MyArray<Student>(students);
        MyArray<Student> o1 = new MyArray<Student>(students);

        assertEquals("shantanu",o1.get(1).getName());
        o1.set(4,new Student("sahil",45,'m',100));

        System.out.println(o1.get(4).getName());
        assertEquals("sahil",o1.get(4).getName());
    }
}