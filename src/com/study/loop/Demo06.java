package com.study.loop;

import java.util.Arrays;

public class Demo06 {
    private int size;
    private int[] arr;

    public Demo06() {
        size = 0;
        arr = new int[10];
    }
    public void add(int num) {
        if (size == arr.length) {
            resize();
        }
        arr[size] = num;
        size++;
    }

    public void resize() {
        int newCapacity = arr.length*2;
        int[] newArr = new int[newCapacity];
        System.arraycopy(arr, 0, newArr, 0, arr.length);
        arr = newArr;
    }

    public static void main(String[] args) {
        Demo06 demo = new Demo06();
        demo.add(1);
        demo.add(2);
        demo.add(3);
        demo.add(4);
        demo.add(5);
        demo.add(6);
        demo.add(7);
        demo.add(8);
        demo.add(9);
        demo.add(10);
        System.out.println(Arrays.toString(demo.arr));
        System.out.println(demo.size);
        System.out.println("======================");

        int i = 0;
        while(i<100) {
            i++;
            System.out.println(i);
            if (i == 3) {
                continue;
            }
        }
    }
}
