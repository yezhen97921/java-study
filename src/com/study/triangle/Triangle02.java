package com.study.triangle;

public class Triangle02 {
    public static void main(String[] args) {
        for (int i=1; i<=3; i++) {
            for (int j=3; j>=i; j--) {
                System.out.print("*");
            }
            for (int j=1; j<=i; j++) {
                System.out.print("^");
            }
            for (int j=1; j<i; j++) {
                System.out.print("^");
            }
            System.out.println();
        }
    }
}