package com.wty.dao;

import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Update;
import org.springframework.stereotype.Repository;

@Repository  // 使得spring能扫到这个bean
public interface AccountDao {
    // 钱增加逻辑(没有-=写法！)
    @Update("update tbl_account set money = money - #{money} where name = #{name}")
    void minus(@Param("name") String in,@Param("money") int money);

    // 钱减少逻辑
    @Update("update tbl_account set money = money + #{money} where name = #{name}")
    void add(@Param("name") String out,@Param("money") int money);
}
