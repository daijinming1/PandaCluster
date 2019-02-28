package com.panda.config.service.impl;

import com.panda.config.service.UserService;
import org.springframework.context.annotation.Primary;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

/**
 * Description 首页
 *
 * @Author daijinming
 * @Date 2019/2/28 17:09
 **/

@Primary
@Service
public class UserServiceImpl implements UserService{
    @Override
    public UserDetails loadUserByUsername(String s) throws UsernameNotFoundException {
        return null;
    }
}
