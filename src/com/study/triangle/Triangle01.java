package com.study.triangle;

public class Triangle01 {
    public static void main(String[] args) {
        int height = 3; // 三角形的高度
        for (int i = 1; i <= height; i++) {
            // 打印前面的空格，使数字左右对称
            for (int j = 1; j <= height - i; j++) {
                System.out.print("*");
            }
            // 打印三角形的数字
            for (int k = 1; k <= 2 * i - 1; k++) {
                System.out.print("1");
            }
            // 换行
            System.out.println();
        }
    }
}
