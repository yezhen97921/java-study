package com.study.collection;

import java.util.HashMap;
import java.util.Map;
public class Demo09 {
    public static void main(String[] args) {
        Map<String, Integer> map = new HashMap<>();
        String key1 = "one";
        map.put(key1, 1);

        String key2 = new String("one");
        System.out.println(map.get(key2));
        System.out.println(key1 == key2);
        System.out.println(key1.equals(key2));
    }
}
