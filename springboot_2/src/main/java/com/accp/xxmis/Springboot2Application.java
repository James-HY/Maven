package com.accp.xxmis;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;

@SpringBootApplication
public class Springboot2Application extends SpringBootServletInitializer {

	//jar
	public static void main(String[] args) {
		SpringApplication.run(Springboot2Application.class, args);
	}

	//war
	@Override
	public SpringApplicationBuilder configure(SpringApplicationBuilder builder) {
		return builder.sources(Springboot2Application.class);
	}
}
