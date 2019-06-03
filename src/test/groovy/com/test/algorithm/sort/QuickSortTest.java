package com.test.algorithm.sort;

/**
 * Description:
 * Author: wangjinshuai
 * Date: 2019-06-02 12:08
 * Email: wangjinshuai@jd.com
 */
public class QuickSortTest {

    public static void main(String[] args) {
        QuickSort sort = new QuickSort();

        int[] items = new int[]{13, 20, 14, 2, 9, 5};
        sort.sort(items);
        sort.print(items);
    }
}
