package com.globalpayex;

public class Rectangle {
    public static double perimeter(double length,double breadth) {
        var p = 2*(length+breadth);
        return p;
    }
    public static double area(double length,double breadth) {
        var a = length*breadth;
        return a;
    }

    public static class EvenSeries {
        public static String series(int num) {
            StringBuilder ans = new StringBuilder();
            int i = 0;
            while (i < num) {
                if (i > 0) {
                    ans.append(",");
                }
                ans.append(i);
                i = i + 2;
            }
            return ans.toString();
        }
    }
}
