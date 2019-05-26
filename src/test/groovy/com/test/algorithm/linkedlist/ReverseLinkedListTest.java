package com.test.algorithm.linkedlist;

/**
 * Description:
 * Author: wangjinshuai
 * Date: 2019-05-23 18:21
 * Email: wangjinshuai@jd.com
 */
public class ReverseLinkedListTest {

    public static void main(String[] args) {
        ReverseLinkedList linkedList = new ReverseLinkedList();

        linkedList.add("a");
        linkedList.add("b");
        linkedList.add("c");
        linkedList.add("d");
        linkedList.add("e");
        linkedList.add("f");
        linkedList.add("g");

        linkedList.print();

        linkedList.reverse();
        linkedList.printReverse();
    }
}
