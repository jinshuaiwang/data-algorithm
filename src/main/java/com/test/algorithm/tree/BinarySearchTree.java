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
        Node node16 = new Node(null, null, 16);
        Node node19 = new Node(null, null, 19);
        Node node27 = new Node(null, null, 27);
        Node node51 = new Node(null, null, 51);
        Node node66 = new Node(null, null, 66);
        Node node34 = new Node(null, null, 34);

        Node node13 = new Node(null, node16, 13);
        Node node25 = new Node(node19, node27, 25);

        Node node58 = new Node(node51, node66, 58);
        Node node18 = new Node(null, node25, 18);
        Node node17 = new Node(node13, node18, 17);
        Node node50 = new Node(node34, node58, 50);
        Node node33 = new Node(node17, node50, 33);

        root = node33;
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
        while (true) {
            if (Integer.valueOf(node.getData().toString()) > data) {
                if (null == node.getLeftChildNode()) {
                    node.setLeftChildNode(new Node(null, null, data));
                    break;
                } else {
                    node = node.getLeftChildNode();
                }
            } else {
                if (null == node.getRightChildNode()) {
                    node.setRightChildNode(new Node(null, null, data));
                    break;
                } else {
                    node = node.getRightChildNode();
                }
            }
        }
    }

    /**
     * 查找元素，不存在则返回-1
     * @param data
     * @return
     */
    public int search(int data) {
        if (null == root) {
            return -1;
        }

        Node node = root;
        while (node != null) {
            if (Integer.valueOf(node.getData().toString()) > data) {
                node = node.getLeftChildNode();
            } else if (Integer.valueOf(node.getData().toString()) < data) {
                node = node.getRightChildNode();
            } else {
                return data;
            }
        }

        return -1;
    }

    /**
     * TODO 删除节点 to be done
     * @param data
     * @return
     */
    public boolean delete(int data) {
        if (null == root) {
            return false;
        }

        Node node = root;
        Node parentNode = null;
        boolean leftNode = false;

        while (node != null) {
            if (Integer.valueOf(node.getData().toString()) > data) {
                parentNode = node;
                node = node.getLeftChildNode();
                leftNode = true;
                continue;
            }

            if (Integer.valueOf(node.getData().toString()) < data) {
                parentNode = node;
                node = node.getRightChildNode();
                leftNode = false;
                continue;
            }

            if (Integer.valueOf(node.getData().toString()) == data) {
                if (null == node.getLeftChildNode() && null == node.getRightChildNode()) {
                    if (null != parentNode) {
                        if (leftNode) {
                            parentNode.setLeftChildNode(null);
                        } else {
                            parentNode.setRightChildNode(null);
                        }
                    }
                    return true;
                } else {
                    if (null != parentNode) {
                        if (leftNode) {
                            parentNode.setLeftChildNode(null);
                        } else {
                            parentNode.setRightChildNode(null);
                        }
                    }
                }
            }
        }
        return false;
    }

    public Node getRoot() {
        return root;
    }
}
