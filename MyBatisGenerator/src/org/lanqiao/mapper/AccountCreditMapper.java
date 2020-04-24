package org.lanqiao.mapper;

import java.util.List;
import org.apache.ibatis.annotations.Param;
import org.lanqiao.entity.AccountCredit;
import org.lanqiao.entity.AccountCreditExample;

public interface AccountCreditMapper {
    long countByExample(AccountCreditExample example);

    int deleteByExample(AccountCreditExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(AccountCredit record);

    int insertSelective(AccountCredit record);

    List<AccountCredit> selectByExample(AccountCreditExample example);

    AccountCredit selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") AccountCredit record, @Param("example") AccountCreditExample example);

    int updateByExample(@Param("record") AccountCredit record, @Param("example") AccountCreditExample example);

    int updateByPrimaryKeySelective(AccountCredit record);

    int updateByPrimaryKey(AccountCredit record);
}