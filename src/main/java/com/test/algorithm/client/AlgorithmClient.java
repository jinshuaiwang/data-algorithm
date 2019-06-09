package com.test.algorithm.client;

import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Set;

/**
 * Description:
 * Author: wangjinshuai
 * Date: 2019-05-22 15:28
 * Email: wangjinshuai@jd.com
 */
public class AlgorithmClient {

    public static void main(String[] args) {
//        LRULinkedList list = new LRULinkedList();
//
//        list.add("1");
//        list.add("3");
//        list.add("5");
//        list.add("7");
//        list.add("9");
//        list.add("11");
//        list.add("14");
//        list.add("19");
//        list.add("25");
//        list.add("30");
//        list.add("39");
//        list.add("41");
//
//        list.add("19");
//        list.add("1");
//        list.add("30");
//        list.add("3");
//
//        System.out.println(list.size());
//        list.print();

        LinkedHashMap<Integer, String> hashMap = new LinkedHashMap();
//        HashMap<Integer, String> hashMap = new HashMap<Integer, String>();
        hashMap.put(127, "wang");
        hashMap.put(124, "li");
        hashMap.put(125, "zhao");
        hashMap.put(126, "qian");

        Set<Integer> keys = hashMap.keySet();
        for (Iterator<Integer> it = keys.iterator(); it.hasNext();) {
            System.out.println(it.next());
        }
    }
}
