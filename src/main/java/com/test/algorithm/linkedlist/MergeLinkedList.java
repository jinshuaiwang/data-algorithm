package com.test.algorithm.linkedlist;

/**
 * User: wangjinshuai 有序链表合并
 * Time: 2019-05-26 1:55 PM
 * Email: wangjinshuai@jd.com
 */
public class MergeLinkedList {

    private int size;

    /**
     * 头结点
     */
    private Node head;

    /**
     * 输出链表
     */
    public void print() {
        if (empty()) {
            return ;
        }

        Node node = head;
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
     * 链表合并
     * @param firstLinkedListHead
     * @param secondLinkedListHead
     */
    public void merge(Node firstLinkedListHead, Node secondLinkedListHead) {
        if (null == firstLinkedListHead && null == secondLinkedListHead) {
            return;
        }

        if (null == firstLinkedListHead) {
            head = secondLinkedListHead;
            return;
        }

        if (null == secondLinkedListHead) {
            head = firstLinkedListHead;
            return;
        }

        Node firstTemp = firstLinkedListHead;
        Node secondTemp = secondLinkedListHead;

        while (true) {
            // 第一个链表已空，把第二个链表剩余的部分追加到合并结果链表
            if (null == firstTemp) {
                add2Tail(secondTemp);
                break;
            }

            // 第二个链表已空，把第一个链表剩余的部分追加到合并结果链表
            if (null == secondTemp) {
                add2Tail(firstTemp);
                break;
            }

            if (Integer.valueOf(firstTemp.getItem().toString()) < Integer.valueOf(secondTemp.getItem().toString())) {
                // 把一个链表的当前节点元素加到结果链表
                add2Tail(new Node(firstTemp.getItem()));
                firstTemp = firstTemp.getNext();
            } else {
                // 把二个链表的当前节点元素加到结果链表
                add2Tail(new Node(secondTemp.getItem()));
                secondTemp = secondTemp.getNext();
            }
        }
    }

    /**
     * 初始化链表
     * @param intArray
     * @return
     */
    public Node init(int[] intArray) {
        if (null == intArray || intArray.length == 0) {
            return null;
        }

        Node head = new Node(intArray[0]);
        Node node = head;

        for (int i = 1; i < intArray.length ; i++) {
            node.setNext(new Node(intArray[i]));
            node = node.getNext();
        }

        return head;
    }

    /**
     * 链表大小
     * @return
     */
    public int size() {
        return size;
    }

    /**
     * 追加的尾部节点
     * @param node
     */
    private void add2Tail(Node node) {
        if (null == node) {
            return;
        }

        Node tailNode = getTail();
        if (null == tailNode) {
            head = node;
        } else {
            tailNode.setNext(node);
        }
    }

    /**
     * 找到尾节点
     * @return
     */
    private Node<Object> getTail() {
        Node node = head;
        while (true) {
            if (null == node || null == node.getNext()) {
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

    protected class Node<E> {

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
