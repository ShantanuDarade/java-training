package com.globalpayex;

import com.globalpayex.college.entities.Student;

import java.util.ArrayList;

public class AvgStudentMarks {
    public int average(ArrayList<Student> students) {
        int sum=0;
        for(Student student:students) {
            sum+=student.marks;
        }
        return sum/students.size();
    }
}
