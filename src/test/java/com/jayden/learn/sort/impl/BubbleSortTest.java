package com.jayden.learn.sort.impl;

import org.junit.Assert;
import org.junit.Test;

import java.util.Arrays;
import java.util.List;
import java.util.Random;
import java.util.function.Consumer;
import java.util.stream.Stream;

public class BubbleSortTest {
    private static int[] numbers;
    private static int len;

    private static int[] sortNumbers;

    static {
        Random random = new Random();
        len = 5 + random.nextInt(5);
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
        Arrays.<Consumer<int[]>>asList(
                BubbleSort::sort,
                DirectInsertSort::sort,
                QuickSort::sort
        ).forEach(consumer -> {
            int[] copyOf = Arrays.copyOf(numbers, len);
            consumer.accept(copyOf);
            System.out.println("copyOf = " + Arrays.toString(copyOf));
            Assert.assertArrayEquals(sortNumbers, copyOf);
        });

    }

}