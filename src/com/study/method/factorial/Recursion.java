package com.study.method.factorial;

/**
 * 递归求阶乘
 */
public class Recursion {
    public static void main(String[] args) {
        int target = 10;
        int value = getFactorial(target);
        System.out.println(target + "的阶乘是" + value);
    }

    public static int getFactorial(int target) {
        if (target <= 1) {
            return 1;
        }
        return target * getFactorial(target - 1);
    }
}
