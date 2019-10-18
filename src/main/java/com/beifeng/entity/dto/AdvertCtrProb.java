package com.beifeng.entity.dto;

import java.io.Serializable;
import java.util.Date;

public class AdvertCtrProb implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	private String id;
	
	private String openId;
	
	private String data;
	
	private Integer flag;
	
	private Date atCreated;

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getOpenId() {
		return openId;
	}

	public void setOpenId(String openId) {
		this.openId = openId;
	}

	public String getData() {
		return data;
	}

	public void setData(String data) {
		this.data = data;
	}

	public Integer getFlag() {
		return flag;
	}

	public void setFlag(Integer flag) {
		this.flag = flag;
	}

	public Date getAtCreated() {
		return atCreated;
	}

	public void setAtCreated(Date atCreated) {
		this.atCreated = atCreated;
	}

}
