package com.devblogs.beans;

import org.springframework.stereotype.Component;

@Component
public class TestBean {
	private SomeBean bean;
	
	public TestBean(SomeBean bean) {
		this.bean = bean;
	}
	
	public SomeBean getBean() {
		return bean;
	}
}