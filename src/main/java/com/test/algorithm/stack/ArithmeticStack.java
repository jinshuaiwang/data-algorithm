package com.test.algorithm.stack;

import com.test.algorithm.linkedlist.model.Node;
import com.test.algorithm.stack.enums.OperatorEnum;
import com.test.algorithm.stack.model.LinkedListStack;
import com.test.algorithm.stack.utils.MathUtils;

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
    private LinkedListStack numberStack = new LinkedListStack();

    /**
     * 操作符栈
     */
    private LinkedListStack operatorStack = new LinkedListStack();

    /**
     * 计算
     * @param numberOperatorArray
     * @return
     */
    public int calc(String[] numberOperatorArray) {
        if (null == numberOperatorArray || numberOperatorArray.length < 3) {
            return -1;
        }

        boolean calcFlagAfter = false;

        for (String temp : numberOperatorArray) {

            int tempResult;
            OperatorEnum operatorEnum = OperatorEnum.getOperatorEnumByOperator(temp);

            if (null == operatorEnum) {
                if (operatorStack.empty() || operatorStack.getSize() < 2) {
                    numberStack.push(new Node(temp));
                } else if (calcFlagAfter) {
                    tempResult = MathUtils.calc(Integer.valueOf(temp), Integer.parseInt(numberStack.pop().getItem().toString()), operatorStack.pop().getItem().toString());
                    calcFlagAfter = false;
                    numberStack.push(new Node(tempResult));
                }
            } else {
                if (operatorStack.empty()) {
                    operatorStack.push(new Node(temp));
                } else {
                    Node topOperator = operatorStack.pop();

                    if (OperatorEnum.highPriority(topOperator.getItem().toString(), temp)) {
                        tempResult = MathUtils.calc(Integer.valueOf(numberStack.pop().getItem().toString()), Integer.valueOf(numberStack.pop().getItem().toString()), topOperator.getItem().toString());
                        numberStack.push(new Node(tempResult));
                    } else {
                        calcFlagAfter = true;
                        operatorStack.push(topOperator);
                    }

                    operatorStack.push(new Node(temp));
                }
            }
        }

        return MathUtils.calc(Integer.valueOf(numberStack.pop().getItem().toString()), Integer.valueOf(numberStack.pop().getItem().toString()), operatorStack.pop().getItem().toString());
    }

}
