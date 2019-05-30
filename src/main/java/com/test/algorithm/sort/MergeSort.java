package com.test.algorithm.sort;

/**
 * Description: 归并排序
 * Author: wangjinshuai
 * Date: 2019-05-30 15:53
 * Email: wangjinshuai@jd.com
 */
public class MergeSort {

    /**
     * 排序
     */
    public void sort(int[] items, int start, int end) {
        if (start >= end) {
           return;
        }

        int mid = (start + end) / 2;
        sort(items, start, (mid - start));
        sort(items, (mid + 1), end - (mid + 1));

        int[] temp = new int[end - start];
        int firstIndex = start;
        int secondIndex = mid + 1;

        int index = 0;
        while (firstIndex <= mid && secondIndex < end) {
            if (items[firstIndex] > items[secondIndex]) {
                temp[index] = items[secondIndex];
                secondIndex++;
            } else {
                temp[index] = items[firstIndex];
                firstIndex++;
            }
            index++;
        }

        if (firstIndex <= mid) {
            for (int i = firstIndex; i <= mid; i++) {
                temp[index] = items[firstIndex];
                index++;
                firstIndex++;
            }
        }

        if (secondIndex < end) {
            for (int i = secondIndex; i < end; i++) {
                temp[index] = items[secondIndex];
                index++;
                secondIndex++;
            }
        }

        index = 0;
        for (int i = start ;i < end; i++) {
            items[i] = temp[index];
            index++;
        }
    }

    /**
     * 打印数组
     * @param items
     */
    public void print(int[] items) {
        if (null == items) {
            return;
        }

        StringBuilder result = new StringBuilder();
        for (int i = 0 ; i < items.length; i++) {
            result.append(items[i]).append(" ");
        }
        System.out.println(result.toString());
    }
}
