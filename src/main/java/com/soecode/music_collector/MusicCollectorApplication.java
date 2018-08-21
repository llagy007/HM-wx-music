package com.soecode.music_collector;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan("com.atguigu.crud")
@MapperScan("com.atguigu.crud.dao.isrCustomer")
public class MusicCollectorApplication {

	public static void main(String[] args) {
		SpringApplication.run(MusicCollectorApplication.class, args);
	}
}
