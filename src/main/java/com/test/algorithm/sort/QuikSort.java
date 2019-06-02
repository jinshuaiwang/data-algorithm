package com.test.algorithm.sort;

/**
 * Description: 快速排序
 * Author: wangjinshuai
 * Date: 2019-06-02 11:14
 * Email: wangjinshuai@jd.com
 */
public class QuikSort {

    public void sort(int[] items) {
        sort(items, 0, items.length - 1);
    }

    /**
     *
     * @param items
     * @param start
     * @param end
     */
    public void sort(int[] items, int start, int end) {
        if (start >= end) {
            return;
        }

        int p = partition(items, start, end);
        sort(items, start, p - 1);
        sort(items, p + 1, end);
    }

    private int partition(int[] items, int start, int end) {
        int i = start;
        int pivot = items[end];

        for (int j = start; j <= end; j++) {
            if (items[j] < pivot) {
                int temp = items[i];
                items[i] = items[j];
                items[j] = temp;
                i++;
            }
        }

        int temp = items[i];
        items[i] = items[end];
        items[end] = temp;
        return i;
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
