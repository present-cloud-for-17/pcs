package com.pcs.pojo;

public class UserVerification {
    private Integer uvId;

    private Integer uId;

    private Integer loginType;

    private Boolean isThird;

    private String loginToken;

    private String passwordToken;

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