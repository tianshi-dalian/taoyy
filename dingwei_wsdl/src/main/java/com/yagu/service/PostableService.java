package com.yagu.service;

import com.yagu.model.Postable;

/**
 * Created by Administrator on 2016/9/26.
 */
public interface PostableService {
    /**
     * 上传位置
     */
    Postable insertPosition(Postable bean) throws Exception;
}
