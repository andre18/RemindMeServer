package com.qoobico.remindme.server;

import com.qoobico.remindme.server.config.WebConfig;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.web.WebApplicationInitializer;
import org.springframework.web.context.ContextLoaderListener;
import org.springframework.web.context.WebApplicationContext;
import org.springframework.web.context.support.AnnotationConfigWebApplicationContext;
import org.springframework.web.servlet.DispatcherServlet;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.ServletRegistration;

/**
 * Created by Andrew on 22.09.2017.
 */
public class ApplicationInitializer implements WebApplicationInitializer{

    private final static String DISPATCHER = "dispatcher";

    //Данный метод говорит о том, что мы хотим выполнить какие-то действие перед тем или в момент того, как будет разворачиваться наш контекст
    public void onStartup(ServletContext servletContext) throws ServletException {
        //are creating context
        AnnotationConfigWebApplicationContext ctx = new AnnotationConfigWebApplicationContext();
        ctx.register(WebConfig.class);

        //context подгружается в servletContext
        servletContext.addListener(new ContextLoaderListener(ctx));

        ServletRegistration.Dynamic servlet = servletContext.addServlet(DISPATCHER, new DispatcherServlet(ctx));
        //указываем, по какому контекст руту будет доступно наше приложение
        servlet.addMapping("/");
        servlet.setLoadOnStartup(1);
    }
}
