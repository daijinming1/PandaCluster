package com.panda.controller;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Description 首页
 *
 * @Author daijinming
 * @Date 2019/3/1 11:01
 **/
@RestController
@RequestMapping("/user")
@Api(tags ="用户")
public class UserController {

    @GetMapping("/get/all")
    @ApiOperation("列表")
    public String user(){
        System.out.println("-------------------");
        return "";
    }

}
