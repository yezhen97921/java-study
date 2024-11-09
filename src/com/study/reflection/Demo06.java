package com.study.reflection;

public class Demo06 {
    public static void main(String[] args) {

        Class<Integer> integerCls = Integer.class;
        Class<? super Integer> pIntegerCls = integerCls.getSuperclass();
        Class grandPIntegerCls = pIntegerCls.getSuperclass();

        System.out.print(integerCls + "\n");
        System.out.print(pIntegerCls + "\n");
        System.out.print(grandPIntegerCls + "\n");
        System.out.print(grandPIntegerCls.getSuperclass() + "\n");
    }
}
