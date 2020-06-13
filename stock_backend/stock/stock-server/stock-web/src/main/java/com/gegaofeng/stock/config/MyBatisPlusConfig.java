package com.gegaofeng.stock.config;

import com.baomidou.mybatisplus.extension.plugins.PaginationInterceptor;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
/**
 * MyBatisPlusConfig
 *
 * @author Feng
 * @version 1.0   2020-05-29 21:56
 */
@Configuration
public class MyBatisPlusConfig {
//    mybatis-plus分页插件
    @Bean
    public PaginationInterceptor paginationInterceptor(){
        PaginationInterceptor paginationInterceptor=new PaginationInterceptor();
        return paginationInterceptor;
    }
}
