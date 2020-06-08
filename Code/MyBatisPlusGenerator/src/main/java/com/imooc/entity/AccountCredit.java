package com.imooc.entity;

import com.baomidou.mybatisplus.enums.IdType;
import java.math.BigDecimal;
import java.util.Date;
import com.baomidou.mybatisplus.annotations.TableId;
import com.baomidou.mybatisplus.annotations.TableId;
import com.baomidou.mybatisplus.enums.IdType;
import com.baomidou.mybatisplus.activerecord.Model;
import java.io.Serializable;

/**
 * <p>
 * 授信账户
 * </p>
 *
 * @author Bean
 * @since 2020-04-20
 */
public class AccountCredit extends Model<AccountCredit> {

    private static final long serialVersionUID = 1L;

    @TableId(value = "id", type = IdType.AUTO)
    private Integer id;
    /**
     * 账户编号(作为账户唯一标识,相当于银行卡号)
     */
    private String accountNo;
    /**
     * 余额
     */
    private BigDecimal balance;
    /**
     * 授信余额
     */
    private BigDecimal creditBalance;
    /**
     * 授信额度上限（即充值授信余额不能大于该值,为空时认为无上限）
     */
    private BigDecimal creditMax;
    /**
     * 授信额度下限（即授信余额小于该值时不能进行扣款操作了，为空时默认为0）
     */
    private BigDecimal creditMin;
    /**
     * 账户状态（0-无效，1-有效）
     */
    private Integer status;
    private String createUser;
    private Date createTime;
    private String updateUser;
    private Date updateTime;
    /**
     * 账户作用类型（99-全部,1-国际机票，2-国内机票，3-火车票）
     */
    private Integer type;
    /**
     * 账户角色（1：渠道账户；2：供应账户）
     */
    private Integer roleType;


    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getAccountNo() {
        return accountNo;
    }

    public void setAccountNo(String accountNo) {
        this.accountNo = accountNo;
    }

    public BigDecimal getBalance() {
        return balance;
    }

    public void setBalance(BigDecimal balance) {
        this.balance = balance;
    }

    public BigDecimal getCreditBalance() {
        return creditBalance;
    }

    public void setCreditBalance(BigDecimal creditBalance) {
        this.creditBalance = creditBalance;
    }

    public BigDecimal getCreditMax() {
        return creditMax;
    }

    public void setCreditMax(BigDecimal creditMax) {
        this.creditMax = creditMax;
    }

    public BigDecimal getCreditMin() {
        return creditMin;
    }

    public void setCreditMin(BigDecimal creditMin) {
        this.creditMin = creditMin;
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public String getCreateUser() {
        return createUser;
    }

    public void setCreateUser(String createUser) {
        this.createUser = createUser;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public String getUpdateUser() {
        return updateUser;
    }

    public void setUpdateUser(String updateUser) {
        this.updateUser = updateUser;
    }

    public Date getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }

    public Integer getType() {
        return type;
    }

    public void setType(Integer type) {
        this.type = type;
    }

    public Integer getRoleType() {
        return roleType;
    }

    public void setRoleType(Integer roleType) {
        this.roleType = roleType;
    }

    @Override
    protected Serializable pkVal() {
        return this.id;
    }

    @Override
    public String toString() {
        return "AccountCredit{" +
        ", id=" + id +
        ", accountNo=" + accountNo +
        ", balance=" + balance +
        ", creditBalance=" + creditBalance +
        ", creditMax=" + creditMax +
        ", creditMin=" + creditMin +
        ", status=" + status +
        ", createUser=" + createUser +
        ", createTime=" + createTime +
        ", updateUser=" + updateUser +
        ", updateTime=" + updateTime +
        ", type=" + type +
        ", roleType=" + roleType +
        "}";
    }
}
