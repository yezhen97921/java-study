package com.study.reflection;

public class Demo09 {
    public static void main(String[] args) {
        HelloWorld hello = new HelloWorld();
        hello.morning("chenlu");
    }

    public interface Hello {
        void morning(String name);
    }

    public static class HelloWorld implements Hello {
        public void morning(String name) {
            System.out.println("Good morning " + name);
        }
    }
}
