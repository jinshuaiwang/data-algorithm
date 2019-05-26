package com.test.algorithm.linkedlist;

/**
 * Description:
 * Author: wangjinshuai
 * Date: 2019-05-23 18:21
 * Email: wangjinshuai@jd.com
 */
public class PalindromicLinkedListTest {

    public static void main(String[] args) {
        PalindromicLinkedList linkedList = new PalindromicLinkedList();

        linkedList.add("a");
        linkedList.add("b");
        linkedList.add("c");
        linkedList.add("d");
        linkedList.add("c");
        linkedList.add("b");
        linkedList.add("a");
//        linkedList.add("1");
//        linkedList.add("3");
//        linkedList.add("1");
//        linkedList.add("1");
//        linkedList.add("2");

        linkedList.print();
        System.out.println("链表：" + (linkedList.palindromic() ? "是回文序列" : "不是回文序列"));
    }
}
