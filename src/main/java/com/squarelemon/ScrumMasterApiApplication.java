package com.squarelemon;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.jdbc.core.JdbcTemplate;

import javax.annotation.PostConstruct;
import javax.sql.DataSource;

@SpringBootApplication
public class ScrumMasterApiApplication {

	@Autowired
	DataSource dataSource;

	JdbcTemplate jdbcTemplate;
	public static void main(String[] args) {
		SpringApplication.run(ScrumMasterApiApplication.class, args);
	}

	@Bean
	JdbcTemplate jdbcTemplate(){
		this.jdbcTemplate = new JdbcTemplate();
		jdbcTemplate.setDataSource(dataSource);
		return jdbcTemplate;
	}
	@PostConstruct
	public void initDb(){
	}
}
