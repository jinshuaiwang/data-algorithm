package com.test.algorithm.stack;

import com.test.algorithm.stack.enums.OperatorEnum;
import com.test.algorithm.stack.model.LinkedListStack;

/**
 * Description: 简单四则运算
 * Author: wangjinshuai
 * Date: 2019-05-27 17:57
 * Email: wangjinshuai@jd.com
 */
public class ArithmeticStack {

    /**
     * 数字栈
     */
    private LinkedListStack numberStack;

    /**
     * 操作符栈
     */
    private LinkedListStack operatorStack;

    /**
     * 计算
     * @param numberOperatorArray
     * @return
     */
    public int calc(String[] numberOperatorArray) {
        if (null == numberOperatorArray || numberOperatorArray.length < 3) {
            return -1;
        }

        for (String temp : numberOperatorArray) {
            OperatorEnum operatorEnum = OperatorEnum.getOperatorEnumByOperator(temp);
            if (null == operatorEnum) {

            }
        }

        return -1;
    }

}
