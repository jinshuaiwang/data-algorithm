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
        System.out.println();

        binaryTree.levelOrder(searchTree.getRoot());

        int result = searchTree.search(16);
        System.out.println(result == -1 ? "元素不存在" : "查找到元素：" + result);

        searchTree.insert(100);
        binaryTree.midOrder(searchTree.getRoot());
        System.out.println();
        System.out.println();

        binaryTree.levelOrder(searchTree.getRoot());

        searchTree.delete(27);
        binaryTree.levelOrder(searchTree.getRoot());
        System.out.println();

        binaryTree.midOrder(searchTree.getRoot());
//        searchTree.insert(8);
//        binaryTree.midOrder(searchTree.getRoot());
//        System.out.println();
//
//        searchTree.insert(15);
//        binaryTree.midOrder(searchTree.getRoot());
//        System.out.println();
//
//        searchTree.insert(12);
//        binaryTree.midOrder(searchTree.getRoot());
//        System.out.println();
    }
}
