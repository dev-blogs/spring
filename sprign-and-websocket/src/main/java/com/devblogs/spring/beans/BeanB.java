package com.devblogs.spring.beans;

import org.springframework.stereotype.Component;

@Component
public class BeanB implements MyBean {
	public String getMessage() {
		return "beanB";
	}
}