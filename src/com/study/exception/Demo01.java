package com.study.exception;

public class Demo01 {
    public static void main(String[] args) {
        process1(2000);
    }

    /**
     * @decsription 参数检查不合法
     * @param age
     */
    static void process1(int age) {
        if (age > 1000) {
            throw new IllegalArgumentException();
        }
    }
}
