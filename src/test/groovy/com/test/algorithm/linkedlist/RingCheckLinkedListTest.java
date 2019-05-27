package com.test.algorithm.linkedlist;

/**
 * User: wangjinshuai
 * Time: 2019-05-26 5:00 PM
 * Email: wangjinshuai@jd.com
 */
public class RingCheckLinkedListTest {

    public static void main(String[] args) {
        RingCheckLinkedList linkedList = new RingCheckLinkedList();

        linkedList.init(new int[]{3, 4, 7, 10, 20, 28, 5}, 1);

//        linkedList.print();

        System.out.println("是否有环:" + linkedList.check());
    }
}
