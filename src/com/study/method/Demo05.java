package com.study.method;

/**
 * 递归--求阶乘
 */
public class Demo05 {
    public static void main(String[] args) {
        int argValue = 10;
        int factorial = getFactorial(argValue);
        System.out.println(argValue + "的阶乘是" + factorial);
    }

    public static int getFactorial(int num) {
        if (num == 1) {
            return 1;
        } else {
            return num * getFactorial(num - 1);
        }
    }
}
