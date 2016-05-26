package com.xnjr.mall.ao;

import java.util.List;

import com.xnjr.mall.bo.base.Paginable;
import com.xnjr.mall.domain.Invoice;

/** 
 * @author: xieyj 
 * @since: 2015年8月27日 上午10:39:37 
 * @history:
 */
public interface IInvoiceAO {
    static final String DEFAULT_ORDER_COLUMN = "code";

    /**
     * 选择一个型号，直接提交
     * @param userId
     * @param modelCode
     * @param quantity
     * @param salePrice
     * @param data
     * @return 
     * @create: 2016年5月25日 上午10:48:20 xieyj
     * @history:
     */
    public String commitInvoice(String modelCode, Integer quantity,
            Long salePrice, Invoice data);

    /**
     * 提交发货单
     * @param userId
     * @param data
     * @return 
     * @create: 2016年5月25日 上午10:16:02 xieyj
     * @history:
     */
    public String commitInvoice(List<String> cartCodeList, Invoice data);

    /**
     * 支付订单
     * @param code
     * @param userId
     * @param tradePwd
     * @return 
     * @create: 2016年5月25日 上午11:40:28 xieyj
     * @history:
     */
    public int payInvoice(String code, String userId, String tradePwd);

    /**
     * 取消发货单
     * @param code
     * @param applyNote
     * @return 
     * @create: 2016年5月25日 上午9:16:19 xieyj
     * @history:
     */
    public int cancelInvoice(String code, String userId, String applyNote);

    /**
     * 取消发货单
     * @param code
     * @param approveUser
     * @param approveNote
     * @return 
     * @create: 2016年5月26日 下午4:51:22 xieyj
     * @history:
     */
    public int cancelInvoiceOss(String code, String approveUser,
            String approveNote);

    /**
     * 发货反馈
     * @param code
     * @param approveUser
     * @param approveResult
     * @param approveNote
     * @return 
     * @create: 2016年5月25日 下午12:00:22 xieyj
     * @history:
     */
    public int sendInvoice(String code, String approveUser,
            String approveResult, String approveNote);

    /**
     * 发货单分页查询
     * @param condition
     * @return 
     * @create: 2015年8月27日 下午2:22:56 xieyj
     * @history:
     */
    public Paginable<Invoice> queryInvoicePage(int start, int limit,
            Invoice condition);

    /**
     * 发货单列表查询
     * @param condition
     * @return 
     * @create: 2015年8月27日 下午2:22:56 xieyj
     * @history:
     */
    public List<Invoice> queryInvoiceList(Invoice condition);

    /**
     * 发货单详情
     * @param code
     * @return 
     * @create: 2016年5月24日 上午9:07:33 xieyj
     * @history:
     */
    public Invoice getInvoice(String code);

}
