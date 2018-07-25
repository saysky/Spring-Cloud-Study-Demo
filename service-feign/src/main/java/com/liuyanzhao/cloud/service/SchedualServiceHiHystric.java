package com.liuyanzhao.cloud.service;

import org.springframework.stereotype.Component;

/**
 * @author 言曌
 * @date 2018/7/24 下午4:36
 */

@Component
public class SchedualServiceHiHystric implements SchedualServiceHi {
    @Override
    public String sayHiFromClientOne(String name) {
        return "sorry "+name;
    }
}
