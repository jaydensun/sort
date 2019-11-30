package com.jayden.learn.sort.impl;

public class HeapSort {

    public static void sort(int[] arrays) {
        // 建立最大堆
        for (int i = (arrays.length -2 ) / 2; i >=0; i--) {
            maxCurNode(arrays, i, arrays.length - 1);
        }

        for (int i = arrays.length - 1; i >= 0; i--) {
            swap(arrays, i, 0);
            maxCurNode(arrays, 0, i - 1);
        }
    }

    private static void maxCurNode(int[] arrays, int curIndex, int maxIndex) {
        while (curIndex < maxIndex) {
            int leftIndex = curIndex * 2 + 1;
            if (leftIndex > maxIndex)
                break;
            int rightIndex = leftIndex + 1;
            int maxPos = leftIndex;
            if (rightIndex <= maxIndex && arrays[rightIndex] > arrays[maxPos]) {
                maxPos = rightIndex;
            }
            if (arrays[maxPos] > arrays[curIndex]) {
                swap(arrays, curIndex, maxPos);
                curIndex = maxPos;
            } else {
                break;
            }
        }
    }

    private static void swap(int[] arrays, int left, int right) {
        int tmp = arrays[right];
        arrays[right] = arrays[left];
        arrays[left] = tmp;
    }
}
