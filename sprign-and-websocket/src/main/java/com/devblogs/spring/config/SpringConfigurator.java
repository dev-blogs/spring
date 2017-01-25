package com.devblogs.spring.config;

import org.glassfish.tyrus.server.Server;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import com.devblogs.websocket.WebSocketEndpoint;
import com.devblogs.websocket.config.ServerWebsocketConfig;
import com.devblogs.websocket.config.SpringComponentProvider;

@Configuration
@ComponentScan("com.devblogs")
public class SpringConfigurator {
	@Bean
	public WebSocketEndpoint webSocketEndpoint() {
		return new WebSocketEndpoint();
	}
	
	@Bean
    public SpringComponentProvider springComponentProvider() {
        return new SpringComponentProvider();
    }
	
	@Bean
    public Server server() {
        return new Server("localhost", 9003, "/context", ServerWebsocketConfig.class);
    }
}