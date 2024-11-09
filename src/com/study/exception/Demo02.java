package com.study.exception;

/**
 * @description --custom exception types
 */
public class Demo02 {
    public static void main(String[] args) {
        try {
            throw new CustomException("This is a custom exception!!!");
        } catch(CustomException e) {
            System.out.println(e.getMessage());
        }
    }

    public static class BaseException extends RuntimeException {
        public BaseException() {
            super();
        }

        public BaseException(String message, Throwable cause) {
            super(message, cause);
        }

        public BaseException(String message) {
            super(message);
        }

        public BaseException(Throwable cause) {
            super(cause);
        }
    }

    public static class CustomException extends BaseException {
        public CustomException() {
            super();
        }

        public CustomException(String message) {
            super(message);
        }

        public CustomException(String message, Throwable cause) {
            super(message, cause);
        }

        public CustomException(Throwable cause) {
            super(cause);
        }
    }
}
