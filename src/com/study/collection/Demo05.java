package com.study.collection;

import java.util.List;
public class Demo05 {
    public static void main(String[] args) {
        Demo05 demo = new Demo05();
        List<Person> list = List.of(
                demo.new Person("jack"),
                demo.new Person("jose"),
                demo.new Person("jakie"),
                demo.new Person("rose"),
                demo.new Person("dannie")
                );
        System.out.println(list.contains(demo.new Person("jack")));
    }

    class Person {
        String name;
        public Person(String name) {
            this.name = name;
        }
    }
}
