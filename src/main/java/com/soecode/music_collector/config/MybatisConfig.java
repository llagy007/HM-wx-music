package com.soecode.music_collector.config;

import com.baomidou.mybatisplus.plugins.PaginationInterceptor;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @Author: liLong
 * @Description:
 * @Date: Created in 2018/8/21 17:31
 */
@Configuration
@MapperScan("com.atguigu.crud.dao")
public class MybatisConfig {
    static  void a(){
        System.out.println("jj");
    }
    /**
     * 分页插件
     *
     * @return PaginationInterceptor
     */
    @Bean
    public PaginationInterceptor paginationInterceptor() {
        return new PaginationInterceptor();
    }


}
