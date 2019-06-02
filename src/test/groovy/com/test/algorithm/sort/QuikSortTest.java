package com.test.algorithm.sort;

/**
 * Description:
 * Author: wangjinshuai
 * Date: 2019-06-02 12:08
 * Email: wangjinshuai@jd.com
 */
public class QuikSortTest {

    public static void main(String[] args) {
        QuikSort sort = new QuikSort();

        int[] items = new int[]{13, 20, 14, 2, 9, 5};
        sort.sort(items);
        sort.print(items);
    }
}
