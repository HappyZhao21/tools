package com.jtravel.api.file.domain.upload.entity.valueobject;

import lombok.Getter;

/**
 * @author ThinkPad
 */

@Getter
public enum BusinessType {
    /**
     * 状态
     */
    BUSINESS_INTERNATIONAL_TICKET(1, "国际机票"),
    BUSINESS_DOMESTIC_TICKET(2, "国内机票"),
    BUSINESS_TRAIN(3, "火车票"),
    BUSINESS_DOMESTIC_HOTOL(4, "国内酒店"),
    BUSINESS_ABROAD_HOTOl(5, "国外酒店");

    final Integer key;
    final String val;

    BusinessType(Integer key, String val) {
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
        for (BusinessType auth : BusinessType.values()) {
            if (auth.getKey().equals(key)) {
                return auth.getVal();
            }
        }
        return null;
    }
}
