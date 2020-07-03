package com.pcs.pojo;

import java.io.Serializable;

public class Dictionary implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = -7935336443731665500L;

	private Integer dId;

	private String chineseName;

	private String englishName;

	public Dictionary() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Dictionary(Integer dId, String chineseName, String englishName) {
		super();
		this.dId = dId;
		this.chineseName = chineseName;
		this.englishName = englishName;
	}

	public Integer getdId() {
		return dId;
	}

	public void setdId(Integer dId) {
		this.dId = dId;
	}

	public String getChineseName() {
		return chineseName;
	}

	public void setChineseName(String chineseName) {
		this.chineseName = chineseName == null ? null : chineseName.trim();
	}

	public String getEnglishName() {
		return englishName;
	}

	public void setEnglishName(String englishName) {
		this.englishName = englishName == null ? null : englishName.trim();
	}
}