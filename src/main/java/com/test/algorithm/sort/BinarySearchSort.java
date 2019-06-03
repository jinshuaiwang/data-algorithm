package com.test.algorithm.sort;

/**
 * Description: 二分查找，查找最后一个小于给定值的元素
 * Author: wangjinshuai
 * Date: 2019-06-03 10:34
 * Email: wangjinshuai@jd.com
 */
public class BinarySearchSort {

    public int search(int[] items, int value) {
        if (null == items || items.length == 0) {
            return -1;
        }

        int low = 0;
        int high = items.length - 1;
        int n = items.length;

        while (low <= high) {
            int mid = (low + high) / 2;

            if (items[mid] > value) {
                high = mid - 1;
            } else if (items[mid] == value) {
                if (items[mid - 1] < value) {
                    return mid - 1;
                } else {
                    high = mid - 1;
                }
            } else {
                if (mid == n - 1 || items[mid + 1] > value) {
                    return mid;
                } else {
                    low = mid + 1;
                }
            }
        }

        return -1;
    }

}
