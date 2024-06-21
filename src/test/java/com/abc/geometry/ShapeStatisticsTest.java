package com.abc.geometry;

import com.globalpayex.geometry.entities.Rectangle;
import org.junit.jupiter.api.Test;

import java.sql.SQLOutput;

import static org.junit.jupiter.api.Assertions.*;

class ShapeStatisticsTest {

    @Test
    void testCalculate() {
        var o1 = new ShapeStatistics();
        var actual = o1.calculate(new Rectangle(10,4));
//        var ans = ShapeStatistics.calculate(new Rectangle(10,4));
        System.out.println(actual);
    }
}