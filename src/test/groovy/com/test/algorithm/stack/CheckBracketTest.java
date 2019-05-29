package com.test.algorithm.stack;

/**
 * User: wangjinshuai
 * Time: 2019-05-28 11:05 PM
 * Email: wangjinshuai@jd.com
 */
public class CheckBracketTest {

    public static void main(String[] args) {
        CheckBracket bracket = new CheckBracket();

//        int result = stack.calc(new String[]{"34", "+", "20", "*", "5", "-", "18", "/", "6"});
        String[] bracketArr = null;
        boolean result = bracket.check(bracketArr);
        System.out.println(result);

        bracketArr = new String[]{"(", "[", "]", "{", "}", ")"};
        result = bracket.check(bracketArr);
        System.out.println(result);

        bracketArr = new String[]{"(", "[", "]", "{", "}", ")", "]"};
        result = bracket.check(bracketArr);
        System.out.println(result);
    }
}
