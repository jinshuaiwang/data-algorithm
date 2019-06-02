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
     * @param items
     * @param n
     */
    public void sort(int[] items, int n) {
        if (null == items || items.length < 2) {
            return ;
        }

        sort(items, 0, n);
    }

    /**
     * 排序
     * @param items
     * @param start
     * @param end
     */
    private void sort(int[] items, int start, int end) {
        if (start >= end) {
            return;
        }

        int mid = (start + end) / 2;
        sort(items, start, mid);
        sort(items, mid + 1, end);

        merge(items, start, end, mid);
    }

    /**
     * 数组合并
     * @param items
     * @param start
     * @param end
     * @param mid
     */
    private void merge(int[] items, int start, int end, int mid) {
        int frontIndex = start;
        int endIndex = mid;
        int index = 0;

        int[] temp = new int[end - start + 1];
        while (true) {
            if (frontIndex >= mid || endIndex >= end) {
                break;
            }

            if (items[frontIndex] <= items[endIndex]) {
                temp[index] = items[frontIndex];
                frontIndex++;
            } else {
                temp[index] = items[endIndex];
                endIndex++;
            }

            index++;
        }

        if (frontIndex < mid) {
            for (; frontIndex <= mid; frontIndex++) {
                temp[index] = items[frontIndex];
                index++;
            }
        }

        if (endIndex < end) {
            for (; endIndex <= end; endIndex++) {
                temp[index] = items[endIndex];
                index++;
            }
        }

        index = 0;
        for (int i = start; i <= end; i++) {
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
