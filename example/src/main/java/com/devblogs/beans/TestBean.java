package com.devblogs.beans;

import javax.annotation.PostConstruct;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import com.devblogs.params.Params;

@Component
public class TestBean {
	private SomeBean bean;
	@Autowired
	private Params params;
	
	public TestBean(SomeBean bean) {
		this.bean = bean;
	}
	
	@PostConstruct
	public void init() {
		assert params != null;
	}
	
	public SomeBean getBean() {
		return bean;
	}
}