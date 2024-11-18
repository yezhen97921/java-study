package com.study.equals;

import java.util.Objects;
public class Person {
    String name = "";
    int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }
    public static void main(String[] args) {
        Person p1 = new Person("jack", 12);
        Person p2 = new Person("jack", 12);
        System.out.println(p1.equals(p2));

    }
    /**
     * @description 重写equals方法
     * @param obj
     * @return
     */
    @Override
    public boolean equals(Object obj) {
        if (obj instanceof Person p) {
            return Objects.equals(this.name, p.name) && this.age == p.age;
        }
        return false;
    }
}
