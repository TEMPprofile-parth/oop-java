package com.Parth.generics;

import java.util.Arrays;
import java.util.Objects;

public class CustomGenArrayList<T extends Number> {
    private Object[] data;
    private int DEAFUlT_SIZE = 10;
    private int size = 0;

    public CustomGenArrayList() {
        this.data = new Object[DEAFUlT_SIZE];
    }

    public void add(T num) {
        if (isFull()) {
            resize();
        }
        data[size++] = num;
    }

    public void add(int index, int num) {
        data[index] = num;
    }

    private void resize() {
        Object[] temp = new Object[DEAFUlT_SIZE * 2];
        for (int i = 0; i < size; i++) {
            temp[i] = data[i];
        }
        data = temp;
    }

    private boolean isFull() {
        return size == DEAFUlT_SIZE;
    }

    public T remove() {
        return (T)data[--size];
    }

    public T get(int index) {
        return (T) data[index];
    }

    public int size() {
        return size;
    }

    @Override
    public String toString() {
        return "CustomArrayList{" +
                "data=" + Arrays.toString(data) +
                ", DEAFUlT_SIZE=" + DEAFUlT_SIZE +
                ", size=" + size +
                '}';
    }
}

