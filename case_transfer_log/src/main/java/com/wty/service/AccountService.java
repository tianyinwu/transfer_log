package com.wty.service;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

public interface AccountService {
    @Transactional // 添加事务
    // 转账逻辑
    void transfer(String people1, String people2, int money);
}
