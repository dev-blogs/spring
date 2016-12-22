package com.devblogs.event;

import org.springframework.context.ApplicationListener;
import org.springframework.stereotype.Service;

@Service
public class MessageEventListener implements ApplicationListener<MessageEvent> {
	public void onApplicationEvent(MessageEvent event) {
		MessageEvent msgEvt = (MessageEvent) event;
		System.out.println("Received: " + msgEvt.getMessage());
	}
}