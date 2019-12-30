package com.atguigu.nacosconsumer.feign;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

/**
 * @Auther: 宋金城
 * @Date: 2019/12/30 13:05
 * @Description:
 */
@FeignClient("nacos-provide")
public interface ProvideFeign {

    @GetMapping(value = "/hi")
    public String hi();
}
