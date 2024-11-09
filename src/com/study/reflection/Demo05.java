package com.study.reflection;

public class Demo05 {
    public static void main(String[] args) throws ClassNotFoundException {
        Class<String> cls1 = String.class;
        Class<? extends String> cls2 = "".getClass();
        Class<?> cls3 = Class.forName("java.lang.String");
        System.out.println(cls1);
        System.out.println(cls2);
        System.out.println(cls3);
    }
}
