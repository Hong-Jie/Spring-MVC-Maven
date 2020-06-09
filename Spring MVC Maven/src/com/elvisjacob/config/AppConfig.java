package com.elvisjacob.config;

import javax.sql.DataSource;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.datasource.DriverManagerDataSource;

import com.elvisjacob.DAO.AppDAOImpl;

@Configuration
public class AppConfig {

	@Bean
	public DataSource getDataSource() {
		
		DriverManagerDataSource dataSource = new DriverManagerDataSource();
		dataSource.setDriverClassName("com.mysql.jdbc.Driver");
		dataSource.setUrl("jdbc:mysql://localhost:3306/project");
		dataSource.setUsername("root");
		dataSource.setPassword("password");
		
		return dataSource;
	}
	
	@Bean(name="BeanDAO")
	public AppDAOImpl AppDAO() {
		return new AppDAOImpl(getDataSource());
	}
}
