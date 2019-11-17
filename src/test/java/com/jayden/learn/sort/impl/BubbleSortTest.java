package com.jayden.learn.sort.impl;

import org.junit.Assert;
import org.junit.Test;

import java.util.Arrays;
import java.util.Random;

public class BubbleSortTest {
    private static int[] numbers;
    private static int len;

    private static int[] sortNumbers;
    static {
        Random random = new Random();
        len = 3 + random.nextInt(3);
        numbers = new int[len];
        for (int i = 0; i < len; i++) {
            numbers[i] = random.nextInt(10);
        }
        System.out.println("numbers = " + Arrays.toString(numbers));

        sortNumbers = Arrays.copyOf(numbers, len);
        Arrays.sort(sortNumbers);
        System.out.println("sortNumbers = " + Arrays.toString(sortNumbers));
    }


    @Test
    public void sort() throws Exception {
        int[] copyOf = Arrays.copyOf(numbers, len);
        BubbleSort.sort(copyOf);
        System.out.println("copyOf = " + Arrays.toString(copyOf));
        Assert.assertArrayEquals(sortNumbers, copyOf);
    }

}