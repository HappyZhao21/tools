package com.jtravel.api.file.domain.upload.mapper;

import com.jtravel.api.file.domain.upload.entity.AuditRecharge;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

@Mapper
@Repository
public interface AuditRechargeDao {
    int deleteByPrimaryKey(Integer id);

    int insert(AuditRecharge record);

    int insertSelective(AuditRecharge record);

    AuditRecharge selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(AuditRecharge record);

    int updateByPrimaryKey(AuditRecharge record);
}