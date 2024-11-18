package com.study.oop.methods;

public class Demo02 {
    public static void main(String[] args) {
        Student stu = new Student();
        stu.say();
    }

    // static 和类一起加载的
    static void a() {
        Demo02 demo = new Demo02();
        demo.b();
    }
    // 类 实例化之后才存在
    public void b() {
        a();
    }
}
