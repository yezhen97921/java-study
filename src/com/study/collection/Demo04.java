package com.study.collection;

import java.util.List;

public class Demo04 {
    public static void main(String[] args) {
        List<String> list = List.of("apple", "banana");
        System.out.println(list.contains("apple"));
        System.out.println(list.indexOf("apple"));

        System.out.println(list.contains(new String("apple")));
        System.out.println(list.indexOf(new String("apple")));

        for (String s : list) {
            System.out.println(s);
        }
    }
}