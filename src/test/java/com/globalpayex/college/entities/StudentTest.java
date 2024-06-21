package com.globalpayex.college.entities;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class StudentTest {
    @BeforeEach
    void init() {
        Student.count=0;
    }
    @Test
    void testObjectCreation() {
        assertEquals(0,Student.count);
        var s1= new Student();
        var s2= new Student();
        assertTrue(s1!=s2);
        assertNotNull(s1.name);
        assertNotNull(s2.name);
        assertEquals(-1,s1.roll);
        assertEquals(-1,s2.roll);

        s1.roll = 10;
        s2.roll = 13;
        assertEquals(10,s1.roll);
        assertEquals(13,s2.roll);

        assertEquals(2,Student.count);
    }

    @Test
    void testGetDetails() {
        var s1=new Student("shantanu",8,'m',90);
//        s1.name = "shantanu";
//        s1.roll = 8;
//        s1.gender = 'm';
//        s1.marks = 90;
        String expected = "Name: shantanu\nGender: m\nRoll: 8\nMarks: 90";
        String actual = s1.getDetails();
        assertEquals(expected,actual);
        System.out.println(s1);
    }


    @Test
    void gradeCheck() {
        var s1=new Student();
        s1.name = "shantanu";
        s1.roll = 8;
        s1.setGender('m');
        s1.marks = -30;
        char expected = 'I';
        char actual = s1.getGrade();
        assertEquals(expected,actual);
    }

    @Test
    void testNewWayOfObjectCreation() {
        var s1 = Student.createInstance("shantanu",8,'m',90);
        String expected = "Name: shantanu\nGender: m\nRoll: 8\nMarks: 90";
        String actual = s1.getDetails();
        assertEquals(expected,actual);
    }

    @Test
    void testValidateGender() {
        var s = new Student();

        assertEquals('m',s.getGender());

        var s1=new Student("shantanu",8,'x',90);
        assertNotEquals('x',s1.getGender());
    }
}