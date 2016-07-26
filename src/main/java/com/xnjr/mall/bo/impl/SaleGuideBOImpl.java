/**
 * @Title SaleGuideBOImpl.java 
 * @Package com.xnjr.mall.bo.impl 
 * @Description 
 * @author haiqingzheng  
 * @date 2016年7月25日 下午4:01:34 
 * @version V1.0   
 */
package com.xnjr.mall.bo.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.xnjr.mall.bo.ISaleGuideBO;
import com.xnjr.mall.bo.base.PaginableBOImpl;
import com.xnjr.mall.dao.ISaleGuideDAO;
import com.xnjr.mall.domain.SaleGuide;
import com.xnjr.mall.enums.EUserLevel;

/** 
 * @author: haiqingzheng 
 * @since: 2016年7月25日 下午4:01:34 
 * @history:
 */
@Component
public class SaleGuideBOImpl extends PaginableBOImpl<SaleGuide> implements
        ISaleGuideBO {
    @Autowired
    private ISaleGuideDAO saleGuideDAO;

    /** 
     * @see com.xnjr.mall.bo.ISaleGuideBO#querySaleGuideList(com.xnjr.mall.domain.SaleGuide)
     */
    @Override
    public List<SaleGuide> querySaleGuideList(SaleGuide data) {
        return saleGuideDAO.selectList(data);
    }

    @Override
    public SaleGuide getSaleGuide(String modelCode, EUserLevel toLevel,
            Long quantity) {
        SaleGuide condition = new SaleGuide();
        condition.setModelCode(modelCode);
        condition.setToLevel(toLevel.getCode());
        condition.setQuantity(quantity);
        return saleGuideDAO.select(condition);
    }

}