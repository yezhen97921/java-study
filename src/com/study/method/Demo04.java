package com.study.method;

/**
 * 可变参数--排序
 */
public class Demo04 {
    public static void main(String[] args) {
        printMax(1, 2, 1000000, 3, 4, 0, 99, 1000);
    }

    public static void printMax(double... numbers) {
        if (numbers.length == 0) {
            System.out.println("No arguments passed");
            return;
        }

        double maxValue = numbers[0];
        for (int i = 1; i < numbers.length; i ++) {
            if (numbers[i] > maxValue) {
                maxValue = numbers[i];
            }
        }
        System.out.println("The maxValue is " + maxValue);
    }
}
