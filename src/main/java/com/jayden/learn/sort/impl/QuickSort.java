package com.jayden.learn.sort.impl;

public class QuickSort {
    public static void sort(int[] numbers) {
        quickSort(numbers, 0, numbers.length - 1);
    }

    private static void quickSort(int[] numbers, int low, int high) {
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
            while (numbers[lowCursor] <= base && lowCursor < highCursor) {
                lowCursor++;
            }
            if (lowCursor < highCursor) {
                swap(numbers, lowCursor, highCursor);
            }
        }
        swap(numbers, low, lowCursor);
        quickSort(numbers, low, lowCursor - 1);
        quickSort(numbers, lowCursor + 1, high);

    }

    private static void swap(int[] numbers, int first, int second) {
        int tmp = numbers[first];
        numbers[first] = numbers[second];
        numbers[second] = tmp;
    }
}
