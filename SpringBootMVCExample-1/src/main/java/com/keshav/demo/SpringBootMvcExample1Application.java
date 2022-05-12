package com.keshav.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class SpringBootMvcExample1Application {

	public static void main(String[] args) {
		ApplicationContext ac=SpringApplication.run(SpringBootMvcExample1Application.class, args);
		MyController user=ac.getBean(MyController.class);
		user.home();
	}
}
