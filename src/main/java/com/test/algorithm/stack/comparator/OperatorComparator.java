package com.test.algorithm.stack.comparator;

import com.test.algorithm.stack.enums.OperatorEnum;

import java.util.Comparator;

/**
 * Description:
 * Author: wangjinshuai
 * Date: 2019-05-27 18:37
 * Email: wangjinshuai@jd.com
 */
public class OperatorComparator implements Comparator<OperatorEnum> {

    public int compare(OperatorEnum first, OperatorEnum second) {
        if (first.getPriority() > second.getPriority()) {
            return 1;
        } else if (first.getPriority() == second.getPriority()) {
            return 0;
        } else {
            return -1;
        }
    }
}
