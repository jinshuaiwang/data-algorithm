package com.test.algorithm.tree;

/**
 * Description:
 * Author: wangjinshuai
 * Date: 2019-06-09 22:30
 * Email: wangjinshuai@jd.com
 */
public class HeapTest {

    public static void main(String[] args) {
        Heap heap = new Heap(10);

        heap.insert(50);
        heap.insert(19);
        heap.insert(30);
        heap.insert(9);
        heap.insert(4);
        heap.insert(11);
        heap.insert(7);
        heap.print();

        heap.delete(50);
        heap.print();

        int[] items = new int[]{-1, 1, 8, 3, 18, 20, 16, 30, 48, 17};
//        heap.buildHeap(items);

        heap.sort(items);
        heap.print();
        System.out.println("数据交换次数:" + heap.getSwapCount());
    }
}
