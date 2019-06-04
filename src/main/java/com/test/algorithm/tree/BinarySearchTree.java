package com.test.algorithm.tree;

import com.test.algorithm.tree.model.Node;

/** 二叉查找树 子节点
 * Description:
 * Author: wangjinshuai
 * Date: 2019-06-04 09:31
 * Email: wangjinshuai@jd.com
 */
public class BinarySearchTree {

    /**
     * 根节点
     */
    private Node root;

    /**
     * 初始化二叉查找树
     */
    public void init() {
        Node node11 = new Node(null, null, 11);
        Node node14 = new Node(null, null, 14);

        Node node13 = new Node(node11, node14, 13);

        Node node9 = new Node(null, null, 9);

        Node node10 = new Node(node9, node13, 10);

        Node node16 = new Node(node10, null, 16);

        root = node16;
    }

    /**
     * 插入节点
     * @param data
     */
    public void insert(int data) {
        if (null == root) {
            return;
        }

        Node node = root;

    }

    public Node getRoot() {
        return root;
    }
}
