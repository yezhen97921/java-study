package com.study.loop;

public class Demo01 {
    public static void main(String[] args) {
        int sum = 0;
        int start = 0;
        int end = 100;
        while (start <= end) {
            sum += start;
            start++;
        }
        System.out.println(sum);
    }
}
