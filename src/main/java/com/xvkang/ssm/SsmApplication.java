package com.xvkang.ssm;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import com.baomidou.mybatisplus.extension.plugins.PaginationInterceptor;

@SpringBootApplication
@MapperScan("com.xvkang.ssm.mapper")
public class SsmApplication {

	public static void main(String[] args) {
		SpringApplication.run(SsmApplication.class, args);
	}
	/**
	 * mybatis定制化配置 目前采用的是 application.properties中的配置 没有使用这种方式
	 * 
	 * @return
	 */
//	@Bean
//	public ConfigurationCustomizer mybatisConfigurationCustomizer() {
//		return new ConfigurationCustomizer() {
//			@Override
//			public void customize(Configuration configuration) {
//				
//			}
//		};
//	}

	/**
	 * mybatis-plus 分页插件
	 */
	@Bean
	public PaginationInterceptor paginationInterceptor() {
		return new PaginationInterceptor();
	}

}
