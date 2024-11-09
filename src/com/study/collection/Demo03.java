package com.study.collection;

import java.util.Arrays;
import java.util.List;

/**
 * Array to List -- convert
 */
public class Demo03 {
    public static void main(String[] args) {
        Integer[] array = {1, 2, 3, 4, 5};

        // methods--1--Arrays.asList
//        List<Integer> list1 = Arrays.asList(array);
//        list1.add(6);
//        for (Integer num:list1) {
//            System.out.println(num);
//        }

        // methods--2--List.of(array)
        List<Integer> list2 = List.of(array);
//        list2.add(6);
        for (Integer num:list2) {
            System.out.println(num);
        }
    }
}
