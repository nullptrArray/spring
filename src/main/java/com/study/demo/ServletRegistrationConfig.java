package com.study.demo;

import org.springframework.boot.web.servlet.ServletRegistrationBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ServletRegistrationConfig {
    @Bean
    public ServletRegistrationBean<Servlet> getServletRegistrationBean() {
        ServletRegistrationBean<Servlet> servlet = new ServletRegistrationBean<>(new Servlet());
        servlet.addUrlMappings("/init");

        return servlet;
    }
}
