package com.jtravel.api.file.domain.upload.entity.valueobject;

import lombok.Getter;

/**
 * @author ThinkPad
 */

@Getter
public enum ChangeType {

    /**
     * 状态 变动类型
     * 10-充值
     * 20-扣款
     * 30-返还
     * 40-人工调授信额度
     */
    CHANGE_TYPE_RECHARGE(10, "充值"),
    CHANGE_TYPE_DEDUCTION(20, "扣款"),
    CHANGE_TYPE_RETURN(30, "返还"),
    CHANGE_TYPE_ARTIFICIAL(40, "人工调授信额度");

    final Integer key;
    final String val;

    ChangeType(Integer key, String val) {
        this.key = key;
        this.val = val;
    }

    /**
     * 获取val
     *
     * @param key
     * @return
     */
    public static String getValByKey(Integer key) {
        if (key == null) {
            return null;
        }
        for (ChangeType auth : ChangeType.values()) {
            if (auth.getKey().equals(key)) {
                return auth.getVal();
            }
        }
        return null;
    }


}
