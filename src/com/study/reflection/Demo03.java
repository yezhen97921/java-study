package com.study.reflection;

public class Demo03 {
    public static void main(String[] args) throws Exception {
        Person p = Person.class.getConstructor().newInstance();
        System.out.println(p.name);
    }

    public static class Person {
        String name = "Yezhen";
        public Person() {
        }
    }
}
