package com.study.reflection;

import java.lang.reflect.Constructor;

public class Demo04 {
    public static void main(String[] args) throws Exception {
        // 获取构造方法Integer(int)
        Constructor<Integer> consInt = Integer.class.getConstructor(int.class);
        Integer int1 = (Integer) consInt.newInstance(123);
        System.out.println(int1);

        // 获取构造方法Integer(String)
        Constructor<String> consString = String.class.getConstructor(String.class);
        String str1 = (String) consString.newInstance("123");
        System.out.println(str1);
    }
}
