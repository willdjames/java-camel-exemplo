package com.meu.camel.exemplo.config;

import com.meu.camel.exemplo.camel.CamelContextWrapper;
import com.meu.camel.exemplo.service.ExemploService;
import org.apache.camel.builder.RouteBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AppConfig {

    @Bean
    public CamelContextWrapper camelContextWrapper(RouteBuilder... routeBuilders) throws Exception {
        return new CamelContextWrapper(routeBuilders);
    }

    @Bean
    public ExemploService exemploService(CamelContextWrapper camelContextWrapper){
        return new ExemploService(camelContextWrapper);
    }
}
