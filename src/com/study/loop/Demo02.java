package com.study.loop;

public class Demo02 {
    public static void main(String[] args) {
        int sum = 0;
        int start = 0;
        int end = 100;

        do {
            sum += start;
            start++;
        } while (start <= end);
        System.out.println(sum);
    }
}
