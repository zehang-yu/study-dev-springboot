package com.scut.demo.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

/**
 * implements WebMvcConfigurer实现了这和接口的类，就是SpringMVC的自定义配置类
 * @Configuration 是用于标识配置类的，
 */
@Configuration
public class WebMvcConfig implements WebMvcConfigurer {

    /**
     *
     * @param registry
     */
    @Override
    public void addCorsMappings(CorsRegistry registry) {
        registry.addMapping("/**")
                .allowedHeaders("Content-Type","X-Requested-With","accept,Origin","Access-Control-Request-Method","Access-Control-Request-Headers","token")
                .allowedMethods("*")
                .allowedOrigins("*");
    }
}
