package com.test.algorithm.linkedlist

import spock.lang.Specification

class LRULinkedListTest extends Specification {

    void setup() {
    }

    void cleanup() {
    }

    def "Add"() {
        def lRULinkedList = new LRULinkedList()
        lRULinkedList.add("1")

        expect:
        lRULinkedList.size == 1
    }
}
