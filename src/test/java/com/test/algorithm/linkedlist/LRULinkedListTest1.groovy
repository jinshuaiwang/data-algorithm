package com.test.algorithm.linkedlist

import junit.framework.Test
import spock.lang.Specification

/**
 *
 * User: wangjinshuai
 * Time: 2019-05-22 11:23 PM 
 * Email: wangjinshuai@jd.com
 */
class LRULinkedListTest1 extends Specification {

    private LRULinkedList linkedList;

    def setup(){
        linkedList = new LRULinkedList(20);
        linkedList.add("1");
        linkedList.add("3");
        linkedList.add("5");
        linkedList.add("7");
        linkedList.add("9");
        linkedList.add("11");
        linkedList.add("14");
        linkedList.add("19");
        linkedList.add("25");
        linkedList.add("30");
        linkedList.add("39");
        linkedList.add("41");

        linkedList.add("19");
        linkedList.add("1");
        linkedList.add("30");
        linkedList.add("3");
    }

    def abc () {
        assert linkedList.size() == 10
    }
}
