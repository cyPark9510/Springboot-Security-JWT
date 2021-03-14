package com.pcy.jwt.config;

import org.springframework.boot.web.servlet.FilterRegistrationBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.pcy.jwt.filter.MyFirstFilter;
import com.pcy.jwt.filter.MySecondFilter;

@Configuration
public class FilterConfig {

	@Bean
	public FilterRegistrationBean<MyFirstFilter> firstFilter(){
		FilterRegistrationBean<MyFirstFilter> bean = new FilterRegistrationBean<>(new MyFirstFilter());
		bean.addUrlPatterns("/*");
		bean.setOrder(1);
		
		return bean;
	}
	
	@Bean
	public FilterRegistrationBean<MySecondFilter> secondFilter2(){
		FilterRegistrationBean<MySecondFilter> bean = new FilterRegistrationBean<>(new MySecondFilter());
		bean.addUrlPatterns("/*");
		bean.setOrder(0);  // 낮은 번호가 필터중에서 가장 먼저 실행됨. 
		
		return bean;
	}
}
