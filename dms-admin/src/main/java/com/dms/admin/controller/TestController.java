package com.dms.admin.controller;


import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@Api(tags = "用户信息管理")
@RestController
@RequestMapping("/test")
public class TestController {

    /**
     * 测试接口
     */
    @ApiOperation("获取用户列表")
    @GetMapping("/getInfo")
    public String getInfo()
    {
        return "成功";
    }
}
