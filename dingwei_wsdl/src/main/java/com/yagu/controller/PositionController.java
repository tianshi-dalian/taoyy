package com.yagu.controller;

import com.yagu.commons.CommonController;
import com.yagu.model.Postable;
import com.yagu.service.PostableService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;

/**
 * 上传当前位置
 * PositionController
 *
 * @author tianshi
 * @time 2016/12/20 18:02
 */
@Controller
@RequestMapping(value = "/position", method = {RequestMethod.POST, RequestMethod.GET})
public class PositionController extends CommonController {
    @Resource
    private PostableService postableServices;

    /**
     * 上传位置
     *
     * @return
     */
    @RequestMapping(value = "/insertPosition")
    @ResponseBody
    public Postable companyNews(Postable bean) {
        try {
            bean = postableServices.insertPosition(bean);
        } catch (Exception e) {
            e.printStackTrace();
            bean.setStateCode("0");
            bean.setStateMsg("请求失败");
        }
        return bean;
    }

}
