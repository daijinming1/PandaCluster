package com.panda.service.impl;

import com.cloud.mapper.UserMapper;
import com.cloud.pojo.entity.User;
import com.cloud.service.UserService;
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
public class UserServiceImpl implements UserService{
    @Autowired
    private UserMapper userMapper;
    @Override
    public List<User> list() {
        return userMapper.selectAll();
    }

    @Override
    public String addUser(User user) {
        user.setId(0);
        userMapper.insert(user);
        return "添加成功";
    }

    @Override
    public String delUser(Integer id) {
        userMapper.deleteByPrimaryKey(id);
        return "删除用户";
    }

    @Override
    public String updateUser(User user) {
        userMapper.updateByPrimaryKeySelective(user);
        return "修改成功";
    }
}
