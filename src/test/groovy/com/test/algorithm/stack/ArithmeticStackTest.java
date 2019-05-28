package com.test.algorithm.stack;

/**
 * User: wangjinshuai
 * Time: 2019-05-28 11:05 PM
 * Email: wangjinshuai@jd.com
 */
public class ArithmeticStackTest {

    public static void main(String[] args) {
        ArithmeticStack stack = new ArithmeticStack();

//        int result = stack.calc(new String[]{"34", "+", "20", "*", "5", "-", "18", "/", "6"});
        int result = stack.calc(new String[]{"29", "+", "11", "*", "5", "+", "100", "/", "20", "*", "5", "-", "9", "+", "11"});
        System.out.println(result);
    }
}
