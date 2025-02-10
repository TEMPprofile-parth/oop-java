package com.Parth.generics;

import java.util.Arrays;

public class CustomArrayList {
    private int[] data;
    private int DEAFUlT_SIZE = 10;
    private int size = 0;

    public CustomArrayList() {
        this.data = new int[DEAFUlT_SIZE];
    }

    public void add(int num) {
        if (isFull()) {
            resize();
        }
        data[size++] = num;
    }

    public void add(int index, int num) {
        data[index] = num;
    }

    private void resize() {
        int[] temp = new int[DEAFUlT_SIZE * 2];
        for (int i = 0; i < size; i++) {
            temp[i] = data[i];
        }
        data = temp;
    }

    private boolean isFull() {
        return size == DEAFUlT_SIZE;
    }

    public int remove() {
        return data[--size];
    }

    public int get(int index) {
        return data[index];
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

