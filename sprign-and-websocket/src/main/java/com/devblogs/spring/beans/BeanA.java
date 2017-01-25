package com.devblogs.spring.beans;

import org.springframework.stereotype.Component;

@Component
public class BeanA implements MyBean {
	public String getMessage() {
		return "beanA";
	}
}