package com.study.array;

public class Demo02 {

    public static void main(String[] args) {
        int[] arrays = {1, 2, 3, 4, 5};
        int max = arrays[0];
        for(int i: arrays) {
            if (i >= max) {
                max = i;
            }
        }
        System.out.println(max);
    }
}