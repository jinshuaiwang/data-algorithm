package com.test.algorithm.stack;

import com.test.algorithm.linkedlist.model.Node;

/**
 * Description:
 * Author: wangjinshuai
 * Date: 2019-05-27 18:09
 * Email: wangjinshuai@jd.com
 */
public class LinkedListStackTest {

    public static void main(String[] args) {
        LinkedListStack stack = new LinkedListStack();
        stack.push(new Node("1"));
        stack.push(new Node("3"));
        stack.push(new Node("5"));
        stack.push(new Node("7"));
        stack.push(new Node("9"));
        stack.push(new Node("11"));

        while (!stack.empty()) {
            System.out.println(stack.pop().getItem());
        }
    }
}
