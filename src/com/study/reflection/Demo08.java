package com.study.reflection;

public class Demo08 {
    public static void main(String[] args) {
        Object intObj = Integer.valueOf(123);
        Boolean isIntegerType = intObj instanceof Integer;
        Boolean isDoubleType = intObj instanceof Double;
    }
}