package com.cdkj.service.api.impl;

import com.cdkj.service.ao.IResumeAO;
import com.cdkj.service.api.AProcessor;
import com.cdkj.service.common.JsonUtil;
import com.cdkj.service.core.StringValidater;
import com.cdkj.service.domain.Resume;
import com.cdkj.service.dto.req.CD612072Req;
import com.cdkj.service.exception.BizException;
import com.cdkj.service.exception.ParaException;
import com.cdkj.service.spring.SpringContextHolder;

/** 
 * 列表查询我的简历
 * @author: zuixian 
 * @since: 2016年10月7日 下午4:06:14 
 * @history:
 */
public class CD612072 extends AProcessor {

    private IResumeAO resumeAO = SpringContextHolder.getBean(IResumeAO.class);

    private CD612072Req req = null;

    @Override
    public Object doBusiness() throws BizException {
        Resume condition = new Resume();
        condition.setPublisher(req.getPublisher());
        condition.setStatus(req.getStatus());
        return resumeAO.queryResumeList(condition);
    }

    @Override
    public void doCheck(String inputparams) throws ParaException {
        req = JsonUtil.json2Bean(inputparams, CD612072Req.class);
        StringValidater.validateBlank(req.getPublisher());
    }
}
