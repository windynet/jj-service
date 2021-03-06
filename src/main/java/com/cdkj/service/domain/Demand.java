package com.cdkj.service.domain;

import java.util.Date;

import com.cdkj.service.dao.base.ABaseDO;

/**
 * 需求
 * @author: xieyj 
 * @since: 2016年10月7日 下午4:42:27 
 * @history:
 */
public class Demand extends ABaseDO {

    private static final long serialVersionUID = 1L;

    // 编号
    private String code;

    // 名称
    private String name;

    // 资质编号
    private String qualityCode;

    // 类型
    private String type;

    // 意向企业(空 所有公司，其他公司编号)
    private String expCompany;

    // 意向企业(空 所有公司，其他公司编号)
    private String expCompanyName;

    // 紧急程度(1 紧急 0 不紧急)
    private String urgentLevel;

    // 需求说明
    private String description;

    // 状态(1 正常 0 违规)
    private String status;

    // 发布用户编号
    private String publisher;

    // 发布时间
    private Date publishDatetime;

    // 处理人
    private String dealer;

    // 处理时间
    private Date dealDatetime;

    // 处理意见
    private String dealNote;

    // ****************db properties ******************
    private Date publishDatetimeStart;

    private Date publishDatetimeEnd;

    private String mobile;

    // 发布人姓名
    private String publisherName;

    // 公司联系人
    private String comContacts;

    private String qualifyName;

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getQualityCode() {
        return qualityCode;
    }

    public void setQualityCode(String qualityCode) {
        this.qualityCode = qualityCode;
    }

    public String getExpCompany() {
        return expCompany;
    }

    public void setExpCompany(String expCompany) {
        this.expCompany = expCompany;
    }

    public String getUrgentLevel() {
        return urgentLevel;
    }

    public void setUrgentLevel(String urgentLevel) {
        this.urgentLevel = urgentLevel;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getPublisher() {
        return publisher;
    }

    public void setPublisher(String publisher) {
        this.publisher = publisher;
    }

    public Date getPublishDatetime() {
        return publishDatetime;
    }

    public void setPublishDatetime(Date publishDatetime) {
        this.publishDatetime = publishDatetime;
    }

    public String getDealer() {
        return dealer;
    }

    public void setDealer(String dealer) {
        this.dealer = dealer;
    }

    public Date getDealDatetime() {
        return dealDatetime;
    }

    public void setDealDatetime(Date dealDatetime) {
        this.dealDatetime = dealDatetime;
    }

    public String getDealNote() {
        return dealNote;
    }

    public void setDealNote(String dealNote) {
        this.dealNote = dealNote;
    }

    public Date getPublishDatetimeStart() {
        return publishDatetimeStart;
    }

    public void setPublishDatetimeStart(Date publishDatetimeStart) {
        this.publishDatetimeStart = publishDatetimeStart;
    }

    public Date getPublishDatetimeEnd() {
        return publishDatetimeEnd;
    }

    public void setPublishDatetimeEnd(Date publishDatetimeEnd) {
        this.publishDatetimeEnd = publishDatetimeEnd;
    }

    public String getMobile() {
        return mobile;
    }

    public void setMobile(String mobile) {
        this.mobile = mobile;
    }

    public String getPublisherName() {
        return publisherName;
    }

    public void setPublisherName(String publisherName) {
        this.publisherName = publisherName;
    }

    public String getComContacts() {
        return comContacts;
    }

    public void setComContacts(String comContacts) {
        this.comContacts = comContacts;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getExpCompanyName() {
        return expCompanyName;
    }

    public void setExpCompanyName(String expCompanyName) {
        this.expCompanyName = expCompanyName;
    }

    public String getQualifyName() {
        return qualifyName;
    }

    public void setQualifyName(String qualifyName) {
        this.qualifyName = qualifyName;
    }
}
