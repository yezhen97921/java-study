package com.study.reflection;

public class Demo02 {
    public static void main(String[] args) throws NoSuchFieldException {
        Class stdClass = Student.class;

        // 获取public字段"score":
        System.out.println(stdClass.getField("score"));
        System.out.println(stdClass.getName());
        System.out.println(stdClass.getTypeName());
        System.out.println(stdClass.getModifiers());
        System.out.println("-------------------------------");
        // 获取继承的public字段"name":
        System.out.println(stdClass.getField("name"));
        System.out.println("-------------------------------");
        // 获取private字段"grade":
        System.out.println(stdClass.getDeclaredField("grade"));
    }

    class Student extends Person {
        public int score;
        private int grade;
    }
    class Person {
        public String name;
    }
}
