package com.globalpayex;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AvgMaxTest {

    @Test
    void avg() {
        int[] arr = {0,5,2,3,1,10};
        var expected = 3;
        var actual = AvgMax.Avg(arr);
        assertEquals(expected,actual);
    }

    @Test
    void max() {
        int[] arr = {0,5,10,7,8,1,10};
        var expected = 10;
        var actual = AvgMax.Max(arr);
        assertEquals(expected,actual);
    }
    @Test
    void nextGenSum() {
        int actual = AvgMax.nextGenSum(5,2,4,8);
        assertEquals(19,actual);

        actual = AvgMax.nextGenSum(5,2);
        assertEquals(7,actual);

        actual = AvgMax.nextGenSum();
        assertEquals(0,actual);
    }
}