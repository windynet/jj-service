package com.cdkj.service.dto.req;

public class XN612185Req extends APageReq {

    private static final long serialVersionUID = 1L;

    // 手机号 (选填)
    private String mobile;

    // 期望职位 (选填)
    private String expPosition;

    // 期望省份 (选填)
    private String expProvince;

    // 期望城市 (选填)
    private String expCity;

    // 发布人编号(选填)
    private String publisher;

    // 是否公共(选填)
    private String isOpen;

    // 状态(选填)
    private String status;

    public String getMobile() {
        return mobile;
    }

    public void setMobile(String mobile) {
        this.mobile = mobile;
    }

    public String getExpPosition() {
        return expPosition;
    }

    public void setExpPosition(String expPosition) {
        this.expPosition = expPosition;
    }

    public String getExpProvince() {
        return expProvince;
    }

    public void setExpProvince(String expProvince) {
        this.expProvince = expProvince;
    }

    public String getExpCity() {
        return expCity;
    }

    public void setExpCity(String expCity) {
        this.expCity = expCity;
    }

    public String getPublisher() {
        return publisher;
    }

    public void setPublisher(String publisher) {
        this.publisher = publisher;
    }

    public String getIsOpen() {
        return isOpen;
    }

    public void setIsOpen(String isOpen) {
        this.isOpen = isOpen;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }
}
