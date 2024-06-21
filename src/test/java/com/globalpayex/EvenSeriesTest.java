package com.globalpayex;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class EvenSeriesTest {
    @Test
    void testGrader() {
        int num = 15;
        String expected = "0,2,4,6,8,10,12,14";
        var actual = Rectangle.EvenSeries.series(num);
        assertEquals(expected,actual);

    }
}