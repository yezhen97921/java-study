package com.study.method.factorial;

/**
 * for循环求阶乘
 */
public class ForLoop {
    public static void main(String[] args) {
        int target = 10;
        int factorial = getFactorial(target);
        System.out.println(target + "的阶乘是" + factorial);
    }

    public static int getFactorial(int target) {
        int res = 1;
        for (int i = 1; i <= target; i++) {
            res *= i;
        }
        return res;
    }
}
