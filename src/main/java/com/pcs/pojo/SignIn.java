package com.pcs.pojo;

import java.io.Serializable;
import java.util.Date;

public class SignIn implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = -2603379872267330811L;

	private Integer siId;

	private String cNumber;

	private String cName;

	private String peNumber;

	private String peName;

	private Integer state;

	private Date date;

	private String position;

	public SignIn() {
		super();
		// TODO Auto-generated constructor stub
	}

	public SignIn(Integer siId, String cNumber, String cName, String peNumber, String peName, Integer state, Date date,
			String position) {
		super();
		this.siId = siId;
		this.cNumber = cNumber;
		this.cName = cName;
		this.peNumber = peNumber;
		this.peName = peName;
		this.state = state;
		this.date = date;
		this.position = position;
	}

	public SignIn(String cNumber, String cName, String peNumber, String peName, Integer state, Date date,
			String position) {
		super();
		this.cNumber = cNumber;
		this.cName = cName;
		this.peNumber = peNumber;
		this.peName = peName;
		this.state = state;
		this.date = date;
		this.position = position;
	}

	public Integer getSiId() {
		return siId;
	}

	public void setSiId(Integer siId) {
		this.siId = siId;
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

	public String getPeNumber() {
		return peNumber;
	}

	public void setPeNumber(String peNumber) {
		this.peNumber = peNumber == null ? null : peNumber.trim();
	}

	public String getPeName() {
		return peName;
	}

	public void setPeName(String peName) {
		this.peName = peName == null ? null : peName.trim();
	}

	public Integer getState() {
		return state;
	}

	public void setState(Integer state) {
		this.state = state;
	}

	public Date getDate() {
		return date;
	}

	public void setDate(Date date) {
		this.date = date;
	}

	public String getPosition() {
		return position;
	}

	public void setPosition(String position) {
		this.position = position == null ? null : position.trim();
	}
}