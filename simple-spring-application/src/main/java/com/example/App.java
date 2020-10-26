package com.example;

import org.springframework.context.support.GenericXmlApplicationContext;

public class App {
	public static void main(String[] args) {
		GenericXmlApplicationContext context = new GenericXmlApplicationContext();
		context.load("classpath:context.xml");
		context.refresh();
		
		MessageProvider messageProvider = (MessageProvider) context.getBean("messageProvider");
		System.out.println(messageProvider.getMessage());
	}
}