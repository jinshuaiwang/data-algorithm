package com.test.algorithm.stack;

import com.test.algorithm.linkedlist.model.Node;
import com.test.algorithm.stack.enums.BracketEnum;
import com.test.algorithm.stack.model.LinkedListStack;

/**
 * Description: 括号（小括号，中括号，大括号）组合 合法校验
 * Author: wangjinshuai
 * Date: 2019-05-27 17:57
 * Email: wangjinshuai@jd.com
 */
public class CheckBracket {

    /**
     * 栈
     */
    private LinkedListStack stack = new LinkedListStack();

    /**
     * 计算
     * @param bracketArray
     * @return
     */
    public boolean check(String[] bracketArray) {
        if (null == bracketArray || bracketArray.length % 2 != 0) {
            return false;
        }

        for (String temp : bracketArray) {
            BracketEnum bracketEnum = BracketEnum.getBracketEnumByName(temp);
            if (bracketEnum.isPush()) {
                stack.push(new Node(temp));
            } else {
                if (!bracketEnum.getCouple().equals(stack.pop().getItem().toString())) {
                    return false;
                }
            }
        }

        return stack.empty();
    }

}
