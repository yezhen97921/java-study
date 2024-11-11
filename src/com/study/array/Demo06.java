package com.study.array;

import java.util.Arrays;
public class Demo06 {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 56, 34, 78, 12, 4, 7, 0};
        Arrays.sort(arr);

        StringBuilder result = new StringBuilder("[");
        for (int i = 0; i < arr.length; i++) {
            result.append(arr[i]);
            if (i < arr.length - 1) {
                result.append(", ");
            }
        }
        result.append("]");
        System.out.println(result);
    }
}
