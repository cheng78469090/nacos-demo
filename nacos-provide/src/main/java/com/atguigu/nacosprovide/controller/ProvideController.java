package com.atguigu.nacosprovide.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;

/**
 * @Auther: 宋金城
 * @Date: 2019/12/30 11:35
 * @Description:
 */
@RestController
@RefreshScope
public class ProvideController {
    @Value("${nihao}")
    private String sss;
    @Value("${myName}")
    private String name;
    @Value("${jdbc.url}")
    private String jdbcurl;
    @Value("${redis.url}")
    private String redisurl;
    @GetMapping(value = "/hi")
    public String hi(HttpServletRequest httpServletRequest){

        System.out.println(httpServletRequest.getRequestURI());
        return "hi provide"+name+",jdbc="+jdbcurl+",redis="+redisurl+",    后加的="+sss;
    }

}
