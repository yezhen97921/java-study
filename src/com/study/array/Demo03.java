package com.study.array;

/**
 * 冒泡排序
 */

import java.util.Arrays;

public class Demo03 {
    public static void main(String[] args) {
        int[] arr = {1, 2, 4, 5, 3, 6, 7};
        for (int j = 0; j < arr.length - 1; j++) {
            for (int i = 0; i < arr.length - 1 - j; i++) {
                if (arr[i] > arr[i + 1]) {
                    int tem;
                    tem = arr[i];
                    arr[i] = arr[i + 1];
                    arr[i + 1] = tem;
                }
            }
        }
        System.out.println(Arrays.toString(arr));
    }
}
