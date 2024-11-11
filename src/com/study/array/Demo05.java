package com.study.array;

import java.util.Arrays;

/**
 * 反转数组
 */
public class Demo05 {
    public static void main(String[] args) {
       int[] arr = {1, 2, 3, 4, 5, 6, 7, 8};
       int[] result = new int[arr.length];

       for (int i = 0, j = arr.length - 1; i < arr.length; i++,j--) {
            result[j] = arr[i];
       }
        System.out.println(Arrays.toString(result));
    }
}
