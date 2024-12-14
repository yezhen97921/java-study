package com.study.array;

import java.util.Arrays;

public class Demo10 {
    public static void main(String[] args) {
        // 冒泡排序
         int[] arr = {2, 3, 4, 1, 0, 9};
         customSort(arr);
        System.out.println(Arrays.toString(arr));
    }

    public static void customSort (int[] a) {
        for (int i = 0; i < a.length - 1; i++) {
            for (int j = 0; j < a.length - 1 - i; j++) {
                if (a[j] > a[j + 1]) {
                    int temp;
                    temp = a[j];
                    a[j] = a[j+ 1];
                    a[j + 1] = temp;
                }
            }
        }
        System.out.println(Arrays.toString(a));
    }
}
