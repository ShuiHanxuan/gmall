package com.atguigu.gmall.wms.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;

/**
 * @Author 水寒轩
 * @Date 2020/9/5 10:52
 * @Version 1.0
 * 禁用Security,放行所有请求
 */
@Configuration
public class SecurityConfig extends WebSecurityConfigurerAdapter {
    @Override
    protected void configure(HttpSecurity http) throws Exception{
        http.authorizeRequests().antMatchers("/**").permitAll();
        http.csrf().disable();
    }


}
