package com.spring.jdbc;

import javax.activation.DataSource;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.datasource.DriverManagerDataSource;

import com.spring.jdbc.dao.StudentDaoImpl;

@Configuration
@ComponentScan(basePackages="com.spring.jdbc.dao")
public class JdbcConfig {

	@Bean("ds")
	public DriverManagerDataSource getDataSource() {
		DriverManagerDataSource dSource=new DriverManagerDataSource();
		dSource.setDriverClassName("com.mysql.jdbc.Driver");
		dSource.setUrl("jdbc:mysql://localhost:3306/springjdbc");
		dSource.setUsername("root");
		dSource.setPassword("prasanta");
		return dSource;
	}
	
	@Bean("jdbcTemplate")
	public JdbcTemplate getTemplate() {
		JdbcTemplate jdbcTemplate=new JdbcTemplate();
		jdbcTemplate.setDataSource(getDataSource());
		return jdbcTemplate;
	}
	
//	@Bean("studentDao")
//	public StudentDaoImpl getStudentDao() {
//		StudentDaoImpl studentDaoImpl=new StudentDaoImpl();
//		studentDaoImpl.setJdbcTemplate(getTemplate());
//		return studentDaoImpl;
//	}
}
