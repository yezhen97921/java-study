package com.study.treeMap;

import java.util.*;

public class Demo03 {
    public static void main(String[] args) {
        Map<Student, Integer> map = new TreeMap<>(new Comparator<Student>() {
            @Override
            public int compare(Student o1, Student o2) {
                if (o1.score == o1.score) {
                    return 0;
                }
                return o1.score > o2.score ? 1 : -1;
            }
        });
        map.put(new Student("jack", 99), 1);
        map.put(new Student("rose", 88), 2);
        map.put(new Student("tom", 98), 3);

        for (Student key : map.keySet()) {
            System.out.println(key);
        }

        System.out.println(map.get(new Student("rose", 88)));
    }
}

class Student {
    public String name;
    public int score;
    Student(String name, int score) {
        this.name = name;
        this.score = score;
    }

    public String toString () {
        return String.format("{%s: score=%d}", name, score);
    }
}