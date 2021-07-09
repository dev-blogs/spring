package com.devblogs.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import com.devblogs.beans.SomeBean;

@Configuration
public class Config {
	@Bean
	public SomeBean bean() {
		return new SomeBean("test bean");
	}
}