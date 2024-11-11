package com.study.method;

/**
 * 命令行传递参数
 */
public class ArgsTerminal {
    public static void main(String[] args) {
        for (int i=0; i<args.length; i++) {
            System.out.println(args[i]);
        }
    }
}
