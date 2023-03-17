package com.wty.dao;

import org.apache.ibatis.annotations.Insert;
import org.springframework.stereotype.Repository;

@Repository
public interface LogDao {
    // 插入交易信息
    @Insert("insert into tbl_log (info, createDate) values(#{info}, now())")
    void log(String info);
}
