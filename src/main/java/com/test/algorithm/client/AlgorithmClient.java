package com.test.algorithm.client;

import com.test.algorithm.linkedlist.LRULinkedList;

/**
 * Description:
 * Author: wangjinshuai
 * Date: 2019-05-22 15:28
 * Email: wangjinshuai@jd.com
 */
public class AlgorithmClient {

    public static void main(String[] args) {
        LRULinkedList list = new LRULinkedList();

        list.add("1");
        list.add("3");
        list.add("5");
        list.add("7");
        list.add("9");
        list.add("11");
        list.add("14");
        list.add("19");
        list.add("25");
        list.add("30");
        list.add("39");
        list.add("41");

        list.add("19");
        list.add("1");
        list.add("30");
        list.add("3");

        System.out.println(list.size());
        list.print();
    }
}
