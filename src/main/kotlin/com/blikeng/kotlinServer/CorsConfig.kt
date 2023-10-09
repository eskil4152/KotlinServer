package com.blikeng.kotlinServer

import org.springframework.context.annotation.Configuration
import org.springframework.web.servlet.config.annotation.CorsRegistry
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer

@Configuration
class CorsConfig: WebMvcConfigurer {

    override fun addCorsMappings(registry: CorsRegistry) {
        registry.addMapping("/**")
                .allowedOrigins("http://localhost:1234")
                .allowedMethods("GET", "POST", "DELETE")
                .allowCredentials(true)
    }
}