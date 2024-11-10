package com.study.loop;

public class Demo04 {
    public static void main(String[] args) {
        for(int j=1; j<=7; j++) {
            for (int i = 1; i <= j; i++) {
                System.out.print(i + "*" + j + "=" + (j * i) + "\t");
            }
            System.out.println();
        }
    }
}
