package com.dms.admin.controller;

import com.dms.common.utils.StringUtils;

public class BaseController {
    /**
     * 页面跳转
     */
    public String redirect(String url)
    {
        return StringUtils.format("redirect:{}", url);
    }
}
