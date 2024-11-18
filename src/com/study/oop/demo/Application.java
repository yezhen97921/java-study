package com.study.oop.demo;

import com.study.oop.demo.demo02.Person;
import com.study.oop.demo.demo03.Pet;
import com.study.oop.demo.demo04.Student;
import com.study.oop.demo.demo05.A;
import com.study.oop.demo.demo05.B;
import com.study.oop.demo.demo05.StudentFactory;

public class Application {
    public static void main(String[] args) {
        A a = new A();
        a.test();

        // 父类的引用指向了子类
        B b = new A();
        b.test();
    }
}

/**
 * test main of class Student
 */
//public static void main(String[] args) {
//    // 类实例化之后会返回一个自己的对象
//    Student cl = new Student();
//    cl.name = "陈露";
//    cl.age = 23;
//    cl.study();
//
//    Student yz = new Student();
//    yz.name = "叶振";
//    yz.age = 24;
//    yz.study();
//}

/**
 *test main of class Person
 */
//public static void main(String[] args) {
//    Person person = new Person("jack");
//}

/**
 * test main of class Pet
 */
//public static void main(String[] args) {
//    Pet dog = new Pet();
//    dog.name = "旺财";
//    dog.age = 13;
//    dog.shout();
//}

/**
 * test main of class Student 封装
 */
//public static void main(String[] args) {
//    Student stu1 = new Student();
//    stu1.setName("yz");
//    String name = stu1.getName();
//    System.out.println(name);
//}

/**
 * test main of class Person 继承
 */
//public static void main(String[] args) {
//    var student = StudentFactory.createDemo05Student();
//    System.out.println(student.getMoney());
//    student.say();
//    student.test("Student-test-name");
//}