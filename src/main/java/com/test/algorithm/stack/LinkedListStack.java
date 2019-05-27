package com.test.algorithm.stack;

import com.test.algorithm.linkedlist.model.Node;

/**
 * Description:
 * Author: wangjinshuai
 * Date: 2019-05-27 17:57
 * Email: wangjinshuai@jd.com
 */
public class LinkedListStack {

    private Node head;

    /**
     * 栈大小
     */
    private int size;

    /**
     * 入栈
     * @param node
     */
    public void push(Node node) {
        if (null == node || null == node.getItem()) {
            throw new RuntimeException("invalid node");
        }

        if (!empty()) {
            node.setNext(head);
        }
        head = node;

        size++;
    }

    /**
     * 出栈
     * @return
     */
    public Node pop() {
        if (empty()) {
            throw new RuntimeException("empty stack");
        }

        Node node = new Node(head.getItem());
        head = head.getNext();
        size--;
        return node;
    }

    /**
     *
     * @return
     */
    public boolean empty() {
        return size == 0;
    }
}
