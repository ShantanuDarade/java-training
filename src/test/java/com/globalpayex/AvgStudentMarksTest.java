package com.globalpayex;

import com.globalpayex.college.entities.Student;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.*;

class AvgStudentMarksTest {
    @Test
    void testAverage() {
        ArrayList<Student> arr = new ArrayList<>();
        arr.add(new Student("shantanu", 10, 'm', 100));
        arr.add(new Student("shubham", 8, 'm', 80));
        arr.add(new Student("nayan", 9, 'm', 80));
        arr.add(new Student("shrutam", 7, 'm', 100));

        AvgStudentMarks o1 = new AvgStudentMarks();
        assertEquals(90,o1.average(arr));

    }
}