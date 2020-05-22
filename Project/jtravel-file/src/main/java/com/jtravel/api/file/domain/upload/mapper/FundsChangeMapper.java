package com.jtravel.api.file.domain.upload.mapper;

import com.jtravel.api.file.domain.upload.entity.FundsChange;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;


@Mapper
@Repository
public interface FundsChangeMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(FundsChange record);

    int insertSelective(FundsChange record);

    FundsChange selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(FundsChange record);

    int updateByPrimaryKey(FundsChange record);
}