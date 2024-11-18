package com.study.oop.methods;

import java.io.IOException;

public class Demo01 {
    // main method
    public static void main(String[] args) {

    }

    /**
     * @Description one method to say Hello
     * @return String
     */
    public String sayHello() {
        return "hello, world";
    }

    /**
     * @Description one method to get max number
     * @param a
     * @param b
     * @return int
     */
    public int getMax(int a, int b) {
        return a > b ? a : b;
    }

    // 输出异常
    public void readFile(String file) throws IOException {

    }
}
