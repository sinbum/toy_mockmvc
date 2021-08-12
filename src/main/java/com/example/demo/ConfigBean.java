package com.example.demo;

import javax.sql.DataSource;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Component;

import com.zaxxer.hikari.HikariConfig;
import com.zaxxer.hikari.HikariDataSource;
//
//@Configuration
//@PropertySource("classpath:/application.properties")
////@Component("com.example.demo.dao")
//public class ConfigBean {
//
//	@Bean
//	@ConfigurationProperties(prefix = "spring.datasource.hikari")
//	public HikariConfig hikariConfig() {
//		return new HikariConfig();
//	}
//	
//	@Bean
//	public DataSource datasource() {
//		DataSource dataSource = new HikariDataSource(hikariConfig());
//		System.out.println("config"+dataSource.toString());
//		return dataSource;
//	}
//	
//	
//}


@Configuration
@PropertySource("classpath:/application.properties") //src/main/resource/application.properties 파일을 가져옴
public class ConfigBean {
   @Bean
   @ConfigurationProperties(prefix = "spring.datasource.hikari")
   public HikariConfig hikariConfig() {
      return new HikariConfig();
   }
   
   @Bean(name = "ds")
   public DataSource dataSource() {
      DataSource dataSource = new HikariDataSource(hikariConfig());
      System.out.println("config test:"+dataSource);
      return dataSource;
   }
}
