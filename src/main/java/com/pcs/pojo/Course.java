package com.pcs.pojo;

import java.io.Serializable;

public class Course implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = -8536008636067859845L;

	private Integer cId;

	private String cNumber;

	private String cName;

	private String description;

	private String term;

	private Integer date;

	private Double credit;

	private Double dailyWeight;

	private Double finalWeight;
	
	private Integer peId;
	
	private String peName;

	public Integer getcId() {
		return cId;
	}

	public Course(Integer cId, String cNumber, String cName, String description, String term, Integer date,
			Double credit, Double dailyWeight, Double finalWeight) {
		super();
		this.cId = cId;
		this.cNumber = cNumber;
		this.cName = cName;
		this.description = description;
		this.term = term;
		this.date = date;
		this.credit = credit;
		this.dailyWeight = dailyWeight;
		this.finalWeight = finalWeight;
	}

	public Course(String cNumber, String cName, String description, String term, Integer date, Double credit,
			Double dailyWeight, Double finalWeight) {
		super();
		this.cNumber = cNumber;
		this.cName = cName;
		this.description = description;
		this.term = term;
		this.date = date;
		this.credit = credit;
		this.dailyWeight = dailyWeight;
		this.finalWeight = finalWeight;
	}

	public Course() {
		super();
		// TODO Auto-generated constructor stub
	}

	public void setcId(Integer cId) {
		this.cId = cId;
	}

	public String getcNumber() {
		return cNumber;
	}

	public void setcNumber(String cNumber) {
		this.cNumber = cNumber == null ? null : cNumber.trim();
	}

	public String getcName() {
		return cName;
	}

	public void setcName(String cName) {
		this.cName = cName == null ? null : cName.trim();
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description == null ? null : description.trim();
	}

	public String getTerm() {
		return term;
	}

	public void setTerm(String term) {
		this.term = term == null ? null : term.trim();
	}

	public Integer getDate() {
		return date;
	}

	public void setDate(Integer date) {
		this.date = date;
	}

	public Double getCredit() {
		return credit;
	}

	public void setCredit(Double credit) {
		this.credit = credit;
	}

	public Double getDailyWeight() {
		return dailyWeight;
	}

	public void setDailyWeight(Double dailyWeight) {
		this.dailyWeight = dailyWeight;
	}

	public Double getFinalWeight() {
		return finalWeight;
	}

	public void setFinalWeight(Double finalWeight) {
		this.finalWeight = finalWeight;
	}

	public Integer getPeId() {
		return peId;
	}

	public void setPeId(Integer peId) {
		this.peId = peId;
	}

	public String getPeName() {
		return peName;
	}

	public void setPeName(String peName) {
		this.peName = peName;
	}
	
}