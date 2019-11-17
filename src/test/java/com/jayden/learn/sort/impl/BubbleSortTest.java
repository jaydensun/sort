package com.jayden.learn.sort.impl;

import org.junit.Test;

import java.util.Arrays;
import java.util.Random;

public class BubbleSortTest {
    private static int[] numbers;

    static {
        int len = 5 + new Random().nextInt(3);
        numbers = new int[len];
        for (int i = 0; i < len; i++) {
            numbers[i] = new Random().nextInt(10);
        }
        System.out.println("numbers = " + Arrays.toString(numbers));
    }

    @Test
    public void sort() throws Exception {
    }

}