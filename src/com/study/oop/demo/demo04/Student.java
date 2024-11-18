package com.study.oop.demo.demo04;

public class Student {
    // 属性私有
    private String name;
    private int id;
    private char sex;

    // 提供操作属性的方法
    // get
    public String getName() {
        return this.name;
    }
    // set
    public  void setName(String name) {
        this.name = name;
    }
}
