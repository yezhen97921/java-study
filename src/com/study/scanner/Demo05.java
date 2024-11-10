package com.study.scanner;

import java.util.Scanner;

public class Demo05 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double sum = 0;
        int count = 0;

        while (true) {
            System.out.println("请输入数字 （输入“输出结果”）结束");
            String input = scanner.nextLine();
            if (input.equals("输出结果")) break;

            try {
                sum += Double.parseDouble(input);
                count++;
            } catch (NumberFormatException e) {
                System.out.println("请输入有效的数字");
            }
        }
        System.out.println(count > 0 ? count + "个数的和为" + sum + "\n平均值是" + (sum/count) : "没有输入任何数字");

        scanner.close();
    }
}
