package com.globalpayex.college.entities;

public class Student extends CollegeUser {
    int roll;
    public int marks;
    static int count;

    public Student() {
        this("NA",-1,'m',0);
    }

    public Student(String name, int roll, char gender, int marks) {
        super(name,gender);
        Student.count++;
        this.roll=roll;
        this.marks=marks;
    }

    public static Student createInstance(String name, int roll, char gender, int marks) {
        var s = new Student(name,roll,gender,marks);
        return s;
    }


//    public String getDetails() {
////        return "Name: "+this.name+"\nGender: "+this.gender+"\nRoll: "+this.roll+"\nMarks: "+this.marks;
//        return String.format(
//                "Name: %s\nGender: %s\nRoll: %s\nMarks: %s",
//                this.name,
//                this.getGender(),
//                this.roll,
//                this.marks
//        );
//    }


    @Override
    public String getDetails() {
        String part1 = super.getDetails();
        return String.format(
                "%s\nRoll: %s\nMarks: %s",
                part1,
                this.roll,
                this.marks
        );
    }

    public char getGrade() {
        if(marks>100 || marks<0) return 'I';
        else if(marks>=70) return 'A';
        else if(marks>=60) return 'B';
        else if(marks>=40) return 'C';
        else if(marks<40) return 'F';
        else return 'I';
    }

//    public int getMarks() {
//        return marks;
//    }
}