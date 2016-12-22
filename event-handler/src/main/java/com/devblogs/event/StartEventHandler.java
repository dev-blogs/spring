package com.devblogs.event;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationListener;
import org.springframework.context.event.ContextRefreshedEvent;
import org.springframework.stereotype.Service;

@Service
public class StartEventHandler implements ApplicationListener<ContextRefreshedEvent> {
	@Autowired
	private Publisher publisher;
	
	public void onApplicationEvent(ContextRefreshedEvent event) {
		System.out.println("StartEventHandler listener");
		publisher.publish("test message1");
		publisher.publish("test message2");
	}
}