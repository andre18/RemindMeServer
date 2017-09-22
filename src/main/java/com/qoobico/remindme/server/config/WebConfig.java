package com.qoobico.remindme.server.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;

/**
 * Created by Andrew on 22.09.2017.
 */
/*
первая аннотация говорит о том, что данный класс является конфигурацией,
которую нужно выполнить перед тем как разворачивать контекст Spring'а
 */
@Configuration
/*
вторая аннотация говорит о том, что мы должны включить режим Web MVC,
что даст нам возможность использования контроллеров и таких штук, как REST котроллеров
 */
@EnableWebMvc
/*
ComponentScan говорит о том, где мы должны искать все наши бины, все наши классы, компоненты, сервисы, репозитории
 */
@ComponentScan("com.qoobico.remindme.server")
public class WebConfig extends WebMvcConfigurerAdapter{
}
