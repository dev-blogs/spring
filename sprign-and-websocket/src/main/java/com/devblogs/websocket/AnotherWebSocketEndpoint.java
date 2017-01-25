package com.devblogs.websocket;

import javax.websocket.Endpoint;
import javax.websocket.EndpointConfig;
import javax.websocket.MessageHandler;
import javax.websocket.Session;

public class AnotherWebSocketEndpoint extends Endpoint {
	@Override
    public void onOpen(Session session, EndpointConfig config) {
        System.out.println("onOpen");
        MessageHandler messageHandler = new MessageHandler.Whole<String>() {
            public void onMessage(String message) {
                System.out.println("Another message: " + message);
            }
        };
        session.addMessageHandler(messageHandler);
    }
}