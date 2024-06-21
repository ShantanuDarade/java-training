package com.globalpayex;

import static java.lang.Math.max;

public class AvgMax {
    public static int Avg(int[] arr) {
        int sum=0;
        for(int i:arr) {
            sum+=i;
        }
        return sum/arr.length;
    }
    public static int Max(int[] arr) {
        int largest=arr[0];
        for(int i:arr) {
            largest=max(largest,i);
        }
        return largest;
    }

    public static int nextGenSum(int... elements) {
        int sum=0;
        for(int i:elements) sum+=i;

        return sum;
    }
}
