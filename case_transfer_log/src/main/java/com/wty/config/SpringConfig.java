package com.wty.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;
import org.springframework.context.annotation.PropertySource;
import org.springframework.transaction.annotation.EnableTransactionManagement;

@Configuration  // 核心配置
@ComponentScan("com.wty")  // 扫描包下的component
@Import({JdbcConfig.class, MybatisConfig.class})  // 扫描其它两个config
@PropertySource("classpath:jdbc.properties")  // 扫描到jdbc.properties文件
@EnableTransactionManagement  // 让springConfig知道有事务了
public class SpringConfig {
}
