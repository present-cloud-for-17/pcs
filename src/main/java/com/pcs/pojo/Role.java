package com.pcs.pojo;

import java.io.Serializable;
import java.util.Date;

public class Role implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = -7933923857588132349L;

	private Integer rId;

	private String rName;

	private String description;

	private Integer creator;

	private Date createTime;

	private Integer lastModifier;

	private Date lastModifyDate;

	public Role() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Role(Integer rId, String rName, String description, Integer creator, Date createTime, Integer lastModifier,
			Date lastModifyDate) {
		super();
		this.rId = rId;
		this.rName = rName;
		this.description = description;
		this.creator = creator;
		this.createTime = createTime;
		this.lastModifier = lastModifier;
		this.lastModifyDate = lastModifyDate;
	}

	public Integer getrId() {
		return rId;
	}

	public void setrId(Integer rId) {
		this.rId = rId;
	}

	public String getrName() {
		return rName;
	}

	public void setrName(String rName) {
		this.rName = rName == null ? null : rName.trim();
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description == null ? null : description.trim();
	}

	public Integer getCreator() {
		return creator;
	}

	public void setCreator(Integer creator) {
		this.creator = creator;
	}

	public Date getCreateTime() {
		return createTime;
	}

	public void setCreateTime(Date createTime) {
		this.createTime = createTime;
	}

	public Integer getLastModifier() {
		return lastModifier;
	}

	public void setLastModifier(Integer lastModifier) {
		this.lastModifier = lastModifier;
	}

	public Date getLastModifyDate() {
		return lastModifyDate;
	}

	public void setLastModifyDate(Date lastModifyDate) {
		this.lastModifyDate = lastModifyDate;
	}
}