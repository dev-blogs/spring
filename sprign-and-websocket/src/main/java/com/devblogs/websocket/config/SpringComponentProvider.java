package com.devblogs.websocket.config;

import org.glassfish.tyrus.spi.ComponentProvider;
import org.springframework.beans.BeansException;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.util.ClassUtils;

public class SpringComponentProvider extends ComponentProvider implements ApplicationContextAware {
	public static ApplicationContext ctx;

    public boolean isApplicable(Class<?> c) {
        return ctx.containsBean(ClassUtils.getShortNameAsProperty(c));
    }

    public <T> T provideInstance(Class<T> c) {
        return ctx.getBean(c);
    }

    public boolean destroyInstance(Object o) {
        return false;
    }

    public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
        ctx = applicationContext;
    }
}