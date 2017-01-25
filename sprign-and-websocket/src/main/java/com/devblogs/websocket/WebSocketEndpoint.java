package com.devblogs.websocket;

import java.io.IOException;

import javax.websocket.Endpoint;
import javax.websocket.EndpointConfig;
import javax.websocket.MessageHandler;
import javax.websocket.Session;
import org.springframework.beans.factory.annotation.Autowired;
import com.devblogs.spring.beans.MyBean;

public class WebSocketEndpoint extends Endpoint {
	@Autowired
	private MyBean beanA;
	
	@Autowired
	private MyBean beanB;
	
	@Override
    public void onOpen(final Session session, EndpointConfig config) {
        System.out.println("onOpen");
        MessageHandler messageHandler = new MessageHandler.Whole<String>() {
            public void onMessage(String message) {
            	System.out.println(beanA.getMessage());
            	System.out.println(beanB.getMessage());
                System.out.println("Message: " + message);
                try {
                	session.getBasicRemote().sendText("Echo: " + message);
                } catch (IOException e) {
                	e.printStackTrace();
                }
            }
        };
        session.addMessageHandler(messageHandler);
    }
}