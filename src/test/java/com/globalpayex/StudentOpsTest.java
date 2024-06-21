package com.globalpayex;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class StudentOpsTest {
    @Test
    void testStudent() {
        String name = "Shantanu";
        char gender = 'M';
        int roll = 8;
        int marks = 90;
        String expected = "Name:Shantanu\nGender:M\nRoll No:8\nMarks:90\nGrade:A";
        var actual = StudentOps.student(name,gender,roll,marks);
        assertEquals(expected,actual);
    }
}