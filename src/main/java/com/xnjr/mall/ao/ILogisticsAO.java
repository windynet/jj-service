/**
 * @Title ILogisticsAO.java 
 * @Package com.xnjr.mall.ao 
 * @Description 
 * @author haiqingzheng  
 * @date 2016年5月29日 下午1:11:07 
 * @version V1.0   
 */
package com.xnjr.mall.ao;

import com.xnjr.mall.bo.base.Paginable;
import com.xnjr.mall.domain.Logistics;

/** 
 * @author: haiqingzheng 
 * @since: 2016年5月29日 下午1:11:07 
 * @history:
 */
public interface ILogisticsAO {

    static final String DEFAULT_ORDER_COLUMN = "code";

    /**
     * 物流信息录入
     * @param logistics
     * @return 
     * @create: 2016年7月26日 下午4:49:03 myb858
     * @history:
     */
    public String addLogistics(Logistics logistics);

    /**
     * 确认物流单
     * @param code
     * @param updater
     * @param remark
     * @return 
     * @create: 2016年6月12日 上午8:42:43 xieyj
     * @history:
     */
    public boolean confirmLogistics(String code, String updater, String remark);

    /**
     * 获取物流单信息（将对应的货物信息查询出来）
     * @param code
     * @return 
     * @create: 2016年5月29日 下午1:19:59 haiqingzheng
     * @history:
     */
    public Logistics getLogistics(String code);

    /**
     * 物流单分页查询
     * @param start
     * @param limit
     * @param condition
     * @return 
     * @create: 2016年5月29日 下午1:22:24 haiqingzheng
     * @history:
     */
    public Paginable<Logistics> queryLogisticsPage(int start, int limit,
            Logistics condition);
}
