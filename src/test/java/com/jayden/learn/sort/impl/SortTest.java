package com.jayden.learn.sort.impl;

import org.junit.Assert;
import org.junit.Test;

import java.util.Arrays;
import java.util.Random;
import java.util.function.Consumer;

public class SortTest {


    @Test
    public void sort() throws Exception {
        Random random = new Random();
        final int[] numbers = new int[5 + random.nextInt(5)];
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = random.nextInt(10);
        }
//        int[] numbers = new int [] {4, 0, 6, 9, 6};
        System.out.println("numbers = " + Arrays.toString(numbers));

        int[] sortNumbers = Arrays.copyOf(numbers, numbers.length);
        Arrays.sort(sortNumbers);
        System.out.println("sortNumbers = " + Arrays.toString(sortNumbers));

        Arrays.<Consumer<int[]>>asList(
                BubbleSort::sort,
                DirectInsertSort::sort,
                BinaryInsertSort::sort,
                QuickSort::sort,
                ShellSort::sort,
                SelectSort::sort
        ).forEach(consumer -> {
            int[] copyOf = Arrays.copyOf(numbers, numbers.length);
            consumer.accept(copyOf);
            System.out.println("copyOf = " + Arrays.toString(copyOf));
            Assert.assertArrayEquals(sortNumbers, copyOf);
        });

    }

    @Test
    public void multiSort() throws Exception {
        for (int i = 0; i < 1000; i++) {
            sort();
        }
    }

}