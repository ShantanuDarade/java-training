package com.globalpayex.geometry.entities;

import com.abc.geometry.Shape;
import com.abc.geometry.ShapeStatistics;
import com.globalpayex.college.entities.Professor;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RectangleTest {
    @Test
    void testArea() {

        var o1 = new Rectangle(4,3);
        assertEquals(12,o1.area());
    }

    @Test
    void testPerimeter() {

        var o1 = new Rectangle(4,3);
        assertEquals(14,o1.perimeter());
    }

    @Test
    void testRectangleStatistics() {
        String expected = "***\nArea: 40\nPerimeter: 28\n***";
        var actual = ShapeStatistics.calculate(new Rectangle(10,4));
//        System.out.println(ans);
        assertEquals(expected,actual);
    }

    @Test
    void testSquareStatistics() {
        String expected = "***\nArea: 25\nPerimeter: 20\n***";
        assertEquals(expected, ShapeStatistics.calculate(new Square(5)));
    }


}