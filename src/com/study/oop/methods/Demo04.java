package com.study.oop.methods;

public class Demo04 {
    public static void main(String[] args) {
        // 值传递
        int a = 1;
        System.out.println(a);
        changeBasicData(2);
        System.out.println(a);

        // 引用传递
        Person person = new Person();
        person.name = "jack";
        System.out.println(person.name);
        changeName(person, "changedName");
        System.out.println(person.name);
    }

    public static void changeBasicData(int a) {
        a = 10;
    }

    public static void changeName(Person person, String newName) {
        person.name = newName;
    }
}

class Person{
    String name;
}

