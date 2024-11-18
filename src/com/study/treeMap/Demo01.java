package com.study.treeMap;

import java.util.*;

public class Demo01 {
    public static void main(String[] args) {
        Map<String, Integer> map = new TreeMap<>();
        map.put("Apple", 1);
        map.put("orange", 2);
        map.put("pear", 3);
        map.put("pear4", 4);
        map.put("pear5", 5);
        map.put("pear6", 6);
        map.put("pear7", 7);
        map.put("pear8", 8);
        System.out.println(map.keySet());
        System.out.println(map.values());
        for (String key : map.keySet()) {
            System.out.println(key);
        }
        for (Integer value : map.values()) {
            System.out.println(value);
        }
    }
}
