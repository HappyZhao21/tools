package com.jtravel.api.file.domain.upload.mapper;

import com.jtravel.api.file.domain.upload.entity.AccountCredit;

public interface AccountCreditDao {
    int deleteByPrimaryKey(Integer id);

    int insert(AccountCredit record);

    int insertSelective(AccountCredit record);

    AccountCredit selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(AccountCredit record);

    int updateByPrimaryKey(AccountCredit record);
}