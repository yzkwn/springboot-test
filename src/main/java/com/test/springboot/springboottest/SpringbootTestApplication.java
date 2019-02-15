package com.test.springboot.springboottest;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/*此注解是核心注解，开启springboot自动配置*/
@SpringBootApplication
public class SpringbootTestApplication {

	public static void main(String[] args) {
		//启动spring boot的程序，启动内嵌的tomcat启动，启动springboot容器
		SpringApplication.run(SpringbootTestApplication.class, args);
	}

}

