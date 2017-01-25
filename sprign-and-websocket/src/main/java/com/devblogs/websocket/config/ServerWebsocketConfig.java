package com.devblogs.websocket.config;

import java.util.HashSet;
import java.util.Set;
import javax.websocket.Endpoint;
import javax.websocket.server.ServerApplicationConfig;
import javax.websocket.server.ServerEndpointConfig;
import com.devblogs.websocket.AnotherWebSocketEndpoint;
import com.devblogs.websocket.WebSocketEndpoint;

public class ServerWebsocketConfig implements ServerApplicationConfig {
    public Set<ServerEndpointConfig> getEndpointConfigs(Set<Class<? extends Endpoint>> endpointClasses) {
        Set<ServerEndpointConfig> configs = new HashSet<ServerEndpointConfig>();        
        
        ServerEndpointConfig serverEndpointConfig = ServerEndpointConfig.Builder.create(WebSocketEndpoint.class, "/echo").build();
        ServerEndpointConfig anotherServerEndpointConfig = ServerEndpointConfig.Builder.create(AnotherWebSocketEndpoint.class, "/another").build();
        
        configs.add(serverEndpointConfig);
        configs.add(anotherServerEndpointConfig);
        
        return configs;
    }

    public Set<Class<?>> getAnnotatedEndpointClasses(Set<Class<?>> scanned) {
        return null;
    }
}