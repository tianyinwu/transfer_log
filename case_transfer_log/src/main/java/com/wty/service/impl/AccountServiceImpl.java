package com.wty.service.impl;

import com.wty.dao.AccountDao;
import com.wty.dao.LogDao;
import com.wty.service.AccountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AccountServiceImpl implements AccountService {
    @Autowired  // 自动装配AccountDao类
    private AccountDao accountDao;

    @Autowired
    private LogDao logDao;  // 直接调用dao层了，因为根本就没什么业务逻辑

    // 转账逻辑实现类
    @Override
    public void transfer(String people1, String people2, int money) {
        // 做减的业务逻辑
        accountDao.minus(people1, money);

        // 做加的业务逻辑
        accountDao.add(people2, money);

        // 做log的业务逻辑
        logDao.log(people1 + "向" + people2 + "转了" + money + "元");

    }
}
