package com.study.generics;

import java.util.Arrays;

public class Demo01 {
    public void main(String[] args) {
        ArrayList<Object> list = new ArrayList<>();
        list.add(1);
        list.add("two");
        list.add("three");
        list.add("four");
        list.add("five");

        Object first = list.get(0);
        System.out.println(first);

    }

    public class ArrayList<T> {
        private T[] array;
        private int size;

        public ArrayList() {
            array = (T[]) new Object[10];
            size = 0;
        }

        // add
        public void add(T e) {
            ensureCapacity();
            array[size++] = e;
        }

        // remove
        public void remove(int index) {
            if (index < 0 || index >= size) {
                throw new IndexOutOfBoundsException("Index: " + index + ", Size: " + size);
            }
            // 将元素左移覆盖
            for (int i = index; i < size - 1; i++) {
                array[i] = array[i + 1];
            }
            array[size--] = null; // 减少 size 并清除最后一个
        }

        // 获取指定索引的元素
        public T get(int index) {
            if (index < 0 || index >= size) {
                throw new IndexOutOfBoundsException("Index: " + index + ", Size: " + size);
            }
            return array[index];
        }

        // 返回当前数组的大小
        public int size() {
            return size;
        }

        // 扩容方法（当数组容量已满时，容量增加一倍）
        private void ensureCapacity() {
            if (size == array.length) {
                array = Arrays.copyOf(array, array.length * 2);
            }
        }

        // 重写 toString 方法
        @Override
        public String toString() {
            return Arrays.toString(Arrays.copyOf(array, size));
        }

    }
}