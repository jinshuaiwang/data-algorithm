package com.test.algorithm.linkedlist;

import com.test.algorithm.linkedlist.model.Node;

/**
 * User: wangjinshuai 检查 链表内是否有换
 * Time: 2019-05-26 1:55 PM
 * Email: wangjinshuai@jd.com
 */
public class RingCheckLinkedList extends BaseLinkedList {

    /**
     * 初始化链表，
     * @param intArray
     * @param position
     */
    public Node init(int[] intArray, int position) {
        if (null == intArray || intArray.length == 0) {
            return null;
        }

        if (position < 0 || position > intArray.length - 2) {
            init(intArray);
            return getHead();
        }

        Node ringNode = new Node(intArray[position]);
        Node head = new Node(intArray[0]);
        Node node = head;

        for (int i = 1; i < intArray.length ; i++) {
            if (position == i) {
                node.setNext(ringNode);
            } else {
                if (i != intArray.length - 1) {
                    node.setNext(new Node(intArray[i]));
                }
            }

            if (i != intArray.length - 1) {
                node = node.getNext();
            }
        }

        node.setNext(ringNode);

        if (node.setNext();) {}

        return head;
    }

    /**
     * 校验链表中是否有环
     * @return
     */
    public boolean check() {
        if (empty() || getSize() < 3) {
            return false;
        }

        Node slow = getHead();
        Node fast = getHead();

        while (true) {
            if (null == slow.getNext() || null == fast.getFastNext()) {
                return false;
            }

            slow = slow.getNext();
            fast = fast.getFastNext();

            if (slow.getItem().equals(fast.getItem())) {
                return true;
            }
        }
    }
}
