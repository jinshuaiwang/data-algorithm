package com.test.algorithm.sort;

/**
 * Description: 找到数组最k大的元素
 * Author: wangjinshuai
 * Date: 2019-06-02 11:04
 * Email: wangjinshuai@jd.com
 */
public class KMaxSort {

    /**
     * 最K大元素
     * @param items
     * @param k
     * @return
     */
    public int kMax(int[] items, int k) {
        if (null == items || items.length < 1 || k < 1 || k > items.length - 1) {
            return -1;
        }

        int start = 0;
        int end = items.length - 1;
        int p;
        int result = -1;

        while (true) {
            p = partition(items, start, end);
            if (p == k) {
                result = items[p];
                break;
            }

            if (p > k) {
                end = k - 1;
            } else {
                start = k + 1;
            }
        }

        return result;
    }

    private int partition(int[] items, int start, int end){
        int pivot = items[end];

        int p = start;

        for (int j = start; j < end ; j++) {
            if (items[j] > pivot) {
                int temp = items[p];
                items[p] = items[j];
                items[j] = temp;
                p = p + 1;
            }
        }

        int temp = items[p];
        items[p] = items[end];
        items[end] = temp;
        return p;
    }

}
