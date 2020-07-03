package com.pcs.pojo;

import java.io.Serializable;

public class Parameter implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 5256244066213570065L;

	private Integer paId;

	private String paName;

	private String description;

	private Double value;

	public Parameter() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Parameter(Integer paId, String paName, String description, Double value) {
		super();
		this.paId = paId;
		this.paName = paName;
		this.description = description;
		this.value = value;
	}

	public Integer getPaId() {
		return paId;
	}

	public void setPaId(Integer paId) {
		this.paId = paId;
	}

	public String getPaName() {
		return paName;
	}

	public void setPaName(String paName) {
		this.paName = paName == null ? null : paName.trim();
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description == null ? null : description.trim();
	}

	public Double getValue() {
		return value;
	}

	public void setValue(Double value) {
		this.value = value;
	}
}