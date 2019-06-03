package com.test.algorithm.tree;

import com.test.algorithm.tree.model.Node;

/**
 * Description:
 * Author: wangjinshuai
 * Date: 2019-06-03 18:43
 * Email: wangjinshuai@jd.com
 */
public class BinaryTreeTest {

    public static void main(String[] args) {
        BinaryTree tree = new BinaryTree();
        Node root = tree.init();

        tree.preOrder(root);
        System.out.println();

        tree.midOrder(root);
        System.out.println();

        tree.postOrder(root);
        System.out.println();

        tree.levelOrder(root);

    }
}
