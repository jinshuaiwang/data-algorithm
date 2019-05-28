package com.test.algorithm.stack.utils;

import com.test.algorithm.stack.enums.OperatorEnum;

/**
 * User: wangjinshuai
 * Time: 2019-05-28 10:17 PM
 * Email: wangjinshuai@jd.com
 */
public class MathUtils {

    /**
     * 简单四则运算
     * @param second
     * @param first
     * @param operator
     * @return
     */
    public static int calc(int second, int first ,String operator) {
        if (operator.equals(OperatorEnum.ADD.getName())) {
            return first + second;
        }

        if (operator.equals(OperatorEnum.SUBTRACT.getName())) {
            return first - second;
        }

        if (operator.equals(OperatorEnum.MULTIPLY.getName())) {
            return first * second;
        }

        if (operator.equals(OperatorEnum.DIVIDE.getName())) {
            return first / second;
        }

        return 0;
    }
}
