package com.test.algorithm.linkedlist;

import com.test.algorithm.linkedlist.model.Node;

/**
 * User: wangjinshuai 检查 链表内是否有换
 * Time: 2019-05-26 1:55 PM
 * Email: wangjinshuai@jd.com
 */
public class RingCheckLinkedList extends BaseLinkedList {

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
            slow = slow.getNext();
            fast = fast.getNext().getNext();
            if (null == slow) {
                break;
            }
        }
        return false;
    }

}
