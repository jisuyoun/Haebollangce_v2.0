package com.sist.haebollangce.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;
import org.springframework.web.servlet.config.annotation.ViewControllerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

/* 
 * 2025-01-23 최초 생성
 * 
 * WebConfig
*/
@Configuration
@EnableWebMvc
@ComponentScan(basePackages="com.sist.haebollangce")
public class WebConfig implements WebMvcConfigurer {
	
	// 기본 URL "/"을 "/mainPage"로 이동
	@Override
	public void addViewControllers(ViewControllerRegistry registry) {
		registry.addViewController("/").setViewName("redirect:/main/mainPage");
	}
	
	// css와 js, image 파일 경로 설정
	@Override
	public void addResourceHandlers(ResourceHandlerRegistry registry) {
        registry.addResourceHandler("/js/**")
            .addResourceLocations("classpath:/static/js/");
        registry.addResourceHandler("/css/**")
            .addResourceLocations("classpath:/static/css/");
        registry.addResourceHandler("/images/**")
            .addResourceLocations("classpath:/static/images/");
	}
}
