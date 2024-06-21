package com.globalpayex.college.entities;

import com.abc.salary.SalariedIndividual;
import com.abc.salary.SalaryCalculator;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ProfessorTest {

    @BeforeEach
    void init() {
        Student.count=0;
    }
    @Test
    void testObjCount() {
        String[] subjects = {"Physics","Maths"};
        var p1 = new Professor("Professor1",'m',subjects,15,5000);
        System.out.println(p1.calculate());
        var p2 = new Professor("professor2",'f',subjects,22,6000);
        assertEquals(2,Professor.count);
    }
    @Test
    void testGetDetails() {
        String[] subjects = {"Physics","Maths"};
        var p1 = new Professor("shantanu",'m',subjects,15,5000);
        String expected = "Name: shantanu\nGender: m";
        String actual = p1.getDetails();
        assertEquals(expected,actual);
    }

    @Test
    void testSalary() {
        String[] subjects = {"Physics","Maths"};
        var p1 = new Professor("shantanu",'m',subjects,17,5000);
        var s1 = new SalaryCalculator();
        assertEquals(76320,s1.calculate(p1));
    }
}