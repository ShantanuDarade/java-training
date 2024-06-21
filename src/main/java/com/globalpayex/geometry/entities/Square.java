package com.globalpayex.geometry.entities;

import com.abc.geometry.Shape;

public class Square extends Shape {

    private int side;

    public Square(int side) {
        this.side = side;
    }

    public int getSide() {
        return side;
    }

    public void setSide(int side) {
        this.side = side;
    }

    public int area() {
        return this.getSide()*this.getSide();
    }

    public int perimeter() {
        return 4*this.getSide();
    }
}
