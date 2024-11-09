package com.study.collection;

import java.lang.reflect.Array;
import java.util.List;

/**
 * List to Array --convert
 */
public class Demo02 {
    public static void main(String[] args) {
        List<String> list = List.of("one", "two", "three");

        // List ==> Array--1
//        Object[] array = list.toArray();
//        for (Object a:array) {
//            System.out.println(a.getClass() == String.class);
//        }

        // List ==> Array--2
//        String[] array = list.toArray(new String[3]);
//        for (String a:array) {
//            System.out.println(a.getClass() == String.class);
//        }


        List<Integer> nums = List.of(1, 2, 3, 4);
//        Integer[] array = nums.toArray(new Integer[nums.size()]);
//        for (Integer num:array) {
//            System.out.println(num.getClass() == Integer.class);
//        }

        Integer[] array = nums.toArray(Integer[]::new);
        for (Integer num:nums) {
            System.out.println(num.getClass() == Integer.class);
        }
    }
}
