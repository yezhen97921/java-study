package com.study.method;

import java.util.Arrays;

/**
 * 可变参数
 */
public class Demo03 {
    public static void main(String[] args) {
        Demo03 demo = new Demo03();
        demo.test(1, 2, 3);
    }

    public void test(int x, int... i) {
        System.out.println(Arrays.toString(i));
    }
}
