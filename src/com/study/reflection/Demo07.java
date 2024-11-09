package com.study.reflection;

import java.util.Arrays;

public class Demo07 {
    public static void main(String[] args) {
        Class<Integer> integerCls = Integer.class;
        Class[] integerInterfaces = integerCls.getInterfaces();
        System.out.println(Arrays.toString(integerInterfaces) + "\n");
        for (Class interfaceItem : integerInterfaces) {
            System.out.println(interfaceItem);
        }
    }
}
