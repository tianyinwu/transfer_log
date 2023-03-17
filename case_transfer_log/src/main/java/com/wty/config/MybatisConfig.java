package com.wty.config;

import org.mybatis.spring.SqlSessionFactoryBean;
import org.mybatis.spring.mapper.MapperScannerConfigurer;
import org.springframework.context.annotation.Bean;

import javax.sql.DataSource;

public class MybatisConfig {
    // 配置sqlsessionFactory
    @Bean
    public SqlSessionFactoryBean sqlSessionFactoryBean(DataSource dataSource){
        SqlSessionFactoryBean ssfb = new SqlSessionFactoryBean();
        ssfb.setDataSource(dataSource);  // 设置datasource
        ssfb.setTypeAliasesPackage("com.wty.domain");  // 设置起别名，是对应于实体类呀!
        return ssfb;
    }

    // 配置dao映射,MapperScannerConfigurer就很像这个名字了
    @Bean
    public MapperScannerConfigurer mapperScannerConfigurer(){
        MapperScannerConfigurer msp = new MapperScannerConfigurer();
        msp.setBasePackage("com.wty.dao");
        return msp;
    }
}
