package com.test.algorithm.queue;

import com.test.algorithm.linkedlist.model.Node;

/**
 * Description:
 * Author: wangjinshuai
 * Date: 2019-05-29 17:32
 * Email: wangjinshuai@jd.com
 */
public class LinkedQueue<E> {

    /**
     * 队列头结点
     */
    private Node<E> head;

    /**
     * 队列尾结点
     */
    private Node<E> tail;

    /**
     * 队列大小
     */
    private int size;

    /**
     * 入队
     * @param obj
     * @return
     */
    public boolean enqueue(Object obj) {
        if (obj == null) {
            throw new RuntimeException("invalid item");
        }

        Node node = new Node(obj);

        if (null != tail) {
            tail.setNext(node);
        }

        tail = node;
        size++;

        if (head == null) {
            head = node;
        }

        return true;
    }

    /**
     * 出队
      * @return
     */
    public Object dequeue() {
        if (null == head) {
            throw new RuntimeException("empty queue");
        }

        Node node = head;
        head = head.getNext();
        size--;

        return node.getItem();
    }

    /**
     * 空队列
     * @return
     */
    public boolean isEmpty() {
        return size == 0;
    }

    public String toString() {
        if (isEmpty()) {
            return "";
        }

        StringBuilder result = new StringBuilder();
        Node node = head;

        while (true) {
            if (null == node) {
                break;
            }

            result.append(node.getItem()).append(" ");
            node = node.getNext();
        }

        return result.toString();
    }
}
