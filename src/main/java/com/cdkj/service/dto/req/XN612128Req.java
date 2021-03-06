package com.cdkj.service.dto.req;

/**
 * 新增产业园服务
 * @author: asus 
 * @since: 2017年6月6日 下午1:56:40 
 * @history:
 */
public class XN612128Req {

    // 服务名称 (必填)
    private String name;

    // 缩略图
    private String pic;

    // 广告图
    private String advPic;

    // 公司编号(必填)
    private String companyCode;

    // 最小报价(必填)
    private String quoteMin;

    // 最大报价(必填)
    private String quoteMax;

    // 资质编号(必填)
    private String qualityCode;

    // 办公总面积
    private String bgArea;

    // 可用总面积
    private String availBgArea;

    // 仓储总面积
    private String ccArea;

    // 可用总面积
    private String availCcArea;

    // 增值服务
    private String zzfw;

    // 产业园详细介绍
    private String introduce;

    // 优惠政策
    private String yhPolicy;

    // 产业园照片1
    private String pic1;

    // 产业园照片2
    private String pic2;

    // 详细描述(选填)
    private String description;

    // 发布人(必填)
    private String publisher;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCompanyCode() {
        return companyCode;
    }

    public void setCompanyCode(String companyCode) {
        this.companyCode = companyCode;
    }

    public String getQualityCode() {
        return qualityCode;
    }

    public void setQualityCode(String qualityCode) {
        this.qualityCode = qualityCode;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getPublisher() {
        return publisher;
    }

    public void setPublisher(String publisher) {
        this.publisher = publisher;
    }

    public String getQuoteMin() {
        return quoteMin;
    }

    public void setQuoteMin(String quoteMin) {
        this.quoteMin = quoteMin;
    }

    public String getQuoteMax() {
        return quoteMax;
    }

    public void setQuoteMax(String quoteMax) {
        this.quoteMax = quoteMax;
    }

    public String getBgArea() {
        return bgArea;
    }

    public void setBgArea(String bgArea) {
        this.bgArea = bgArea;
    }

    public String getAvailBgArea() {
        return availBgArea;
    }

    public void setAvailBgArea(String availBgArea) {
        this.availBgArea = availBgArea;
    }

    public String getCcArea() {
        return ccArea;
    }

    public void setCcArea(String ccArea) {
        this.ccArea = ccArea;
    }

    public String getAvailCcArea() {
        return availCcArea;
    }

    public void setAvailCcArea(String availCcArea) {
        this.availCcArea = availCcArea;
    }

    public String getZzfw() {
        return zzfw;
    }

    public void setZzfw(String zzfw) {
        this.zzfw = zzfw;
    }

    public String getIntroduce() {
        return introduce;
    }

    public void setIntroduce(String introduce) {
        this.introduce = introduce;
    }

    public String getYhPolicy() {
        return yhPolicy;
    }

    public void setYhPolicy(String yhPolicy) {
        this.yhPolicy = yhPolicy;
    }

    public String getPic1() {
        return pic1;
    }

    public void setPic1(String pic1) {
        this.pic1 = pic1;
    }

    public String getPic2() {
        return pic2;
    }

    public void setPic2(String pic2) {
        this.pic2 = pic2;
    }

    public String getPic() {
        return pic;
    }

    public void setPic(String pic) {
        this.pic = pic;
    }

    public String getAdvPic() {
        return advPic;
    }

    public void setAdvPic(String advPic) {
        this.advPic = advPic;
    }
}
