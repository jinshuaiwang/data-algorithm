package com.test.algorithm.queue;

/**
 * User: wangjinshuai
 * Time: 2019-05-29 10:20 PM
 * Email: wangjinshuai@jd.com
 */
public class ArrayQueueTest {

    public static void main(String[] args) {
        ArrayCircleQueue queue = new ArrayCircleQueue(4);

        queue.enqueue("1");
        queue.enqueue("2");
        queue.enqueue("3");
        queue.enqueue("4");

        System.out.println(queue.toString());
        queue.dequeue();
        queue.dequeue();
        queue.dequeue();
        queue.enqueue("5");
        queue.enqueue("6");
        queue.enqueue("7");

        System.out.println(queue.toString());

        queue.dequeue();
        queue.dequeue();
        queue.dequeue();
        queue.dequeue();
//        queue.dequeue();
//        queue.enqueue("8");
        System.out.println("result:" + queue.toString());
    }
}
