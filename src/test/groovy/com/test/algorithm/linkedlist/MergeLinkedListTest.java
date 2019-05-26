package com.test.algorithm.linkedlist;

/**
 * User: wangjinshuai
 * Time: 2019-05-26 5:00 PM
 * Email: wangjinshuai@jd.com
 */
public class MergeLinkedListTest {

    public static void main(String[] args) {
        MergeLinkedList linkedList = new MergeLinkedList();

        MergeLinkedList.Node firstLinkedListHead = linkedList.init(new int[]{1, 2, 3, 6, 9});
        MergeLinkedList.Node secondLinkedListHead = linkedList.init(new int[]{2, 8, 9, 15, 19, 30});

        linkedList.merge(firstLinkedListHead, secondLinkedListHead);
        linkedList.print();
    }
}
