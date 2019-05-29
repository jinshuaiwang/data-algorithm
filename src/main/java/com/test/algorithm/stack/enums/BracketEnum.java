package com.test.algorithm.stack.enums;

/**
 * Description:
 * Author: wangjinshuai
 * Date: 2019-05-29 16:31
 * Email: wangjinshuai@jd.com
 */
public enum BracketEnum {

    LEFT_SMALL_BRACKET("(", "左小括号", true, ""),
    RIGHT_SMALL_BRACKET(")", "右小括号", false, "("),
    LEFT_MIDDLE_BRACKET("[", "左中括号", true, ""),
    RIGHT_MIDDLE_BRACKET("]", "右中括号", false, "["),
    LEFT_LARGE_BRACKET("{", "左大括号", true, ""),
    RIGHT_LARGE_BRACKET("}", "右大括号", false, "{"),
    ;

    private String name;

    private String desc;

    private boolean push;

    private String couple;

    BracketEnum(String name, String desc, boolean push, String couple) {
        this.name = name;
        this.desc = desc;
        this.push = push;
        this.couple = couple;
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

    public boolean isPush() {
        return push;
    }

    public void setPush(boolean push) {
        this.push = push;
    }

    public String getCouple() {
        return couple;
    }

    public void setCouple(String couple) {
        this.couple = couple;
    }

    /**
     * 获取括号枚举
     * @param name
     * @return
     */
    public static BracketEnum getBracketEnumByName(String name) {
        for (BracketEnum bracketEnum : BracketEnum.values()) {
            if (name.equals(bracketEnum.getName())) {
                return bracketEnum;
            }
        }

        throw new RuntimeException("unknown");
    }
}
