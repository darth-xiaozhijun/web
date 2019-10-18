package com.beifeng.controller;

import javax.annotation.Resource;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.beifeng.entity.vo.ApiReqVO;
import com.beifeng.service.IAdvertCtrProbService;

@RestController
@RequestMapping("/v1/api")
public class ApiController {
	
	@Resource
	private IAdvertCtrProbService addvertCtrProbService;

    @RequestMapping(value = "/getInfo.do", method = RequestMethod.POST)
	public String getInfo(ApiReqVO apiReqVO){
		
    	return addvertCtrProbService.getInfo(apiReqVO);
	}
}
