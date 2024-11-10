package com.study.scanner;

/**
 * @Description 选择结构 switch
 */
public class Demo07 {
    public static void main(String[] args) {
        char grade = 'C';
        switch (grade) {
            case 'A':
                System.out.println("优");
                break;
            case 'B':
                System.out.println("良");
                break;
            case 'C':
                System.out.println("差");
                break;
            default:
                System.out.println("未知");
        }
    }
}
