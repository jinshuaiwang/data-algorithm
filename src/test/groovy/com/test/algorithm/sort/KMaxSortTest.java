package com.test.algorithm.sort;

/**
 * Description:
 * Author: wangjinshuai
 * Date: 2019-06-02 12:08
 * Email: wangjinshuai@jd.com
 */
public class KMaxSortTest {

    public static void main(String[] args) {
        KMaxSort sort = new KMaxSort();

        // 20 14 13 9 5 2
        int[] items = {13, 20, 14, 2, 9, 5};
        System.out.println(sort.kMax(items, 4));
    }
}
