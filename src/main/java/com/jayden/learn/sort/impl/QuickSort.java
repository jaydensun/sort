package com.jayden.learn.sort.impl;

public class QuickSort {
    public static void sort(int[] numbers) {
        quickSort(numbers, 0, numbers.length - 1);
    }

    private static void quickSort(int[] numbers, int low, int high) {
        // 要排序的数字小于等于1个，直接返回
        if (low >= high) {
            return;
        }
        int base = numbers[low];
        int lowCursor = low;
        int highCursor = high;
        while (lowCursor < highCursor) {
            while (numbers[highCursor] >= base && lowCursor < highCursor) {
                highCursor--;
            }
            numbers[lowCursor] = numbers[highCursor];
            while (numbers[lowCursor] <= base && lowCursor < highCursor) {
                lowCursor++;
            }
            numbers[highCursor] = numbers[lowCursor];
        }
        numbers[lowCursor] = base;
        quickSort(numbers, low, lowCursor - 1);
        quickSort(numbers, lowCursor + 1, high);
    }

}
