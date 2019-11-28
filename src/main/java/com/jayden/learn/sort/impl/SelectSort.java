package com.jayden.learn.sort.impl;

public class SelectSort {
    public static void sort(int[] arrays) {
        for (int i = 0; i < arrays.length; i++) {
            int perMinPos = i;
            for (int j = i + 1; j < arrays.length; j++) {
                if (arrays[j] < arrays[perMinPos]) {
                    perMinPos = j;
                }
            }
            if (perMinPos != i) {
                int tmp = arrays[i];
                arrays[i] = arrays[perMinPos];
                arrays[perMinPos] = tmp;
            }
        }
    }
}
