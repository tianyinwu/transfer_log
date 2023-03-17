package com.wty.service;


import com.wty.config.SpringConfig;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;


// 要获得springConfig得信息,以及加载spring的测试环境
@RunWith(SpringJUnit4ClassRunner.class)  // 加载单元测试？
@ContextConfiguration(classes = SpringConfig.class)  // 加载上下文配置环境
public class ServiceTest {

    @Autowired
    private AccountService accountService;

    @Test
    public void test(){
        // 做测试了
        accountService.transfer("Tony", "Jerry", 10000);
    }
}
