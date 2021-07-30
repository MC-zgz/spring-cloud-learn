package com.zgz.springcloud.config;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@MapperScan("com.zgz.springcloud.mapper")
public class MybatisConfig {
}
