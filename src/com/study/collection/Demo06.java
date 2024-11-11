package com.study.collection;

import java.util.HashMap;
import java.util.Map;

public class Demo06 {
    public static void main(String[] args) {
        Map<String, Integer> map = new HashMap<>();
        map.put("apple", 1);
        map.put("banana", 2);
        System.out.println(map.get("apple"));
        map.put("apple", 3);
        System.out.println(map.get("apple"));
    }
}
