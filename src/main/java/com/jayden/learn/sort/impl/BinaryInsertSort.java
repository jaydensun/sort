package com.jayden.learn.sort.impl;

public class BinaryInsertSort {
    public static void sort(int[] numbers) {
        for (int i = 1; i <= numbers.length - 1; i++) {
            int begin = 0;
            int end = i - 1;
            int curNumber = numbers[i];
            while (begin <= end) {
                int middle = (begin + end) / 2;
                if (numbers[middle] <= curNumber) {
                    begin = middle + 1;
                } else {
                    end = middle - 1;
                }
            }
            System.arraycopy(numbers, begin, numbers, begin + 1, i - begin);
            numbers[begin] = curNumber;
        }
    }
}
