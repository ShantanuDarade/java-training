package com.globalpayex;

public class StudentOps {
    public static String student(String name,char gender,int roll,int marks) {
//        StringBuilder ans = new StringBuilder();
//        ans.append("Name:");
//        ans.append(name);
//        ans.append("\n");
//        ans.append("Gender:");
//        ans.append(gender);
//        ans.append("\n");
//        ans.append("Roll No:");
//        ans.append(roll);
//        ans.append("\n");
//        ans.append("Marks:");
//        ans.append(marks);
//        ans.append("\n");

        char grade='I';

        if(marks>100 || marks<0) grade= 'I';
        else if(marks>=70) grade ='A';
        else if(marks>=60) grade ='B';
        else if(marks>=40) grade ='C';
        else if(marks<40) grade ='F';

//        ans.append("Grade:");
//        ans.append(grade);


//        return ans.toString();
        return "Name:"+name+"\nGender:"+gender+"\nRoll No:"+roll+"\nMarks:"+marks+"\nGrade:"+grade;
    }
}
