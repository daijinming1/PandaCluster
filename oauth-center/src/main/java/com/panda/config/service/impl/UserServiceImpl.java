package com.panda.config.service.impl;

import com.panda.config.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Primary;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

import java.util.Collection;
import java.util.HashSet;

/**
 * Description 首页
 *
 * @Author daijinming
 * @Date 2019/2/28 17:09
 **/

@Primary
@Service
public class UserServiceImpl implements UserService{

    /**
     * 依赖注入密码加密解密工具（PS: 需要在springsecurity的配置文件中配置这个Bean）
     */
    @Autowired
    private PasswordEncoder passwordEncoder;
    /**
     * 根据用户名获取登录用户信息
     * @param username
     * @return
     * @throws UsernameNotFoundException
     */
    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        //判断用户信息
        if(username == null){
            throw new UsernameNotFoundException("用户名："+ username + "不存在！");
        }
        //设置角色
        Collection<SimpleGrantedAuthority> collection = new HashSet<SimpleGrantedAuthority>();

        collection.add(new SimpleGrantedAuthority("admin"));
        // 模拟数据库中的数据
        String pwd = passwordEncoder.encode("111");

        return new org.springframework.security.core.userdetails.User(username,pwd,collection);
    }
}
