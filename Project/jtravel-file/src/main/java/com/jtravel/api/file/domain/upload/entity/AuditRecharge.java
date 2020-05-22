package com.jtravel.api.file.domain.upload.entity;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

import lombok.Builder;
import lombok.Data;

/**
 * audit_recharge
 * @author 
 */
@Data
@Builder
public class AuditRecharge implements Serializable {
    private Integer id;

    private Integer accountId;

    private Integer companyId;

    /**
     * 充值金额
     */
    private BigDecimal rechargeAmount;

    /**
     * 10: 余额充值
11:扣除充值
20: 授信充值
21:授信扣除
     */
    private Integer rechargeType;

    /**
     * 业务ID
1-国际机票
2-国内机票
3-火车票
4-国内酒店
5-国外酒店
     */
    private Integer businessId;

    /**
     * 10-未审批
20-审批通过
90-驳回
     */
    private Integer state;

    /**
     * 审批时间
     */
    private Integer auditTime;

    /**
     * 审批人
     */
    private Integer auditUserId;

    /**
     * 审批备注
     */
    private Integer auditRemarks;

    /**
     * 审批凭证
     */
    private String auditProof;

    /**
     * 申请时间
     */
    private Date applyTime;

    /**
     * 申请人
     */
    private Integer applyUserId;

    /**
     * 申请凭证
     */
    private String applyProof;

    /**
     * 充值说明，一般是充值的截图
     */
    private String applyRemarks;

    private Date updateTime;

    /**
     * 创建时间
     */
    private Date createTime;

    private static final long serialVersionUID = 1L;
}