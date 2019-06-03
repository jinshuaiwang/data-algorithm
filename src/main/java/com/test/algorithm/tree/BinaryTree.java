package com.test.algorithm.tree;

import com.test.algorithm.tree.model.Node;

/**
 * Description:
 * Author: wangjinshuai
 * Date: 2019-06-03 18:29
 * Email: wangjinshuai@jd.com
 */
public class BinaryTree {

    /**
     * 初始化二叉树
     * @return
     */
    public Node init() {
        Node d = new Node(null, null, "d");
        Node e = new Node(null, null, "e");
        Node f = new Node(null, null, "f");
        Node g = new Node(null, null, "g");

        Node b = new Node(d, e, "b");
        Node c = new Node(f, g, "c");

        Node a = new Node(b, c, "a");

        return a;
    }

    /**
     * 先根遍历
     * @param node
     */
    public void preOrder(Node node) {
        if (null == node) {
            return;
        }

        System.out.print(node.getData() + " ");
        preOrder(node.getLeftChildNode());
        preOrder(node.getRightChildNode());
    }

    /**
     * 中根遍历
     * @param node
     */
    public void midOrder(Node node) {
        if (null == node) {
            return;
        }

        midOrder(node.getLeftChildNode());
        System.out.print(node.getData() + " ");
        midOrder(node.getRightChildNode());
    }

    /**
     * 后根遍历
     * @param node
     */
    public void postOrder(Node node) {
        if (null == node) {
            return;
        }

        postOrder(node.getLeftChildNode());
        postOrder(node.getRightChildNode());
        System.out.print(node.getData() + " ");
    }

    /**
     * 按层遍历
     * @param node
     */
    public void levelOrder(Node node) {
        if (null == node) {
            return;
        }

        Node head = node;
        while (head != node) {
            // 输出当前层
            print(head);
            // 构造下一层
            build(head);
        }
    }

    /**
     * 打印节点
     * @param node
     */
    private void print(Node node){
        if (null == node) {
            return;
        }

        Node temp = node;
        while (null != temp) {
            System.out.print(temp.getData() + " ");
            temp = node.getNext();
        }
    }

    /**
     * 构造head
     * @param node
     * @return
     */
    private Node build(Node node){
        if (null == node) {
            return null;
        }

        Node temp = node;

        Node result = null;
        return null;
    }

}
