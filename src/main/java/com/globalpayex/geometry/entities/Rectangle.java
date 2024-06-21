package com.globalpayex.geometry.entities;

import com.abc.geometry.Shape;

public class Rectangle extends Shape {
    private int length;
    private int breadth;

    public int getLength() {
        return length;
    }

    public void setLength(int length) {
        this.length = length;
    }

    public int getBreadth() {
        return breadth;
    }

    public void setBreadth(int breadth) {
        this.breadth = breadth;
    }
    public Rectangle(int length,int breadth) {
        this.setLength(length);
        this.setBreadth(breadth);
    }
    public int area() {
        return this.getLength()*this.getBreadth();
    }
    public int perimeter() {
        return 2*(this.getLength()+this.getBreadth());
    }
}
