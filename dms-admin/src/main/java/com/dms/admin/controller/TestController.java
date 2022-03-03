package com.dms.admin.controller;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/test")
public class TestController {

    /**
     * 测试接口
     */
    @GetMapping("/getInfo")
    public String getInfo()
    {
        return "成功";
    }
}
