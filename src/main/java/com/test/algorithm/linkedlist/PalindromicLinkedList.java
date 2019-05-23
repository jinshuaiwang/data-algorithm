package com.test.algorithm.linkedlist;

import lombok.Data;

/**
 * Description: 单向链表 实现回文序列
 * Author: wangjinshuai
 * Date: 2019-05-22 15:52
 * Email: wangjinshuai@jd.com
 */
public class PalindromicLinkedList {

    /**
     * 头节点
     */
    private Node<Object> head;

    /**
     * 辅助头节点
     */
    private Node<Object> assistHead;

    private int totalCount;

    private int currentCount;

    public PalindromicLinkedList() {
        totalCount = 10;
    }

    public PalindromicLinkedList(int size) {
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

        Node node = new Node(obj);

        if (empty()) {
            head = node;
        } else {
            getTail().setNext(node);
        }
        currentCount++;
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
     * 是否回文序列
     * @return
     */
    public boolean palindromic() {
        // 空链表
        if (empty()) {
            return false;
        }

        if (currentCount == 1) {
            return true;
        }

        Node node = head;
        while (true) {
            if (null == node || null == node.getFastNext()) {
                break;
            }

            add2Head(node);
            node = node.getNext();
        }

        while (true) {
            if (null == node || null == node.getSlowNext()) {
                return true;
            }

            if ((null == node && null != node.getSlowNext()) || (null != node && null == node.getSlowNext()) ) {
                return false;
            }

            if (!node.getItem().equals(node.getSlowNext().getItem())) {
                return false;
            }

            node = node.getNext();
        }
    }

    /**
     * 链表大小
     * @return
     */
    public int size() {
        return currentCount;
    }

    /**
     * 添加到链表头部
     * @param node
     */
    private void add2Head(Node node) {
        Node temp = node;
        if (null != assistHead) {
            node.setNext(assistHead);
        } else {
            temp.setNext(null);
        }

        assistHead = temp;
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

    @Data
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

        public Node<E> getFastNext() {
            if (null == this || null == this.getNext()) {
                return null;
            }
            return this.getNext().getNext();
        }

        public Node<E> getSlowNext() {
            if (null == this) {
                return null;
            }
            return this.getNext();
        }

        public Node<E> getNext() {
            return next;
        }

        public void setNext(Node<E> next) {
            this.next = next;
        }
    }
}
