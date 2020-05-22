package com.jtravel.api.file.domain.upload.entity;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;
import lombok.Data;

/**
 * account_credit
 * @author 
 */
@Data
public class AccountCredit implements Serializable {
    private Integer id;

    private Integer companyId;

    /**
     * 账号码
     */
    private String accountNo;

    /**
     * 1：渠道账户
2：供应账户
     */
    private Byte roleType;

    /**
     * 授信余额
     */
    private BigDecimal creditBalance;

    /**
     * 授信额度
     */
    private BigDecimal creditQuota;

    /**
     * 余额
     */
    private BigDecimal balance;

    /**
     * 业务ID
1-国际机票
2-国内机票
3-火车票
4-国内酒店
5-国外酒店
     */
    private Byte businessId;

    private Date createTime;

    private Date updateTime;

    /**
     * 创建人
     */
    private Integer created;

    /**
     * 账户状态
1-无效
2-有效
     */
    private Byte state;

    private static final long serialVersionUID = 1L;
}