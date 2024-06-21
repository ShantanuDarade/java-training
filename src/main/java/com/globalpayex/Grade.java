package com.globalpayex;

public class Grade {
    public static char grade(int marks) {
        if(marks>100 || marks<0) return 'I';
        else if(marks>=70) return 'A';
        else if(marks>=60) return 'B';
        else if(marks>=40) return 'C';
        else if(marks<40) return 'F';
        else return 'I';
    }
}
