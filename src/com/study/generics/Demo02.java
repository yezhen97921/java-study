package com.study.generics;

public class Demo02<T> {

    final T first;
    final T last;

    // 构造方法
    public Demo02(T first, T last) {
        this.first = first;
        this.last = last;
    }

    // 获取第一个元素
    public T getFirst() {
        return first;
    }

    // 获取最后一个元素
    public T getLast() {
        return last;
    }

    // 静态泛型工厂方法，用于创建 Demo02 实例
    public static <T> Demo02<T> create(T first, T last) {
        return new Demo02<>(first, last);
    }

    // 主方法
    public static void main(String[] args) {
        // 使用静态工厂方法创建 Demo02 实例
        Demo02<String> demo02 = Demo02.create("first", "last");

        // 打印 first 和 last 元素
        System.out.println(demo02.getFirst());
        System.out.println(demo02.getLast());
    }
}
