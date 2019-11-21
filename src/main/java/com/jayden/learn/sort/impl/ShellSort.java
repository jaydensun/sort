package com.jayden.learn.sort.impl;

public class ShellSort {
    public static void sort(int[] arrays) {
        for (int step = arrays.length / 2; step > 0; step /= 2) {
            //从增量那组开始进行插入排序，直至完毕
            for (int i = step; i < arrays.length; i++) {

                int j = i;
                int temp = arrays[j];

                // j - step 就是代表与它同组隔壁的元素
                int last;
                while ((last = j - step) >= 0 && arrays[last] > temp) {
                    arrays[j] = arrays[last];
                    j = last;
                }
                arrays[j] = temp;
            }
        }
    }
}
