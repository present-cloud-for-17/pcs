package com.pcs.pojo;

import java.io.Serializable;

public class UserVerification implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 7314120556992586208L;

	private Integer uvId;

	private Integer uId;

	private Integer loginType;

	private Boolean isThird;

	private String loginToken;

	private String passwordToken;

	public UserVerification() {
		super();
		// TODO Auto-generated constructor stub
	}

	public UserVerification(Integer uvId, Integer uId, Integer loginType, Boolean isThird, String loginToken,
			String passwordToken, Integer status) {
		super();
		this.uvId = uvId;
		this.uId = uId;
		this.loginType = loginType;
		this.isThird = isThird;
		this.loginToken = loginToken;
		this.passwordToken = passwordToken;
		this.status = status;
	}

	private Integer status;

	public Integer getUvId() {
		return uvId;
	}

	public void setUvId(Integer uvId) {
		this.uvId = uvId;
	}

	public Integer getuId() {
		return uId;
	}

	public void setuId(Integer uId) {
		this.uId = uId;
	}

	public Integer getLoginType() {
		return loginType;
	}

	public void setLoginType(Integer loginType) {
		this.loginType = loginType;
	}

	public Boolean getIsThird() {
		return isThird;
	}

	public void setIsThird(Boolean isThird) {
		this.isThird = isThird;
	}

	public String getLoginToken() {
		return loginToken;
	}

	public void setLoginToken(String loginToken) {
		this.loginToken = loginToken == null ? null : loginToken.trim();
	}

	public String getPasswordToken() {
		return passwordToken;
	}

	public void setPasswordToken(String passwordToken) {
		this.passwordToken = passwordToken == null ? null : passwordToken.trim();
	}

	public Integer getStatus() {
		return status;
	}

	public void setStatus(Integer status) {
		this.status = status;
	}
}