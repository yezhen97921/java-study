package com.study.oop.demo.demo05;

public class Person {
    protected String name = "PersonName";
    private int money = 10_0000_0000;
    public void say() {
        System.out.println("说了一句话-- a method from class Person");
    }

    public int getMoney() {
        return this.money;
    }
    public void setMoney(int money) {
        this.money = money;
    }

    public void print() {
        System.out.println("Person-print-method");
    }
}
