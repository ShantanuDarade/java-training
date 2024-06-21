package com.globalpayex.college.entities;

import com.abc.salary.SalariedIndividual;

public class Professor extends CollegeUser implements SalariedIndividual {
    private String[] subjects;
    private int noOfDaysWoke;
    private int costPerDAY;
    static int count;

    public Professor(String name, char gender,String[] subjects,int noOfDaysWoke,int costPerDAY) {
        super(name, gender);
        this.subjects = subjects;
        this.noOfDaysWoke=noOfDaysWoke;
        this.costPerDAY=costPerDAY;
        Professor.count++;
    }

    public String[] getSubjects() {
        return subjects;
    }

    public void setSubjects(String[] subjects) {
        this.subjects = subjects;
    }

    @Override
    public int getDaysWorkedInMonth() {
        return this.noOfDaysWoke;
    }

    @Override
    public int getCommercialsPerDay() {
        return this.costPerDAY;
    }
}
