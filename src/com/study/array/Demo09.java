package com.study.array;

import java.sql.SQLOutput;
import java.util.Arrays;

public class Demo09 {
    public static void main(String[] args) {
        int[] a = {1, 2, 3, 4, 5, 99, 1000, 199, 234};

        // Arrays.fill();
//        Arrays.fill(a, 0);
//        Arrays.fill(a, 888);
        Arrays.fill(a, 2, 3, 10000000);

        // 数组排序
//        Arrays.sort(a);

        // 打印数组元素
        System.out.println(Arrays.toString(a));

        // 自定义打印数组的方法
        printArray(a);
    }

    public static void printArray(int[] a) {
        for (int i = 0; i < a.length; i++) {
            if (i == 0) {
                System.out.print("[" + a[i] + ", ");
            } else if (i == a.length - 1) {
                System.out.print(a[i] + "]");
            } else {
                System.out.print(a[i] + ", ");
            }

        }
    }
}
