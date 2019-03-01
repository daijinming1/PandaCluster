package com.panda.config;

import com.panda.oauth.PermitAllUrl;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.oauth2.common.OAuth2AccessToken;
import org.springframework.security.oauth2.config.annotation.web.configuration.ResourceServerConfigurerAdapter;
import org.springframework.security.web.util.matcher.RequestMatcher;

import javax.servlet.http.HttpServletRequest;

/**
 *这个类表明了此应用是OAuth2 的资源服务器，此处主要指定了受资源服务器保护的资源链接
 * @Author daijinming
 * @Date 2019/3/1 10:26
 **/
public class ResourceServerConfig extends ResourceServerConfigurerAdapter {
    @Override
    public void configure(HttpSecurity http) throws Exception {

     http.csrf().disable()//禁用了 csrf 功能
                .authorizeRequests()//限定签名成功的请求
                 // 放开权限的url
                .antMatchers(PermitAllUrl.permitAllUrl()).permitAll()
                .anyRequest().authenticated();
    }


}
