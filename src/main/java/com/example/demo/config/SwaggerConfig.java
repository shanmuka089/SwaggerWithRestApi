package com.example.demo.config;

import java.util.Collections;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

@Configuration		
@EnableSwagger2
public class SwaggerConfig {

	@Bean
	public Docket getDocket() {
		return new Docket(DocumentationType.SWAGGER_2)
				.select()
				.apis(RequestHandlerSelectors.basePackage("com.example.demo.controller"))
				.paths(PathSelectors.ant("/api/**"))
				.build()
				.apiInfo(apiDetails());
	}
	
	private ApiInfo apiDetails() {
		return new ApiInfo(
				"Air India App",
				"sample api for air india booking",
				"1.0",
				"Free to use",
				new springfox.documentation.service.Contact("shanmukha", "http://airIndia.io", "shanmuka089@gmail.com"),
				"Api license",
				"http://airIndia.com",
				Collections.emptyList());
	}
	
	
}
