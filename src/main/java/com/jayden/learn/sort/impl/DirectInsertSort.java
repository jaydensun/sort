package com.jayden.learn.sort.impl;

public class DirectInsertSort {
    public static void sort(int[] numbers) {
        for (int i = 1; i <= numbers.length - 1; i++) {
            for (int j = i; j > 0; j--) {
                if (numbers[j - 1] < numbers[j]) {
                    break;
                } else {
                    int tmp = numbers[j - 1];
                    numbers[j - 1] = numbers[j];
                    numbers[j] = tmp;
                }
            }
        }
    }
}
