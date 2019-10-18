package com.beifeng.mapper;

import org.springframework.stereotype.Repository;

import com.beifeng.entity.dto.AdvertCtrProb;

@Repository
public interface IAdvertCtrProbMapper {

    int insertSelective(AdvertCtrProb record);
}
