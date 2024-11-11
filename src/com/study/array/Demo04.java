package com.study.array;

import java.util.Arrays;
import java.util.Collections;

/**
 * Arrays.sort
 */
public class Demo04 {
    public static void main(String[] args) {
        Integer[] arr = {1, 2, 3, 4, 5, 9, 8, 7, 5};
        Arrays.sort(arr, Collections.reverseOrder());
        System.out.println(Arrays.toString(arr));
    }
}
