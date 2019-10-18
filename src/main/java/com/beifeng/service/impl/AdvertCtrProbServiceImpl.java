package com.beifeng.service.impl;

import java.util.Date;
import java.util.UUID;

import javax.annotation.Resource;

import org.springframework.beans.propertyeditors.UUIDEditor;
import org.springframework.stereotype.Service;

import com.alibaba.fastjson.JSON;
import com.beifeng.entity.dto.AdvertCtrProb;
import com.beifeng.entity.vo.ApiReqVO;
import com.beifeng.entity.vo.ApiResVO;
import com.beifeng.mapper.IAdvertCtrProbMapper;
import com.beifeng.service.IAdvertCtrProbService;
import com.fasterxml.jackson.annotation.ObjectIdGenerators.UUIDGenerator;

@Service
public class AdvertCtrProbServiceImpl implements IAdvertCtrProbService{
	
	@Resource
	private IAdvertCtrProbMapper advertCtrProbMapper;

	@Override
	public String getInfo(ApiReqVO apiReqVO) {
		
		String result = null;
		
		if (apiReqVO != null) {
			
			AdvertCtrProb advertCtrProb = new AdvertCtrProb();
			advertCtrProb.setId(UUID.randomUUID().toString());
			advertCtrProb.setOpenId(apiReqVO.getOpenId());
			advertCtrProb.setData(JSON.toJSONString(apiReqVO));
			advertCtrProb.setFlag(1);//1-传入数据标记，0-返回数据标记
			advertCtrProb.setAtCreated(new Date());
			
			advertCtrProbMapper.insertSelective(advertCtrProb);
			
			ApiResVO apiResVO = new ApiResVO();
			apiResVO.setOpenId(apiReqVO.getOpenId());
			//TODO
			result = JSON.toJSONString(apiResVO);
			AdvertCtrProb advertCtrProbRes = new AdvertCtrProb();
			advertCtrProbRes.setId(UUID.randomUUID().toString());
			advertCtrProbRes.setOpenId(apiReqVO.getOpenId());
			advertCtrProbRes.setData(result);
			advertCtrProbRes.setFlag(0);//1-传入数据标记，0-返回数据标记
			advertCtrProbRes.setAtCreated(new Date());
			
			advertCtrProbMapper.insertSelective(advertCtrProbRes);
		}
		return result;
	}

}
