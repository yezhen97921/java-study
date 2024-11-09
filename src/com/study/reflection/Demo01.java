package com.study.reflection;

/**
 * @Description
 * 通过Class实例获取class信息的方法称为反射(Reflection)
 */
public class Demo01 {
    public static void main(String[] args) throws ClassNotFoundException {
        // 方法一
        Class cls1 = String.class;
        System.out.println("cls1====>" + cls1);

        // 方法二
        String str = "Hello";
        Class cls2 = str.getClass();
        System.out.println("cls2====>" + cls2);

        // 方法三
        Class cls3 = Class.forName("java.lang.String");
        System.out.println("cls3====>" + cls3);

        Boolean sameClass = cls1 == cls2;
        System.out.println(sameClass + "===>isSameClass");
    }
}
