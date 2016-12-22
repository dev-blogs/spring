package com.devblogs.event;

import org.springframework.beans.BeansException;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.stereotype.Service;

@Service
public class Publisher implements ApplicationContextAware {
	private ApplicationContext context;

	public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
		this.context = applicationContext;
	}
	
	public void publish(String message) {
		context.publishEvent(new MessageEvent(this, message));
	}
}