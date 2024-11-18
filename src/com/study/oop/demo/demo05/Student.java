package com.study.oop.demo.demo05;

public class Student extends Person {
    private String name = "StudentName";

    public void print() {
        System.out.println("Student-print-method");
    }
    public void test(String name) {
        System.out.println(name);
        System.out.println(this.name);
        System.out.println(super.name);

        print();
        this.print();
        super.print();
    }
}
