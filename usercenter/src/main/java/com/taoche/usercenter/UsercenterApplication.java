package com.taoche.usercenter;
import com.taoche.service.implement.UserService;

import com.alibaba.fastjson.JSON;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class UsercenterApplication {

	public static void main(String[] args) {

		UserService userService = new UserService();
		System.out.println(userService.hello("guohuawei"));
		SpringApplication.run(UsercenterApplication.class, args);
	}
}
