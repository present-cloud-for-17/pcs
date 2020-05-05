package com.pcs.pojo;

import java.io.Serializable;

public class Dictionary implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = -5724927320385316662L;

	private Integer dId;

	private Integer chineseName;

	private Integer englishName;

	public Dictionary() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Dictionary(Integer dId, Integer chineseName, Integer englishName) {
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

	public Integer getChineseName() {
		return chineseName;
	}

	public void setChineseName(Integer chineseName) {
		this.chineseName = chineseName;
	}

	public Integer getEnglishName() {
		return englishName;
	}

	public void setEnglishName(Integer englishName) {
		this.englishName = englishName;
	}
}