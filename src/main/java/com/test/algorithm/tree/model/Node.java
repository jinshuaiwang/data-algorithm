package com.test.algorithm.tree.model;

/**
 * Description:
 * Author: wangjinshuai
 * Date: 2019-06-03 18:29
 * Email: wangjinshuai@jd.com
 */
public class Node<E> {

    /**
     * 左子节点
     */
    private Node leftChildNode;

    /**
     * 右子节点
     */
    private Node rightChildNode;

    /**
     * 数据
     */
    private E data;

    public Node(Node leftChildNode, Node rightChildNode, E data) {
        this.leftChildNode = leftChildNode;
        this.rightChildNode = rightChildNode;
        this.data = data;
    }

    public Node getLeftChildNode() {
        return leftChildNode;
    }

    public Node getRightChildNode() {
        return rightChildNode;
    }

    public E getData() {
        return data;
    }
}
