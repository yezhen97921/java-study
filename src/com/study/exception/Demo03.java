package com.study.exception;

import java.util.Arrays;

/**
 * @Description NullPointerException ==> 空指针异常，俗称NPE
 */
public class Demo03 {
    public static void main(String[] args) {
        String str = null;
        System.out.println(str.toLowerCase());
    }
}
