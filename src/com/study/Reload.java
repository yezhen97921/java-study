package com.study;

public class Reload {
    public static void main(String[] args) {
        double maxValue = max(1, 2);
        System.out.println(maxValue);

        int maxValue2 = max(10, 20);
        System.out.println(maxValue2);
    }

    public static double max(double x1, double x2) {
        double res = 0;
        if (x1 == x2) {
            return res;
        }
        return Math.max(x1, x2);
    }

    public static int max(int x1, int x2) {
        int res = 0;
        if (x1 == x2) {
            return res;
        }
        return Math.max(x1, x2);
    }
}
