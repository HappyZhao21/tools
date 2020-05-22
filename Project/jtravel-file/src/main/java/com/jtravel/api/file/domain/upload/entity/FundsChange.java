package com.jtravel.api.file.domain.upload.entity;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;
import lombok.Data;

/**
 * funds_change
 * @author 
 */
@Data
public class FundsChange implements Serializable {
    private Integer id;

    private Integer accountId;

    /**
     * 交易流水号
     */
    private String paymentNo;

    /**
     * 资金变动量
加 正数
减 负数
     */
    private BigDecimal changeFunds;

    /**
     * 变动前资金
     */
    private BigDecimal preChangeFunds;

    /**
     * 变动后资金
     */
    private BigDecimal afeChangeFunds;

    /**
     * 授信余额变动量
加 正数
减 负数
     */
    private BigDecimal changeFundsCredit;

    /**
     * 变动前授信余额
     */
    private BigDecimal preChangeFundsCredit;

    /**
     * 变动后授信余额
     */
    private BigDecimal afeChangeFundsCredit;

    private Byte businessId;

    /**
     * 订单号(扣款时  会有值)
     */
    private String orderNo;

    /**
     * 变动类型
10-充值
20-扣款
30-返还
40-人工调授信额度
     */
    private Byte changeType;

    private Date createTime;

    /**
     * 创建人
     */
    private Integer created;

    private static final long serialVersionUID = 1L;
}