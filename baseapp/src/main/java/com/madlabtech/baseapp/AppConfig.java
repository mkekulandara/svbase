package com.madlabtech.baseapp;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.support.SpringBootServletInitializer;
import org.springframework.context.annotation.ComponentScan;

/**
 * Created by Madhukara on 5/22/17.
 */
@SpringBootApplication
@EnableAutoConfiguration
@ComponentScan
public class AppConfig extends SpringBootServletInitializer {

    @Override
    protected SpringApplicationBuilder configure(SpringApplicationBuilder application) {
        return application.sources(AppConfig.class);
    }

    public static void main(String[] args) throws Exception{
        SpringApplication.run(AppConfig.class,args);
    }
}
