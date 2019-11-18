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
        int lowCursor = low + 1;
        int highCursor = high;
        while (lowCursor < highCursor) {
            while (numbers[lowCursor] < base && lowCursor < highCursor) {
                lowCursor++;
            }
            while (numbers[highCursor] >= base && lowCursor < highCursor) {
                highCursor--;
            }
            if (lowCursor < highCursor) {
                swap(numbers, lowCursor, highCursor);
            }
        }
        int confirmPos = numbers[lowCursor] < base ? lowCursor : lowCursor - 1;
        swap(numbers, low, confirmPos);
        quickSort(numbers, low, confirmPos - 1);
        quickSort(numbers, confirmPos + 1, high);

    }

    private static void swap(int[] numbers, int first, int second) {
        int tmp = numbers[first];
        numbers[first] = numbers[second];
        numbers[second] = tmp;
    }
}
