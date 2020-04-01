package com.longmao.service.wechat.Controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Author: wwivan
 * @Date: 2020/4/1日10:19
 * @Description:
 */
@RequestMapping("/")
@RestController
public class GetConnectController {
    @GetMapping("")
    @ResponseBody
    public String get(){
        return "hello wechat";
    }

}
