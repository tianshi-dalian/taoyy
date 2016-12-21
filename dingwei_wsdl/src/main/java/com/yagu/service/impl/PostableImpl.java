package com.yagu.service.impl;

import com.yagu.dao.PostableMapper;
import com.yagu.model.Postable;
import com.yagu.service.PostableService;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;
import java.util.Date;

/**
 * 上传位置
 * PostableImpl
 *
 * @author tianshi
 * @time 2016/12/20 18:45
 */
@Service
@Transactional(rollbackFor = Exception.class)
public class PostableImpl implements PostableService {
    @Resource
    private PostableMapper postableMapper;

    public Postable insertPosition(Postable bean) {
        bean.setCreattime(new Date());
        postableMapper.insert(bean);
        Postable postable = new Postable();
        postable.setStateCode("0");
        postable.setStateMsg("请求成功");
        return postable;
    }
}
