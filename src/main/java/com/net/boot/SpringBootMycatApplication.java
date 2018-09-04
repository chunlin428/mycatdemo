package com.net.boot;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com.net.boot.mapper")
public class SpringBootMycatApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringBootMycatApplication.class, args);
	}
}
