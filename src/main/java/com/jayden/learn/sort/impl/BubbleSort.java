package com.jayden.learn.sort.impl;

public class BubbleSort {
    public static void sort(int[] numbers) {
        for (int i = numbers.length; i > 0; i--) {
            for (int j = 0; j < i - 1; j++) {
                if (numbers[j] > numbers[j + 1]) {
                    int tmp = numbers[j + 1];
                    numbers[j + 1] = numbers[j];
                    numbers[j] = tmp;
                }
            }
        }
    }
}
