package com.test.algorithm.tree;

/**
 * Description:
 * Author: wangjinshuai
 * Date: 2019-06-04 09:38
 * Email: wangjinshuai@jd.com
 */
public class BinarySearchTreeTest {

    public static void main(String[] args) {
        BinarySearchTree searchTree = new BinarySearchTree();

        BinaryTree binaryTree = new BinaryTree();
        searchTree.init();

        binaryTree.midOrder(searchTree.getRoot());
    }
}
