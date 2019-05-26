package com.test.algorithm.linkedlist;

import com.test.algorithm.linkedlist.model.Node;

/**
 * User: wangjinshuai
 * Time: 2019-05-26 5:44 PM
 * Email: wangjinshuai@jd.com
 */
public class BaseLinkedList {

    /**
     * 链表大小
     */
    private int size;

    /**
     * 头节点
     */
    private Node head;

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
     * 追加的尾部节点
     * @param node
     */
    public void add2Tail(Node node) {
        if (null == node) {
            return;
        }

        Node tailNode = getTail();
        if (null == tailNode) {
            setHead(node);
        } else {
            tailNode.setNext(node);
        }
    }

    /**
     * 找到尾节点
     * @return
     */
    public Node<Object> getTail() {
        Node node = getHead();
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
    public boolean empty() {
        return null == getHead();
    }

    public Node getHead() {
        return head;
    }

    public void setHead(Node head) {
        this.head = head;
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }
}
