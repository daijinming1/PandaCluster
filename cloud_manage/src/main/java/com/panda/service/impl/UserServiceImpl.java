package com.panda.service.impl;


import com.panda.mapper.UserMapper;
import com.panda.pojo.entity.SysUser;
import com.panda.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Description 首页
 *
 * @Author daijinming
 * @Date 2019/2/21 15:23
 **/
@Service
public class UserServiceImpl implements UserService {
    @Autowired
    private UserMapper userMapper;
    @Override
    public List<SysUser> list() {
        return userMapper.selectAll();
    }

    @Override
    public String addUser(SysUser sysUser) {
        sysUser.setId(0);
        userMapper.insert(sysUser);
        return "添加成功";
    }

    @Override
    public String delUser(Integer id) {
        userMapper.deleteByPrimaryKey(id);
        return "删除用户";
    }

    @Override
    public String updateUser(SysUser sysUser) {
        userMapper.updateByPrimaryKeySelective(sysUser);
        return "修改成功";
    }
}
