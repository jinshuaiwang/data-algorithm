package com.test.algorithm.sort;

/**
 * Description:
 * Author: wangjinshuai
 * Date: 2019-05-30 16:21
 * Email: wangjinshuai@jd.com
 */
public class MergeSortTest {

    public static void main(String[] args) {
        int[] array = new int[]{3, 5, 7, 2, 10, 3, 8, 20, 16, 1, 12, 28, 14, 29, 300, 30, 20};
        MergeSort sort = new MergeSort();

        sort.sort(array, 0, array.length);

        sort.print(array);
    }
}
