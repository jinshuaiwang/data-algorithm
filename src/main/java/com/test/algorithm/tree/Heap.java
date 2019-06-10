package com.test.algorithm.tree;

/**
 * Description:堆
 * Author: wangjinshuai
 * Date: 2019-06-09 22:09
 * Email: wangjinshuai@jd.com
 */
public class Heap {

    private int[] items;

    /**
     * 当前堆元素的大小
     */
    private int count;

    public Heap(int size) {
        items = new int[size];
    }

    /**
     * 插入元素
     * @param data
     */
    public void insert(int data) {
        if (full()) {
            throw new RuntimeException("heap has already full");
        }

        count++;
        items[count] = data;

        int n = count;
        while (n > 1 && items[n / 2] < items[n]) {
            int temp = items[n / 2];
            items[n / 2] = items[n];
            items[n] = temp;

            n = n / 2;
        }
    }

    /**
     * 删除元素
     * @param data
     * @return
     */
    public boolean delete(int data) {
        try {
            int index = find(data);
            items[index] = items[count];
            items[count] = 0;
            count--;

            heapify(index);
            return true;
        } catch (Exception e) {
            System.out.println("exception:" + e);
            return false;
        }
    }

    /**
     * 堆化 从顶向下依次堆化
     * @param index
     */
    private void heapify(int index) {

        while (true) {
            int maxPosition = index;
            if (2 * index <= count && items[index] < items[2 * index]) {
                maxPosition = 2 * maxPosition;
            }

            if ((2 * index + 1) <= count && items[maxPosition] < items[2 * index + 1]) {
                maxPosition = 2 * index + 1;
            }

            if (maxPosition == index) {
                break;
            }

            int temp = items[index];
            items[index] = items[maxPosition];
            items[maxPosition] = temp;

            index = maxPosition;
        }
    }

    /**
     * 堆是否已满
     * @return
     */
    private boolean full() {
        return count >= items.length - 1;
    }

    /**
     * 空堆
     * @return
     */
    private boolean empty() {
        return count == 0;
    }

    /**
     * 查找元素
     * @param data
     * @return
     */
    private int find(int data) {
        if (empty()) {
            throw new RuntimeException("heap is empty");
        }

        for (int i = 1; i <= count; i++) {
            if (data == items[i]) {
                return i;
            }
        }

        throw new RuntimeException(data + " not exist");
    }

    /**
     * 打印堆
     */
    public void print() {
        if (empty()) {
            System.out.println("空堆");
            return;
        }

        StringBuilder result = new StringBuilder();
        for (int i = 1; i <= count; i++) {
            result.append(items[i] + " ");
        }

        System.out.println("堆：" + result.toString());
    }
}
