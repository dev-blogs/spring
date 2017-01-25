package com.devblogs;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import org.glassfish.tyrus.server.Server;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import com.devblogs.spring.config.SpringConfigurator;

public class App {
	public static void main(String[] args) {
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(SpringConfigurator.class);
        Server server = context.getBean(Server.class);
        
        try {
            server.start();
            BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
            while (true) {
                System.out.print("Enter \"stop\" to stop the server: ");
                String answer = reader.readLine();
                if (answer.equalsIgnoreCase("stop")) {
                    break;
                }
                System.out.println();
            }
        } catch (Exception e) {
            throw new RuntimeException(e);
        } finally {
            server.stop();
        }
	}
}