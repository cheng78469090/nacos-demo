package com.atguigu.nacosconsumer.controller;

import com.atguigu.nacosconsumer.feign.ProvideFeign;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * @Auther: 宋金城
 * @Date: 2019/12/30 11:31
 * @Description:
 */
@RestController
public class ConsumerController {
    @Autowired
    private ProvideFeign provideFeign;

    @GetMapping(value = "/hellow")
    public String hellow(){

        return "hello consumer:"+this.provideFeign.hi();
    }
}
