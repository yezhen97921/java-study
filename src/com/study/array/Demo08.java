package com.study.array;

import java.util.Arrays;

/**
 * 稀疏数组
 */
public class Demo08 {
    public static void main(String[] args) {
        // 创建一个二维数组 11*11 0：无  1：黑棋  2：白棋
        int[][] arr = new int[11][11];
        arr[1][2] = 1;
        arr[2][3] = 2;
        // 打印二维数组
        for (int[] items : arr) {
            for (int item : items) {
                System.out.print(item + "\t");
            }
            System.out.println();
        }

        // 计算有效值的个数
        int sum = 0;
        for (int i = 0; i < 11; i++) {
            for (int j = 0; j < 11; j++) {
                if (arr[i][j] != 0) {
                    sum++;
                }
            }
        }
        System.out.println("二维数组有效值的个数为" + sum);

        // 创建一个稀疏数组的数组
        int[][] resArr = new int[sum + 1][3];
        resArr[0][0] = 11;
        resArr[0][1] = 11;
        resArr[0][2] = sum;

        // 遍历二维数组，将非零的数字，存放在稀疏数组中
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                if (arr[i][j] != 0) {
                    count++;
                    resArr[count][0] = i;
                    resArr[count][1] = j;
                    resArr[count][2] = arr[i][j];
                }
            }
        }

        // 打印稀疏数组
        for (int i = 0; i < resArr.length; i++) {
            System.out.println(resArr[i][0] + "\t" + resArr[i][1] + "\t" + resArr[i][2] + "\t");
        }


    }
}
