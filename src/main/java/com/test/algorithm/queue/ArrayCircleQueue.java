package com.test.algorithm.queue;

/**
 * Description:
 * Author: wangjinshuai
 * Date: 2019-05-29 17:32
 * Email: wangjinshuai@jd.com
 */
public class ArrayCircleQueue {

    private String[] items;

    /**
     * 队列当前元素个数
     */
    private int size;

    /**
     * 队列头下标
     */
    private int head;

    /**
     * 队列尾下标
     */
    private int tail;

    public ArrayCircleQueue(int length) {
        items = new String[length];
    }

    /**
     * 入队
     * @param obj
     * @return
     */
    public boolean enqueue(String obj) {
        if (isFull()) {
            throw new RuntimeException("queue has already full");
        }

        if (isEmpty()) {
            items[head] = obj;
        }

        items[tail] = obj;
        tail = (tail + 1) % items.length;
        size++;

        return true;
    }

    /**
     * 出队
      * @return
     */
    public Object dequeue() {
        if (isEmpty()) {
            throw new RuntimeException("empty queue");
        }

        String temp = items[head];
        items[head] = null;
        head = (head + 1) % items.length;
        size--;

        return temp;
    }

    /**
     * 空队列
     * @return
     */
    public boolean isEmpty() {
        return size == 0;
    }

    /**
     * 判断队列是否已满
     * @return
     */
    public boolean isFull() {
        return size == items.length;
    }

    public String toString() {
        if (isEmpty()) {
            return "";
        }

        StringBuilder result = new StringBuilder();

        int total;
        if (tail <= head) {
            total = tail + items.length;
        } else {
            total = tail;
        }

        for (int i = head ;i < total; i++) {
            result.append(items[i % items.length]).append(" ");
        }

        return result.toString();
    }
}
