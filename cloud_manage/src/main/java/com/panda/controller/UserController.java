package com.panda.controller;

import com.panda.pojo.entity.SysUser;
import com.panda.service.UserService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * Description 首页
 *
 * @Author daijinming
 * @Date 2019/2/21 15:19
 **/
@RestController
@RequestMapping("/user")
@Api(tags = "用户")

public class UserController {
    @Autowired
    private UserService userService;
    @GetMapping("/")
    @ApiOperation(value = "用户列表")
    public List<SysUser> userList(){
        return userService.list();
    }

    @PostMapping("/")
    @ApiOperation(value = "添加用户")
    public String addUser(@RequestBody SysUser sysUser){
        return userService.addUser(sysUser);
    }

    @DeleteMapping("/{id}")
    @ApiOperation(value = "删除用户")
    @ApiImplicitParam(name = "id", value = "用户ID", required = true, dataType = "int")
    public String delUser(@PathVariable("id") Integer id){
        return userService.delUser(id);
    }
    @PutMapping("/")
    @ApiOperation(value = "修改用户")
    public String  updateUser(@RequestBody SysUser sysUser){
        return userService.updateUser(sysUser);
    }
}
