package com.test.algorithm.linkedlist;

import lombok.Data;

/**
 * Description: 单链表 实现一个LRU算法
 * Author: wangjinshuai
 * Date: 2019-05-22 15:52
 * Email: wangjinshuai@jd.com
 */
public class LRULinkedList {

    /**
     * 头节点
     */
    private Node<Object> head;

    /**
     * 哨兵节点（一个虚拟的空节点，不存储任何值，便于算法实现设置的）
     */
    private Node<Object> guard;

    private int totalCount = 10;

    private int currentCount;

    public LRULinkedList() {
    }

    public LRULinkedList(int size) {
        this.totalCount = size;
    }

    /**
     * 添加
     * @param obj
     */
    public void add(Object obj) {
        if (null == obj) {
            throw new NullPointerException();
        }

        Node node = new Node(obj, null);

        if (empty()) {
            head = node;
            guard = new Node<Object>(null, head);
            currentCount++;
        } else if (currentCount >= totalCount) {
            if (contains(node)) {
                remove(node);
            } else {
                removeTail();
            }
            addFirst(node);
        } else {
            addFirst(node);
            currentCount++;
        }
    }

    /**
     * 打印链表
     */
    public void print(){
        Node<Object> node = head;

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
     * 链表大小
     * @return
     */
    public int size() {
        return currentCount;
    }

    private void addFirst(Node<Object> node) {
        node.setNext(head);
        guard.setNext(node);
        head = node;
    }

    /**
     * 是否包含
     * @param node
     * @return
     */
    private boolean contains(Node<Object> node) {
        Node temp = head;

        while (true) {
            if (null == temp) {
                return false;
            }

            if (temp.getItem().equals(node.getItem())) {
                return true;
            }
            temp = temp.getNext();
        }
    }

    /**
     * 删除节点
     * @param node
     */
    private void remove(Node<Object> node) {
        Node<Object> temp = guard;

        while (true) {
            if (null == temp.getNext()) {
                break;
            }

            if (temp.getNext().getItem().equals(node.getItem())) {
                temp.setNext(temp.getNext().getNext());
                break;
            }
            temp = temp.getNext();
        }
    }

    /**
     * 删除尾部节点
     */
    private void removeTail() {
        Node<Object> temp = guard;

        while (true) {
            if (null == temp.getNext()) {
                break;
            }

            if (null == temp.getNext().getNext()) {
                temp.setNext(null);
                break;
            }
            temp = temp.getNext();
        }
    }

    /**
     * 判断是否空链表
     * @return
     */
    private boolean empty() {
        return null == head;
    }

    @Data
    private class Node<E> {

        /**
         * 数据
         */
        private E item;

        private Node<E> next;

        public Node(E item, Node<E> next) {
            this.item = item;
            this.next = next;
        }

        public E getItem() {
            return item;
        }

        public Node<E> getNext() {
            return next;
        }

        public void setItem(E item) {
            this.item = item;
        }

        public void setNext(Node<E> next) {
            this.next = next;
        }
    }
}
