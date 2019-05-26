package com.test.algorithm.linkedlist;

import com.test.algorithm.linkedlist.model.Node;

/**
 * User: wangjinshuai
 * Time: 2019-05-26 5:00 PM
 * Email: wangjinshuai@jd.com
 */
public class RingCheckLinkedListTest {

    public static void main(String[] args) {
        RingCheckLinkedList linkedList = new RingCheckLinkedList();

        linkedList.init(new int[]{3, 4, 7, 10, 20, 28, 5});

        linkedList.print();
    }
}
