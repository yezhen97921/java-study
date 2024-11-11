package com.study.collection;

import java.util.HashMap;
import java.util.Map;
public class Demo07 {
    public static void main(String[] args) {
        Map<String, Integer> map = new HashMap<>();
        map.put("one", 1);
        map.put("two", 2);
        map.put("three", 3);
        map.put("four", 4);
        System.out.println(map.keySet());
        for (String key : map.keySet()) {
            System.out.println(map.get(key));
        }
    }
}
