package com.test.algorithm.sort;

/**
 * Description:
 * Author: wangjinshuai
 * Date: 2019-05-30 16:21
 * Email: wangjinshuai@jd.com
 */
public class MergeSortTest {

    public static void main(String[] args) {
        int[] array = new int[]{3, 5, 7, 2, 10, 3, 8, 20, 16};
        MergeSort sort = new MergeSort();

        sort.sort(array, array.length - 1);

        sort.print(array);
    }
}
