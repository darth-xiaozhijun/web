package com.beifeng;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;


@SpringBootApplication
//@EnableAutoConfiguration(exclude = {DataSourceAutoConfiguration.class})
@MapperScan("com.beifeng.mapper")
public class Application {

	
	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);
	}
}
