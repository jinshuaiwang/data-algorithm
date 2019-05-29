package com.test.algorithm.queue;

/**
 * Description:
 * Author: wangjinshuai
 * Date: 2019-05-29 17:54
 * Email: wangjinshuai@jd.com
 */
public class LinkedQueueTest {

    public static void main(String[] args) {
        LinkedQueue queue = new LinkedQueue();

        queue.enqueue("1");
        queue.enqueue("2");
        queue.enqueue("3");
        queue.enqueue("4");
        queue.enqueue("5");

        queue.dequeue();
        queue.dequeue();
        queue.dequeue();

        System.out.println(queue.toString());
    }
}
