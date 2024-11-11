package com.study.array;

/**
 * 冒泡排序
 */

import java.util.Arrays;

public class Demo07 {
    public static void main(String[] args) {
        int[] arr = {2, 1, 4, 5, 8, 3};
        for (int i = 0; i < arr.length - 1; i++) {
            boolean swapped = false;
            for (int j = 0; j < arr.length - i - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    int temp;
                    temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                    swapped = true;
                }
            }
            if (!swapped) break;
        }
        System.out.println(Arrays.toString(arr));
    }
}
