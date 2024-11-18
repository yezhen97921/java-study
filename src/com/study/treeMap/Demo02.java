package com.study.treeMap;

import java.util.*;

public class Demo02 {
    public static void main(String[] args) {
        Map<Person, Integer> map = new TreeMap<>(new Comparator<Person>() {
            public int compare(Person p1, Person p2) {
                return p1.name.compareTo(p2.name);
            }
        });
        map.put(new Person("jack"), 1);
        map.put(new Person("tommy"), 2);
        map.put(new Person("rose"), 3);
        for (Person key : map.keySet()) {
            System.out.println(key);
        }
        for (Integer value : map.values()) {
            System.out.println(value);
        }
    }
}

class Person {
    public String name;
    public Person(String name) {
        this.name = name;
    }

    public String toString() {
        return "{ Person: " + name + "}";
    }
}
