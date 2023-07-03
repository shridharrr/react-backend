package com.project1.project1;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@Configuration
public class CorsConfig implements WebMvcConfigurer {

    @Override
    public void addCorsMappings(CorsRegistry registry) {
        registry.addMapping("/warehouses")
                .allowedOrigins("http://localhost:3001")
                .allowedMethods("GET"); // Specify the allowed HTTP methods, e.g., GET, POST, etc.
    }
}

