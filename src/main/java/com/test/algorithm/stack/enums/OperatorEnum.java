package com.test.algorithm.stack.enums;

/**
 * Description:
 * Author: wangjinshuai
 * Date: 2019-05-27 18:38
 * Email: wangjinshuai@jd.com
 */
public enum OperatorEnum {

    ADD("+", "加", 0),
    SUBTRACT("-", "减", 0),
    MULTIPLY("*", "乘", 1),
    DIVIDE("/", "除", 1),
    ;

    /**
     * 名称
     */
    private String name;

    /**
     * 描述
     */
    private String desc;

    /**
     * 运算优先级 值大则优先级高
     */
    private int priority;

    OperatorEnum(String name, String desc, int priority) {
        this.name = name;
        this.desc = desc;
        this.priority = priority;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }

    public int getPriority() {
        return priority;
    }

    public void setPriority(int priority) {
        this.priority = priority;
    }

    /**
     * 获取运算符枚举
     * @param operator
     * @return
     */
    public static OperatorEnum getOperatorEnumByOperator(String operator) {
        for (OperatorEnum operatorEnum : OperatorEnum.values()) {
            if (operatorEnum.getName().equals(operator)) {
                return operatorEnum;
            }
        }

        return null;
    }
}
