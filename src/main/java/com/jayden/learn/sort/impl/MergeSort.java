package com.jayden.learn.sort.impl;

public class MergeSort {
    public static void sort(int[] arrays) {
        mergeSort(arrays, 0, arrays.length - 1);
    }

    private static void mergeSort(int[] arrays, int begin, int end) {
        if (begin >= end) {
            return;
        }
        int half = (end + begin) / 2;
        mergeSort(arrays, begin, half);
        mergeSort(arrays, half + 1, end);
        merge(arrays, begin, half, half + 1, end);
    }

    /**
     * 合并两段数字
     * @param arrays 存储
     * @param firstStart 第一段开始位置
     * @param firstEnd 第一段结束位置
     * @param secondStart 第二段开始位置
     * @param secondEnd 第二段结束位置
     */
    private static void merge(int[] arrays, int firstStart, int firstEnd, int secondStart, int secondEnd) {
        int[] mergeArray = new int[firstEnd - firstStart + 1 + secondEnd - secondStart + 1];
        int firstPos = firstStart, secondPos = secondStart;
        int mergeArrayPos = 0;
        while (firstPos <= firstEnd && secondPos <= secondEnd) {
            if (arrays[firstPos] < arrays[secondPos]) {
                mergeArray[mergeArrayPos++] = arrays[firstPos++];
            } else {
                mergeArray[mergeArrayPos++] = arrays[secondPos++];
            }
        }
        while (firstPos <= firstEnd) {
            mergeArray[mergeArrayPos++] = arrays[firstPos++];
        }
        while (secondPos <= secondEnd) {
            mergeArray[mergeArrayPos++] = arrays[secondPos++];
        }

        mergeArrayPos = 0;
        while (firstStart <= firstEnd) {
            arrays[firstStart++] = mergeArray[mergeArrayPos++];
        }
        while (secondStart <= secondEnd) {
            arrays[secondStart++] = mergeArray[mergeArrayPos++];
        }
    }
}
