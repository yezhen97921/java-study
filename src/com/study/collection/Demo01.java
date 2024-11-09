package com.study.collection;

import java.util.List;
import java.util.ArrayList;

public class Demo01 {
    public static void main(String[] args) {
        List<String> names = new ArrayList<>();
        names.add("jack");
        names.add("chen");
        names.add("wang");
        for (String name:names) {
            System.out.println(name);
        }

        List<Integer> scores = List.of(1, 2, 3, 4, 5, 6);
        for (Integer score:scores) {
            System.out.println(score);
        }

    }
}
