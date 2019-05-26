package com.test.algorithm.linkedlist.model;

/**
 * User: wangjinshuai
 * Time: 2019-05-26 5:52 PM
 * Email: wangjinshuai@jd.com
 */
public class Node<E> {

    /**
     * 数据
     */
    private E item;

    /**
     * 后继节点
     */
    private Node<E> next;

    public Node(E item) {
        this.item = item;
    }

    public Node(E item, Node<E> next) {
        this.item = item;
        this.next = next;
    }

    public E getItem() {
        return item;
    }

    public void setItem(E item) {
        this.item = item;
    }

    public Node<E> getNext() {
        return next;
    }

    public void setNext(Node<E> next) {
        this.next = next;
    }

    /**
     *
     * @return
     */
    public Node<E> getFastNext() {
        if (null == this || null == this.getNext()) {
            return null;
        }

        return this.getNext().getNext();
    }
}
