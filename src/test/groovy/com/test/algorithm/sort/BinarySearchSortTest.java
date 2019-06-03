package com.test.algorithm.sort;

/**
 * Description:
 * Author: wangjinshuai
 * Date: 2019-06-03 10:57
 * Email: wangjinshuai@jd.com
 */
public class BinarySearchSortTest {

    public static void main(String[] args) {
        BinarySearchSort searchSort = new BinarySearchSort();
        int[] items = {2, 4, 4, 4, 7, 9, 12};

        int index = searchSort.search(items, 1000);
        System.out.printf("result:" + items[index]);
    }
}
