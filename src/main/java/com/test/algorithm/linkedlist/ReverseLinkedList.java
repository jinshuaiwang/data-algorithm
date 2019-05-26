package com.test.algorithm.linkedlist;

/**
 * User: wangjinshuai 单链表反转
 * Time: 2019-05-26 1:55 PM
 * Email: wangjinshuai@jd.com
 */
public class ReverseLinkedList {

    /**
     * 头节点
     */
    private Node<Object> head;

    /**
     * 反转链表头节点
     */
    private Node<Object> reverseHead;

    private int size;

    /**
     * 添加
     * @param obj
     */
    public void add(Object obj) {
        if (null == obj) {
            throw new NullPointerException();
        }

        Node node = new Node(obj);

        if (empty()) {
            head = node;
        } else {
            getTail().setNext(node);
        }
        size++;
    }

    /**
     * 打印链表
     */
    public void print(){
        print(head);
    }

    /**
     * 打印反转链表
     */
    public void printReverse() {
        print(reverseHead);
    }

    /**
     * 输出链表
     * @param node
     */
    private void print(Node node) {
        StringBuilder result = new StringBuilder();

        while (true) {
            if (node == null) {
                break;
            }
            result.append(node.getItem()).append(" ");
            node = node.getNext();
        }

        System.out.println("linked list:" + result);
    }

    /**
     * 链表反转
     */
    public void reverse() {
        if (null == head) {
            return ;
        }

        Node node = head;

        while (true) {
            Node temp = new Node(node.getItem());

            if (null != reverseHead) {
                temp.setNext(reverseHead);
            }

            reverseHead = temp;

            node = node.getNext();
            if (null == node) {
                break;
            }
        }
    }

    /**
     * 链表大小
     * @return
     */
    public int size() {
        return size;
    }

    /**
     * 找到尾节点
     * @return
     */
    private Node<Object> getTail() {
        Node node = head;
        while (true) {
            if (null == node.getNext()) {
                return node;
            }
            node = node.getNext();
        }
    }

    /**
     * 判断是否空链表
     * @return
     */
    private boolean empty() {
        return null == head;
    }

    private class Node<E> {

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
    }
}
