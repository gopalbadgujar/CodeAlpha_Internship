package com.init;

import java.util.Properties;

import org.hibernate.cfg.Environment;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.datasource.DriverManagerDataSource;
import org.springframework.orm.hibernate5.LocalSessionFactoryBean;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.view.InternalResourceViewResolver;

import com.model.User;

@Configuration
@ComponentScan(basePackages = "com")
@EnableWebMvc
public class AppConfig {

	@Bean
	public InternalResourceViewResolver viewResolver() {
		InternalResourceViewResolver i = new InternalResourceViewResolver();

		i.setSuffix(".jsp");

		return i;

	}

	@Bean
	public DriverManagerDataSource ds() {

		DriverManagerDataSource ds = new DriverManagerDataSource();

		ds.setDriverClassName("com.mysql.jdbc.Driver");
		ds.setUrl("jdbc:mysql://localhost:3306/springMVCCodeAlpha");
		ds.setUsername("root");
		ds.setPassword("root");

		return ds;
	}

	@Bean
	public LocalSessionFactoryBean ls() {
		LocalSessionFactoryBean ls = new LocalSessionFactoryBean();

		ls.setDataSource(ds());

		Properties p = new Properties();
		p.setProperty(Environment.DIALECT, "org.hibernate.dialect.MySQLDialect");
		p.setProperty(Environment.SHOW_SQL, "true");
		p.setProperty(Environment.HBM2DDL_AUTO, "update");

		ls.setHibernateProperties(p);
		ls.setAnnotatedClasses(User.class);

		return ls;
	}

}
