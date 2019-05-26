package com.test.algorithm.linkedlist;

import com.test.algorithm.linkedlist.model.Node;

/**
 * User: wangjinshuai 有序链表合并
 * Time: 2019-05-26 1:55 PM
 * Email: wangjinshuai@jd.com
 */
public class MergeLinkedList extends BaseLinkedList {

    /**
     * 链表合并
     * @param firstLinkedListHead
     * @param secondLinkedListHead
     */
    public void merge(Node firstLinkedListHead, Node secondLinkedListHead) {
        if (null == firstLinkedListHead && null == secondLinkedListHead) {
            return;
        }

        if (null == firstLinkedListHead) {
            setHead(secondLinkedListHead);
            return;
        }

        if (null == secondLinkedListHead) {
            setHead(firstLinkedListHead);
            return;
        }

        Node firstTemp = firstLinkedListHead;
        Node secondTemp = secondLinkedListHead;

        while (true) {
            // 第一个链表已空，把第二个链表剩余的部分追加到合并结果链表
            if (null == firstTemp) {
                add2Tail(secondTemp);
                break;
            }

            // 第二个链表已空，把第一个链表剩余的部分追加到合并结果链表
            if (null == secondTemp) {
                add2Tail(firstTemp);
                break;
            }

            if (Integer.valueOf(firstTemp.getItem().toString()) < Integer.valueOf(secondTemp.getItem().toString())) {
                // 把一个链表的当前节点元素加到结果链表
                add2Tail(new Node(firstTemp.getItem()));
                firstTemp = firstTemp.getNext();
            } else {
                // 把二个链表的当前节点元素加到结果链表
                add2Tail(new Node(secondTemp.getItem()));
                secondTemp = secondTemp.getNext();
            }
        }
    }

}
